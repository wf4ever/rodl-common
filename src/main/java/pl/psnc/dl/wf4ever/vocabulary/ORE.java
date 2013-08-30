package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Property;

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
    public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);

    /** ore:Proxy. */
    public static final OntClass Proxy = ONT_MODEL.createClass(NAMESPACE + "Proxy");

    /** ore:describes. */
    public static final Property describes = ONT_MODEL.createProperty(NAMESPACE + "describes");

    /** ore:isDescribedBy. */
    public static final Property isDescribedBy = ONT_MODEL.createProperty(NAMESPACE + "isDescribedBy");

    /** ore:aggregates. */
    public static final Property aggregates = ONT_MODEL.createProperty(NAMESPACE + "aggregates");

    /** ore:proxyIn. */
    public static final Property proxyIn = ONT_MODEL.createProperty(NAMESPACE + "proxyIn");

    /** ore:proxyFor. */
    public static final Property proxyFor = ONT_MODEL.createProperty(NAMESPACE + "proxyFor");

    /** ore:Aggregation. */
    public static final OntClass Aggregation = ONT_MODEL.createClass(NAMESPACE + "Aggregation");

    /** ore:AggregatedResource. */
    public static final OntClass AggregatedResource = ONT_MODEL.createClass(NAMESPACE + "AggregatedResource");

    /** ore:ResourceMap. */
    public static final OntClass ResourceMap = ONT_MODEL.createClass(NAMESPACE + "ResourceMap");

    /** ore:isAggregatedBy. */
    public static final Property isAggregatedBy = ONT_MODEL.createProperty(NAMESPACE + "isAggregatedBy");


    /**
     * Constructor.
     */
    private ORE() {
        //nope
    }

}
