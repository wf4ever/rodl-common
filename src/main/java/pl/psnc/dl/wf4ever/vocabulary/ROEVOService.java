package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * Research Object evolution ontology.
 * 
 * @author piotrekhol
 * 
 */
public final class ROEVOService {

    /** namespace. */
    public static final String NAMESPACE = "http://purl.org/ro/service/evolution/";

    /** ontology model. */
    public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);

    /** evo:copy. */
    public static final Property copy = ONT_MODEL.createProperty(NAMESPACE + "copy");

    /** evo:finalize. */
    public static final Property finalize = ONT_MODEL.createProperty(NAMESPACE + "finalize");

    /** evo:info. */
    public static final Property info = ONT_MODEL.createProperty(NAMESPACE + "info");


    /**
     * Constructor.
     */
    private ROEVOService() {
        //nope
    }
}
