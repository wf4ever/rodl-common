package pl.psnc.dl.wf4ever.vocabulary;

import org.apache.log4j.Logger;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.Syntax;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.shared.PrefixMapping;
import com.hp.hpl.jena.vocabulary.DCTerms;

public class W4E {

    /** Logger. */
    private static final Logger LOG = Logger.getLogger(W4E.class);

    public static final Syntax sparqlSyntax = Syntax.syntaxARQ;
    public static final PrefixMapping standardNamespaces = PrefixMapping.Factory.create()
            .setNsPrefix("ore", ORE.NAMESPACE).setNsPrefix("ro", RO.NAMESPACE).setNsPrefix("roevo", ROEVO.NAMESPACE)
            .setNsPrefix("dcterms", DCTerms.NS).setNsPrefix("foaf", FOAF.NAMESPACE).lock();
    public static final OntModel defaultModel = ModelFactory.createOntologyModel(
        new OntModelSpec(OntModelSpec.OWL_MEM), ModelFactory.createDefaultModel());
    static {
        try {
            defaultModel.read(RO.NAMESPACE);
        } catch (Exception e) {
            LOG.error("Could not read RO model", e);
        }
        try {
            defaultModel.read(ROEVO.NAMESPACE);
        } catch (Exception e) {
            LOG.error("Could not read ROEVO model", e);
        }
    }
}
