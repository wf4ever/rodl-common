package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * Annotation Ontology.
 * 
 * @author piotrekhol
 * 
 */
public final class AO {

    /** namespace. */
    public static final String NAMESPACE = "http://purl.org/ao/";

    /** ontology model. */
    public static final OntModel ONT_MODEL = ModelFactory.createOntologyModel();

    /** ao:body. */
    public static final Property body = ONT_MODEL.getProperty(NAMESPACE + "body");

    /** ao:annotatesResource. */
    public static final Property annotatesResource = ONT_MODEL.getProperty(NAMESPACE + "annotatesResource");


    /**
     * Constructor.
     */
    private AO() {
        //nope
    }
}
