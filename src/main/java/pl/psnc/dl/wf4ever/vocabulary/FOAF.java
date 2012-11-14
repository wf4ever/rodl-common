package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
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
    public static final OntModel ONT_MODEL = ModelFactory.createOntologyModel(
        new OntModelSpec(OntModelSpec.OWL_MEM),
        ModelFactory.createDefaultModel().read(RO.NAMESPACE).read(ROEVO.NAMESPACE));

    /** foaf:Agent. */
    public static final OntClass Agent = ONT_MODEL.getOntClass(NAMESPACE + "Agent");

    /** foaf:Person. */
    public static final OntClass Person = ONT_MODEL.getOntClass(NAMESPACE + "Person");

    /** foaf:name. */
    public static final Property name = ONT_MODEL.getProperty(NAMESPACE + "name");


    /**
     * Constructor.
     */
    private FOAF() {
        //nope
    }

}
