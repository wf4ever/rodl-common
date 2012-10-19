package pl.psnc.dl.wf4ever.model.RO;

import java.net.URI;

/**
 * Represents an ro:FolderEntry.
 * 
 * @author piotrekhol
 * 
 */
public class FolderEntry {

    /** URI of resource aggregated in the ro:Folder. */
    private URI proxyFor;

    /** Name of the resource in the folder. */
    private String entryName;


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
}
