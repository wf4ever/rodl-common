package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * ROTERM dictionary
 * 
 * @author pejot
 * 
 */
public class ROTERMS {

	/** namespace. */
	public static final String NAMESPACE = "http://purl.org/wf4ever/roterms#";

	/** ontology model. */
	public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);

	public static final Property performsTask = ONT_MODEL
			.createProperty(NAMESPACE + "performsTask");
	public static final Property requiresHardware = ONT_MODEL.createProperty(NAMESPACE
			+ "requiresHardware");
	public static final Property requiresSoftware = ONT_MODEL.createProperty(NAMESPACE
			+ "requiresSoftware");
	public static final Property requiresDataset = ONT_MODEL.createProperty(NAMESPACE
			+ "requiresDataset");
	public static final Property inputSelected = ONT_MODEL.createProperty(NAMESPACE
			+ "inputSelected");
	public static final Property exampleValue = ONT_MODEL
			.createProperty(NAMESPACE + "exampleValue");
	public static final Property defaultValue = ONT_MODEL
			.createProperty(NAMESPACE + "defaultValue");
	public static final Property ofSemanticType = ONT_MODEL.createProperty(NAMESPACE
			+ "ofSemanticType");
	public static final Property sampleSize = ONT_MODEL.createProperty(NAMESPACE + "sampleSize");
	public static final Property previousWorkflow = ONT_MODEL.createProperty(NAMESPACE
			+ "previousWorkflow");
	public static final Property subsequentWorkflow = ONT_MODEL.createProperty(NAMESPACE
			+ "subsequentWorkflow");
}
