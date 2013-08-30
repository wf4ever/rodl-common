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
    public static final OntClass ResearchObject = ONT_MODEL.createClass(NAMESPACE + "ResearchObject");

    /** ro:Manifest. */
    public static final OntClass Manifest = ONT_MODEL.createClass(NAMESPACE + "Manifest");

    /** ro:Resource. */
    public static final OntClass Resource = ONT_MODEL.createClass(NAMESPACE + "Resource");

    /** ro:Folder. */
    public static final OntClass Folder = ONT_MODEL.createClass(NAMESPACE + "Folder");

    /** ro:FolderEntry. */
    public static final OntClass FolderEntry = ONT_MODEL.createClass(NAMESPACE + "FolderEntry");

    /** ro:AggregatedAnnotation. */
    public static final OntClass AggregatedAnnotation = ONT_MODEL.createClass(NAMESPACE + "AggregatedAnnotation");

    /** ro:annotatesAggregatedAnnotation. */
    public static final Property annotatesAggregatedResource = ONT_MODEL.createProperty(NAMESPACE
            + "annotatesAggregatedResource");

    /** ro:entryName. */
    public static final Property entryName = ONT_MODEL.createProperty(NAMESPACE + "entryName");

    /** ro:rootFolder. */
    public static final Property rootFolder = ONT_MODEL.createProperty(NAMESPACE + "rootFolder");

    /** ro:name, not really declared in the ontology. */
    public static final Property name = ONT_MODEL.createProperty(NAMESPACE + "name");

    /** ro:filesize, not really declared in the ontology. */
    public static final Property filesize = ONT_MODEL.createProperty(NAMESPACE + "filesize");

    /** ro:checksum, not really declared in the ontology. */
    public static final Property checksum = ONT_MODEL.createProperty(NAMESPACE + "checksum");

    /** ro:uploadAZip, not really declared in the ontology. */
    public static final Property uploadAZip = ONT_MODEL.createProperty(NAMESPACE + "uploadAZip");

    /** ro:createFromZip, not really declared in the ontology. */
    public static final Property createFromZip = ONT_MODEL.createProperty(NAMESPACE + "createFromZip");


    /**
     * Constructor.
     */
    private RO() {
        //nope
    }
}
