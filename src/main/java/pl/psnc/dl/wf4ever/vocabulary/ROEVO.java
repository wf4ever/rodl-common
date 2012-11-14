package pl.psnc.dl.wf4ever.vocabulary;

import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
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
    public static final OntModel ONT_MODEL = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, ModelFactory
            .createDefaultModel().read(NAMESPACE));

    /** roevo:LiveRO. */
    public static final OntClass LiveRO = ONT_MODEL.getOntClass(NAMESPACE + "LiveRO");

    /** roevo:SnapshotRO. */
    public static final OntClass SnapshotRO = ONT_MODEL.getOntClass(NAMESPACE + "SnapshotRO");

    /** roevo:ArchivedRO. */
    public static final OntClass ArchivedRO = ONT_MODEL.getOntClass(NAMESPACE + "ArchivedRO");

    /** roevo:ChangeSpecification. */
    public static final OntClass ChangeSpecification = ONT_MODEL.getOntClass(NAMESPACE + "ChangeSpecification");

    /** roevo:Change. */
    public static final OntClass Change = ONT_MODEL.getOntClass(NAMESPACE + "Change");

    /** roevo:Addition. */
    public static final OntClass Addition = ONT_MODEL.getOntClass(NAMESPACE + "Addition");

    /** roevo:Modification. */
    public static final OntClass Modification = ONT_MODEL.getOntClass(NAMESPACE + "Modification");

    /** roevo:Removal. */
    public static final OntClass Removal = ONT_MODEL.getOntClass(NAMESPACE + "Removal");

    /** roevo:isSnapshotOf. */
    public static final Property isSnapshotOf = ONT_MODEL.getProperty(NAMESPACE + "isSnapshotOf");

    /** roevo:hasSnapshot. */
    public static final Property hasSnapshot = ONT_MODEL.getProperty(NAMESPACE + "hasSnapshot");

    /** roevo:hasChange. */
    public static final Property hasChange = ONT_MODEL.getProperty(NAMESPACE + "hasChange");

    /** roevo:snapshottedAtTime. */
    public static final Property snapshottedAtTime = ONT_MODEL.getProperty(NAMESPACE + "snapshottedAtTime");

    /** roevo:archivedBy. */
    public static final Property archivedBy = ONT_MODEL.getProperty(NAMESPACE + "archivedBy");

    /** roevo:isArchiveOf. */
    public static final Property isArchiveOf = ONT_MODEL.getProperty(NAMESPACE + "isArchiveOf");

    /** roevo:hasArchive. */
    public static final Property hasArchive = ONT_MODEL.getProperty(NAMESPACE + "hasArchive");

    /** roevo:archivedAtTime. */
    public static final Property archivedAtTime = ONT_MODEL.getProperty(NAMESPACE + "archivedAtTime");

    /** roevo:snapshottedBy. */
    public static final Property snapshottedBy = ONT_MODEL.getProperty(NAMESPACE + "snapshottedBy");

    /** roevo:wasChangedBy. */
    public static final Property wasChangedBy = ONT_MODEL.getProperty(NAMESPACE + "wasChangedBy");

    /** roevo:relatedResource. */
    public static final Property relatedResource = ONT_MODEL.getProperty(NAMESPACE + "relatedResource");


    /**
     * Constructor.
     */
    private ROEVO() {
        //nope
    }
}
