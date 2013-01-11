package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.util.FileManager;

/**
 * Object Reuse and Exchange ontology.
 * 
 * @author piotrekhol
 * 
 */
public final class ORE {

    /** namespace. */
    public static final String NAMESPACE = "http://www.openarchives.org/ore/terms/";

    /** ontology model. */
    public static final OntModel ONT_MODEL = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, FileManager.get()
            .loadModel(NAMESPACE));

    /** ore:Proxy. */
    public static final OntClass Proxy = ONT_MODEL.getOntClass(NAMESPACE + "Proxy");

    /** ore:describes. */
    public static final Property describes = ONT_MODEL.getProperty(NAMESPACE + "describes");

    /** ore:isDescribedBy. */
    public static final Property isDescribedBy = ONT_MODEL.getProperty(NAMESPACE + "isDescribedBy");

    /** ore:aggregates. */
    public static final Property aggregates = ONT_MODEL.getProperty(NAMESPACE + "aggregates");

    /** ore:proxyIn. */
    public static final Property proxyIn = ONT_MODEL.getProperty(NAMESPACE + "proxyIn");

    /** ore:proxyFor. */
    public static final Property proxyFor = ONT_MODEL.getProperty(NAMESPACE + "proxyFor");

    /** ore:Aggregation. */
    public static final OntClass Aggregation = ONT_MODEL.getOntClass(NAMESPACE + "Aggregation");

    /** ore:AggregatedResource. */
    public static final OntClass AggregatedResource = ONT_MODEL.getOntClass(NAMESPACE + "AggregatedResource");

    /** ore:ResourceMap. */
    public static final OntClass ResourceMap = ONT_MODEL.getOntClass(NAMESPACE + "ResourceMap");

    /** ore:isAggregatedBy. */
    public static final Property isAggregatedBy = ONT_MODEL.getProperty(NAMESPACE + "isAggregatedBy");


    /**
     * Constructor.
     */
    private ORE() {
        //nope
    }

}
