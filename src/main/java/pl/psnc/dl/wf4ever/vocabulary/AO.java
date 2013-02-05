package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.util.FileManager;

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
    public static final OntModel ONT_MODEL = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, FileManager.get()
            .loadModel(NAMESPACE));

    /** ao:body. */
    public static final Property body = ONT_MODEL.getProperty(NAMESPACE + "body");

    /** ao:annotatesResource. */
    public static final Property annotatesResource = ONT_MODEL.getProperty(NAMESPACE + "annotatesResource");

    /** ao:Annotation. */
    public static final OntClass Annotation = ONT_MODEL.getOntClass(NAMESPACE + "Annotation");


    /**
     * Constructor.
     */
    private AO() {
        //nope
    }
}
