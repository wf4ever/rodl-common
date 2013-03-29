package pl.psnc.dl.wf4ever.preservation.model;

import java.io.InputStream;
import java.net.URI;

import org.openrdf.rio.RDFFormat;

import pl.psnc.dl.wf4ever.dl.ResourceMetadata;

/**
 * The research object component (every resource aggregated by RO).
 */
public interface ResearchObjectComponentSerializable {

    /**
     * Get the component URI.
     * 
     * @return component URI
     */
    URI getUri();


    /**
     * Return an RDF format specific URI.
     * 
     * @param format
     *            RDF format
     * @return the URI
     */
    URI getUri(RDFFormat format);


    /**
     * Get metadata about the component serialization.
     * 
     * @return the metadata
     */
    ResourceMetadata getStats();


    /**
     * Get the resource as it is stored serialized.
     * 
     * @return the input stream from the storage backend
     */
    InputStream getSerialization();


    /**
     * Get the resource as it is stored in the triplestore.
     * 
     * @param syntax
     *            RDF syntax
     * @return input stream from the manifest or null if not a named graph
     */
    InputStream getGraphAsInputStream(RDFFormat syntax);


    /**
     * Is the resource a named graph in the triplestore. True for manifest, annotation bodies and folder resource maps.
     * 
     * @return true if the resource is stored as a named graph
     */
    boolean isNamedGraph();


    /**
     * Get the preprocessed resource as it is stored in the triplestore.
     * 
     * @param syntax
     *            RDF syntax
     * @return input stream from the manifest or null if not a named graph
     */
    InputStream getPublicGraphAsInputStream(RDFFormat syntax);
}
