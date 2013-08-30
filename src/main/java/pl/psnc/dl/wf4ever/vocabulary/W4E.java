package pl.psnc.dl.wf4ever.vocabulary;

import org.apache.log4j.Logger;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.shared.PrefixMapping;
import com.hp.hpl.jena.util.FileManager;
import com.hp.hpl.jena.vocabulary.DCTerms;

/**
 * The base ontology models for RODL.
 * 
 * @author piotrekhol
 * 
 */
public final class W4E {

    /** Logger. */
    private static final Logger LOG = Logger.getLogger(W4E.class);

    /** A set of standard namespace prefixes. */
    public static final PrefixMapping STANDARD_NAMESPACES = PrefixMapping.Factory.create()
            .setNsPrefix("ore", ORE.NAMESPACE).setNsPrefix("ro", RO.NAMESPACE).setNsPrefix("roevo", ROEVO.NAMESPACE)
            .setNsPrefix("dcterms", DCTerms.NS).setNsPrefix("foaf", FOAF.NAMESPACE).lock();

    /** A Jena ontology model with common models loaded. */
    public static final OntModel DEFAULT_MODEL = ModelFactory.createOntologyModel(
        new OntModelSpec(OntModelSpec.OWL_MEM), ModelFactory.createDefaultModel());
    static {
        try {
            DEFAULT_MODEL.addSubModel(FileManager.get().loadModel(RO.NAMESPACE));
        } catch (Exception e) {
            LOG.error("Could not read RO model", e);
        }
        try {
            DEFAULT_MODEL.addSubModel(FileManager.get().loadModel(ROEVO.NAMESPACE));
        } catch (Exception e) {
            LOG.error("Could not read ROEVO model", e);
        }
    }


    /**
     * Constructor.
     */
    private W4E() {
        //nope
    }


    /**
     * Load the ontology model but don't fail if unavailable.
     * 
     * @param namespace
     *            model URI
     * @return Ontology model, empty in case of error
     */
    public static OntModel loadOntModel(String namespace) {
        try {
            return ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, FileManager.get().loadModel(namespace));
        } catch (Exception e) {
            LOG.error("Can't load namespace " + namespace, e);
            return ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
        }
    }

}
