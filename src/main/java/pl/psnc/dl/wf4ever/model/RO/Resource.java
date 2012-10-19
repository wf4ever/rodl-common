package pl.psnc.dl.wf4ever.model.RO;

import java.net.URI;

/**
 * Simple model of ro:resource.
 * 
 * @author pejot
 */
public class Resource {

    /** Resource id. */
    protected URI uri;


    /**
     * Constructor.
     * 
     * @param uri
     *            the resource uri
     * */
    public Resource(URI uri) {
        this.uri = uri;
    }


    public URI getUri() {
        return uri;
    }

}
