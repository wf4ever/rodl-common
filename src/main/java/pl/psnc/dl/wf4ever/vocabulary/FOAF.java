package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * FOAF ontology.
 * 
 * @author piotrekhol
 * 
 */
public final class FOAF {

    /** namespace. */
    public static final String NAMESPACE = "http://xmlns.com/foaf/0.1/";

    /** ontology model. */
    public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);

    /** foaf:Agent. */
    public static final OntClass Agent = ONT_MODEL.createClass(NAMESPACE + "Agent");

    /** foaf:Person. */
    public static final OntClass Person = ONT_MODEL.createClass(NAMESPACE + "Person");

    /** foaf:name. */
    public static final Property name = ONT_MODEL.createProperty(NAMESPACE + "name");

    /** foaf:primaryTopic. */
    public static final Property primaryTopic = ONT_MODEL.createProperty(NAMESPACE + "primaryTopic");


    /**
     * Constructor.
     */
    private FOAF() {
        //nope
    }

}
