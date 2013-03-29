package pl.psnc.dl.wf4ever.preservation.model;

import java.net.URI;
import java.util.Set;

/**
 * Main object transfered between rodl and repository.
 * 
 * @author pejot
 * 
 */
public interface ResearchObjectSerializable {

    /**
     * Get serializable RO component (aggregated resources + resource maps)
     * 
     * @return the set of serializable components
     */
    Set<ResearchObjectComponentSerializable> getSerializables();


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
