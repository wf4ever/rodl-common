package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntModel;
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
    public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);

    /** prov:hadOriginalSource. */
    public static final Property hadOriginalSource = ONT_MODEL.getProperty(NAMESPACE + "hadOriginalSource");

    /** prov:wasRevisionOf. */
    public static final Property wasRevisionOf = ONT_MODEL.getProperty(NAMESPACE + "wasRevisionOf");

    /** prov:wasDerivedFrom. */
    public static final Property wasDerivedFrom = ONT_MODEL.getProperty(NAMESPACE + "wasDerivedFrom");


    /**
     * Constructor.
     */
    private PROV() {
        //nope
    }

}
