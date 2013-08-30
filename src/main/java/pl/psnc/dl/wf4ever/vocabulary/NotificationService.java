package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * Vocabulary for the notification service.
 * 
 * @see http://wf4ever-project.org/wiki/display/docs/Showcase+129.+The+notification+service
 * @author piotrekhol
 * 
 */
public final class NotificationService {

    /** namespace. */
    public static final String NAMESPACE = "http://purl.org/ro/service/notification/";

    /** ontology model. */
    public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);

    /** evo:copy. */
    public static final Property notifications = ONT_MODEL.createProperty(NAMESPACE + "notifications");


    /**
     * Constructor.
     */
    private NotificationService() {
        //nope
    }
}
