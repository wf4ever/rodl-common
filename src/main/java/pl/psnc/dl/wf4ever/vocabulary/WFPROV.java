package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * W3 provenance ontology.
 * 
 * @author piotrekhol
 * 
 */
public final class WFPROV {

    /** namespace. */
    public static final String NAMESPACE = "http://purl.org/wf4ever/wfprov#";

    /** ontology model. */
    public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);

    /** wfprov:WorkflowRun. */
    public static final OntClass WorkflowRun = ONT_MODEL.getOntClass(NAMESPACE + "WorkflowRun");
    /** wfprov:Artifact. */
    public static final OntClass Artifact = ONT_MODEL.getOntClass(NAMESPACE + "Artifact");
    /** wfprov:ProcessRun. */
    public static final OntClass ProcessRun = ONT_MODEL.getOntClass(NAMESPACE + "ProcessRun");
    /** wfprov:WorkflowEngine. */
    public static final OntClass WorkflowEngine = ONT_MODEL.getOntClass(NAMESPACE + "WorkflowEngine");

    /** wfprov:describedByParameter. */
    public static final Property describedByParameter = ONT_MODEL.getProperty(NAMESPACE + "describedByParameter");
    /** wfprov:describedByProcess. */
    public static final Property describedByProcess = ONT_MODEL.getProperty(NAMESPACE + "describedByProcess");
    /** wfprov:describedByWorkflow. */
    public static final Property describedByWorkflow = ONT_MODEL.getProperty(NAMESPACE + "describedByWorkflow");
    /** wfprov:usedInput. */
    public static final Property usedInput = ONT_MODEL.getProperty(NAMESPACE + "usedInput");
    /** wfprov:wasEnactedBy. */
    public static final Property wasEnactedBy = ONT_MODEL.getProperty(NAMESPACE + "wasEnactedBy");
    /** wfprov:wasOutputFrom. */
    public static final Property wasOutputFrom = ONT_MODEL.getProperty(NAMESPACE + "wasOutputFrom");
    /** wfprov:wasPartOfWorkflowRun. */
    public static final Property wasPartOfWorkflowRun = ONT_MODEL.getProperty(NAMESPACE + "wasPartOfWorkflowRun");


    /**
     * Constructor.
     */
    private WFPROV() {
        //nope
    }

}
