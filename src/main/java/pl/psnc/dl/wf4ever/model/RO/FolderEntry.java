package pl.psnc.dl.wf4ever.model.RO;

import java.net.URI;

/**
 * Represents an ro:FolderEntry.
 * 
 * @author piotrekhol
 * 
 */
public class FolderEntry {

    /** folder entry URI. */
    private URI uri;

    /** URI of resource aggregated in the ro:Folder. */
    private URI proxyFor;

    /** Name of the resource in the folder. */
    private String entryName;


    /**
     * Default constructor.
     */
    public FolderEntry() {

    }


    /**
     * Constructor.
     * 
     * @param proxyFor
     *            URI of resource aggregated in the ro:Folder
     * @param entryName
     *            name of the resource in the folder
     */
    public FolderEntry(URI proxyFor, String entryName) {
        this.proxyFor = proxyFor;
        this.entryName = entryName;
    }


    public URI getProxyFor() {
        return proxyFor;
    }


    public void setProxyFor(URI proxyFor) {
        this.proxyFor = proxyFor;
    }


    public String getEntryName() {
        return entryName;
    }


    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }


    public URI getUri() {
        return uri;
    }


    public void setUri(URI uri) {
        this.uri = uri;
    }
}
