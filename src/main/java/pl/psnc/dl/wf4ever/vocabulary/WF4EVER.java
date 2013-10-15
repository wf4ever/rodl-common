package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * ROTERM dictionary
 * 
 * @author pejot
 * 
 */
public class WF4EVER {

    /** namespace. */
    public static final String NAMESPACE = "http://purl.org/wf4ever/wf4ever#";

    /** ontology model. */
    public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);

    public static final Property rootURI = ONT_MODEL.createProperty(NAMESPACE + "rootURI");

}
