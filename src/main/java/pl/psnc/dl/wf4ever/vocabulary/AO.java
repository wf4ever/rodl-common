package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
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
    public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);

    /** ao:body. */
    public static final Property body = ONT_MODEL.createProperty(NAMESPACE + "body");

    /** ao:annotatesResource. */
    public static final Property annotatesResource = ONT_MODEL.createProperty(NAMESPACE + "annotatesResource");

    /** ao:Annotation. */
    public static final OntClass Annotation = ONT_MODEL.createClass(NAMESPACE + "Annotation");


    /**
     * Constructor.
     */
    private AO() {
        //nope
    }
}
