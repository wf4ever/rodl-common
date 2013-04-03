package pl.psnc.dl.wf4ever.preservation.model;

import java.net.URI;
import java.util.Map;

/**
 * Main object transfered between rodl and repository.
 * 
 * @author pejot
 * 
 */
public interface ResearchObjectSerializable {

    /**
     * Get serializable RO component (aggregated resources + resource maps).
     * 
     * @return the map of serializable components
     */
    Map<URI, ResearchObjectComponentSerializable> getSerializables();


    /**
     * Get RO name.
     * 
     * @return RO name
     */
    String getName();


    /**
     * Get RO URI.
     * 
     * @return RO uri
     */
    URI getUri();
}
