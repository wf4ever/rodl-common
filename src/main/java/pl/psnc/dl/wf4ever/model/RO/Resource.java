package pl.psnc.dl.wf4ever.model.RO;

import java.net.URI;

/**
 * Simple Resource model.
 * 
 * @author pejot
 * 
 */
public class Resource {

    /** Resource uri. */
    protected URI uri;


    /**
     * Contructor.
     * 
     * @param uri
     *            reosurce uri
     */
    public Resource(URI uri) {
        this.uri = uri;
    }


    public URI getUri() {
        return uri;
    }

}
