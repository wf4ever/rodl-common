package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
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
    public static final OntModel ONT_MODEL = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);

    /** evo:copy. */
    public static final Property notifications = ONT_MODEL.getProperty(NAMESPACE + "notifications");


    /**
     * Constructor.
     */
    private NotificationService() {
        //nope
    }
}
