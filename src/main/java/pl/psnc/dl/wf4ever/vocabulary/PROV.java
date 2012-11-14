package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * W3 provenance ontology.
 * 
 * @author piotrekhol
 * 
 */
public final class PROV {

    /** namespace. */
    public static final String NAMESPACE = "http://www.w3.org/ns/prov#";

    /** ontology model. */
    public static final OntModel ONT_MODEL = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, ModelFactory
            .createDefaultModel().read(NAMESPACE));

    /** prov:hadOriginalSource. */
    public static final Property hadOriginalSource = ONT_MODEL.getProperty(NAMESPACE + "hadOriginalSource");


    /**
     * Constructor.
     */
    private PROV() {
        //nope
    }

}
