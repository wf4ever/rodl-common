package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * Vocabulary for the notification service.
 * 
 * @see http 
 *      ://www.wf4ever-project.org/wiki/display/docs/Access+Control+Implementation
 *      +v2
 * @author pejot
 * 
 */
public final class AccessControlService {

	public static final String NAMESPACE = "http://purl.org/ro/accesscontrol/";
	public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);
	public static final Property permissions = ONT_MODEL.createProperty(NAMESPACE + "permissions");
	public static final Property modes = ONT_MODEL.createProperty(NAMESPACE + "modes");

	private AccessControlService() {
		// nope
	}
}
