package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;

/**
 * wfdesc onthology
 * 
 * @author pejot
 * 
 */
public class WFDESC {

	/** namespace. */
	public static final String NAMESPACE = "http://purl.org/wf4ever/wfdesc#";

	/** ontology model. */
	public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);
	/** . */
	public static final OntClass hasInput = ONT_MODEL.createClass(NAMESPACE + "hasInput");
	/** . */
	public static final OntClass hasOutput = ONT_MODEL.createClass(NAMESPACE + "hasOutput");
	/** . */
	public static final OntClass hasSubWorkflow = ONT_MODEL.createClass(NAMESPACE
			+ "hasSubWorkflow");
	/** . */
	public static final OntClass sampleSize = ONT_MODEL.createClass(NAMESPACE + "sampleSize");
	/** . */
	public static final OntClass runtime = ONT_MODEL.createClass(NAMESPACE + "runtime");
	/** . */
	public static final OntClass previousWorkflow = ONT_MODEL.createClass(NAMESPACE
			+ "previousWorkflow");
	/** . */
	public static final OntClass subsequentWorkflow = ONT_MODEL.createClass(NAMESPACE
			+ "subsequentWorkflow");
}
