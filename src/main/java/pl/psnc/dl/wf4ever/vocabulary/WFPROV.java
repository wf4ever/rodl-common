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
	public static final OntClass WorkflowRun = ONT_MODEL.createClass(NAMESPACE + "WorkflowRun");
	/** wfprov:Artifact. */
	public static final OntClass Artifact = ONT_MODEL.createClass(NAMESPACE + "Artifact");
	/** wfprov:ProcessRun. */
	public static final OntClass ProcessRun = ONT_MODEL.createClass(NAMESPACE + "ProcessRun");
	/** wfprov:WorkflowEngine. */
	public static final OntClass WorkflowEngine = ONT_MODEL.createClass(NAMESPACE
			+ "WorkflowEngine");

	/** wfprov:describedByParameter. */
	public static final Property describedByParameter = ONT_MODEL.createProperty(NAMESPACE
			+ "describedByParameter");
	/** wfprov:describedByProcess. */
	public static final Property describedByProcess = ONT_MODEL.createProperty(NAMESPACE
			+ "describedByProcess");
	/** wfprov:describedByWorkflow. */
	public static final Property describedByWorkflow = ONT_MODEL.createProperty(NAMESPACE
			+ "describedByWorkflow");
	/** wfprov:usedInput. */
	public static final Property usedInput = ONT_MODEL.createProperty(NAMESPACE + "usedInput");
	/** wfprov:wasEnactedBy. */
	public static final Property wasEnactedBy = ONT_MODEL
			.createProperty(NAMESPACE + "wasEnactedBy");
	/** wfprov:wasOutputFrom. */
	public static final Property wasOutputFrom = ONT_MODEL.createProperty(NAMESPACE
			+ "wasOutputFrom");
	/** wfprov:wasPartOfWorkflowRun. */
	public static final Property wasPartOfWorkflowRun = ONT_MODEL.createProperty(NAMESPACE
			+ "wasPartOfWorkflowRun");
	/** . */
	public static final Property durationInSeconds = ONT_MODEL.createProperty(NAMESPACE
			+ "durationInSeconds");

	/**
	 * Constructor.
	 */
	private WFPROV() {
		// nope
	}

}
