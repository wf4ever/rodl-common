package pl.psnc.dl.wf4ever.model.RO;

import java.net.URI;

/**
 * ro:Resource.
 * 
 * @author piotrekhol
 * @author pejot
 */
public class Resource {

    /** resource URI. */
    protected URI uri;

    /** URI of a proxy of this resource. */
    protected URI proxyUri;


    /**
     * Constructor.
     */
    public Resource() {
    }


    /**
     * Constructor.
     * 
     * @param uri
     *            resource URI
     */
    public Resource(URI uri) {
        this.uri = uri;
    }


    public URI getUri() {
        return uri;
    }


    public void setUri(URI uri) {
        this.uri = uri;
    }


    public URI getProxyUri() {
        return proxyUri;
    }


    public void setProxyUri(URI proxyUri) {
        this.proxyUri = proxyUri;
    }
}
