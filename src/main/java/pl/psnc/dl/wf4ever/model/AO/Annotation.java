package pl.psnc.dl.wf4ever.model.AO;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import pl.psnc.dl.wf4ever.model.RO.Resource;
import pl.psnc.dl.wf4ever.vocabulary.AO;
import pl.psnc.dl.wf4ever.vocabulary.RO;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Statement;

/**
 * Simple model of ao:annotation.
 * 
 * @author pejot
 * 
 */
public class Annotation extends Resource {

    /** List of resources annotated by this. */
    private List<Resource> annotated;
    /** The annotation body. */
    private AnnotationBody body;


    /**
     * Constructor.
     * 
     * @param uri
     *            the resource uri
     */
    public Annotation(URI uri) {
        super(uri);
        annotated = new ArrayList<Resource>();
        body = null;
    }


    /**
     * Constructor.
     * 
     * @param uri
     *            the resource uri
     * @param model
     *            the ontology model(for example manifest model)
     * @throws URISyntaxException
     *             annotated resource uri parse error
     */
    public Annotation(URI uri, OntModel model)
            throws URISyntaxException {
        this(uri);
        annotated = new ArrayList<Resource>();
        fillUp(model);
    }


    /**
     * Take body and annotated list from ontology model.
     * 
     * @param model
     *            the ontology model(for example manifest model)
     * @throws URISyntaxException
     *             annotated resource uri
     */
    public void fillUp(OntModel model)
            throws URISyntaxException {
        Individual source = model.getIndividual(uri.toString());
        for (Statement statement : source.listProperties(RO.annotatesAggregatedResource).toList()) {
            try {
                annotated.add(new Resource(new URI(statement.getObject().asResource().getURI())));
            } catch (URISyntaxException e) {
                throw e;
            }
        }
        try {
            body = new AnnotationBody(new URI(source.getPropertyValue(AO.body).asResource().getURI()));
        } catch (URISyntaxException e) {
            body = null;
        }
    }


    public List<Resource> getAnnotated() {
        return annotated;
    }


    /**
     * Get the list of annotated uri.
     * 
     * @return getAnnotated
     */
    public List<URI> getAnnotatedToURIList() {
        List<URI> result = new ArrayList<URI>();
        for (Resource r : annotated) {
            result.add(r.getUri());
        }
        return result;
    }


    public AnnotationBody getBody() {
        return body;
    }

}
