package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Property;

/**
 * Research Object evolution ontology.
 * 
 * @author piotrekhol
 * 
 */
public final class ROEVO {

    /** namespace. */
    public static final String NAMESPACE = "http://purl.org/wf4ever/roevo#";

    /** ontology model. */
    public static final OntModel ONT_MODEL = W4E.loadOntModel(NAMESPACE);

    /** roevo:LiveRO. */
    public static final OntClass LiveRO = ONT_MODEL.createClass(NAMESPACE + "LiveRO");

    /** roevo:SnapshotRO. */
    public static final OntClass SnapshotRO = ONT_MODEL.createClass(NAMESPACE + "SnapshotRO");

    /** roevo:ArchivedRO. */
    public static final OntClass ArchivedRO = ONT_MODEL.createClass(NAMESPACE + "ArchivedRO");

    /** roevo:ChangeSpecification. */
    public static final OntClass ChangeSpecification = ONT_MODEL.createClass(NAMESPACE + "ChangeSpecification");

    /** roevo:Change. */
    public static final OntClass Change = ONT_MODEL.createClass(NAMESPACE + "Change");

    /** roevo:Addition. */
    public static final OntClass Addition = ONT_MODEL.createClass(NAMESPACE + "Addition");

    /** roevo:Modification. */
    public static final OntClass Modification = ONT_MODEL.createClass(NAMESPACE + "Modification");

    /** roevo:Removal. */
    public static final OntClass Removal = ONT_MODEL.createClass(NAMESPACE + "Removal");

    /** roevo:isSnapshotOf. */
    public static final Property isSnapshotOf = ONT_MODEL.createProperty(NAMESPACE + "isSnapshotOf");

    /** roevo:hasSnapshot. */
    public static final Property hasSnapshot = ONT_MODEL.createProperty(NAMESPACE + "hasSnapshot");

    /** roevo:hasChange. */
    public static final Property hasChange = ONT_MODEL.createProperty(NAMESPACE + "hasChange");

    /** roevo:snapshotedAtTime. */
    public static final Property snapshotedAtTime = ONT_MODEL.createProperty(NAMESPACE + "snapshotedAtTime");

    /** roevo:archivedBy. */
    public static final Property archivedBy = ONT_MODEL.createProperty(NAMESPACE + "archivedBy");

    /** roevo:isArchiveOf. */
    public static final Property isArchiveOf = ONT_MODEL.createProperty(NAMESPACE + "isArchiveOf");

    /** roevo:hasArchive. */
    public static final Property hasArchive = ONT_MODEL.createProperty(NAMESPACE + "hasArchive");

    /** roevo:archivedAtTime. */
    public static final Property archivedAtTime = ONT_MODEL.createProperty(NAMESPACE + "archivedAtTime");

    /** roevo:snapshotedBy. */
    public static final Property snapshotedBy = ONT_MODEL.createProperty(NAMESPACE + "snapshotedBy");

    /** roevo:wasChangedBy. */
    public static final Property wasChangedBy = ONT_MODEL.createProperty(NAMESPACE + "wasChangedBy");

    /** roevo:relatedResource. */
    public static final Property relatedResource = ONT_MODEL.createProperty(NAMESPACE + "relatedResource");


    /**
     * Constructor.
     */
    private ROEVO() {
        //nope
    }
}
