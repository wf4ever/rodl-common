package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * Research Object ontology.
 * 
 * @author piotrekhol
 * 
 */
public final class RO {

    /** namespace. */
    public static final String NAMESPACE = "http://purl.org/wf4ever/ro#";

    /** ontology model. */
    public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);

    /** ro:ResearchObject. */
    public static final OntClass ResearchObject = ONT_MODEL.getOntClass(NAMESPACE + "ResearchObject");

    /** ro:Manifest. */
    public static final OntClass Manifest = ONT_MODEL.getOntClass(NAMESPACE + "Manifest");

    /** ro:Resource. */
    public static final OntClass Resource = ONT_MODEL.getOntClass(NAMESPACE + "Resource");

    /** ro:Folder. */
    public static final OntClass Folder = ONT_MODEL.getOntClass(NAMESPACE + "Folder");

    /** ro:FolderEntry. */
    public static final OntClass FolderEntry = ONT_MODEL.getOntClass(NAMESPACE + "FolderEntry");

    /** ro:AggregatedAnnotation. */
    public static final OntClass AggregatedAnnotation = ONT_MODEL.getOntClass(NAMESPACE + "AggregatedAnnotation");

    /** ro:annotatesAggregatedAnnotation. */
    public static final Property annotatesAggregatedResource = ONT_MODEL.getProperty(NAMESPACE
            + "annotatesAggregatedResource");

    /** ro:entryName. */
    public static final Property entryName = ONT_MODEL.getProperty(NAMESPACE + "entryName");

    /** ro:rootFolder. */
    public static final Property rootFolder = ONT_MODEL.getProperty(NAMESPACE + "rootFolder");

    /** ro:name, not really declared in the ontology. */
    public static final Property name = ONT_MODEL.getProperty(NAMESPACE + "name");

    /** ro:filesize, not really declared in the ontology. */
    public static final Property filesize = ONT_MODEL.getProperty(NAMESPACE + "filesize");

    /** ro:checksum, not really declared in the ontology. */
    public static final Property checksum = ONT_MODEL.getProperty(NAMESPACE + "checksum");

    /** ro:uploadAZip, not really declared in the ontology. */
    public static final Property uploadAZip = ONT_MODEL.getProperty(NAMESPACE + "uploadAZip");

    /** ro:createFromZip, not really declared in the ontology. */
    public static final Property createFromZip = ONT_MODEL.getProperty(NAMESPACE + "createFromZip");


    /**
     * Constructor.
     */
    private RO() {
        //nope
    }
}
