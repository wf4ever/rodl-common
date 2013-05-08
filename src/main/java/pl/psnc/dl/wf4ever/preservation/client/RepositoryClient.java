package pl.psnc.dl.wf4ever.preservation.client;

import java.net.URI;

import pl.psnc.dl.wf4ever.preservation.model.ResearchObjectSerializable;

/**
 * Provides methods to store retrieve data in the remote preservation repository.
 */
public interface RepositoryClient {

    /**
     * Get preserved RO from repository.
     * 
     * @param uri
     *            preserver resource uri (full path)
     * @return preserved Research Object
     */
    ResearchObjectSerializable getBlocking(URI uri);


    /**
     * Send to the preservation service the new instance of Research Object.
     * 
     * @param researchObject
     *            ResearchObject which is going to be preserved
     * @return status page uri
     */
    URI post(ResearchObjectSerializable researchObject);


    /**
     * Get the id of stored RO.
     * 
     * @param status
     *            status page
     * @return the new URI if RO was successfully created, null otherwise
     */
    URI postBlocking(URI status);


    /**
     * Remove an existing Research Object from preservation service.
     * 
     * @param uri
     *            the id of the element which is going to be deleted
     * @return status page uri
     */
    URI delete(URI uri);


    /**
     * Check if the the RO was successfully deleted.
     * 
     * @param status
     *            status page uri
     * @return
     */
    boolean deleteBlocking(URI status);


    /**
     * Update in the preservation service the instance of ResearchO bject.
     * 
     * @param researchObject
     *            new version (updated verion) of Research OBject sent to repository
     * @return status page uri
     */
    URI update(ResearchObjectSerializable researchObject);


    /**
     * Get the id of updated Research Object
     * 
     * @param status
     *            status page
     * @return the new URI if RO was successfully created, null otherwise
     */
    URI updateBlocking(URI status);

}
