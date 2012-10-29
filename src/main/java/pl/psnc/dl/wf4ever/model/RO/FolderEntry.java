package pl.psnc.dl.wf4ever.model.RO;

import java.net.URI;

import pl.psnc.dl.wf4ever.model.ORE.Proxy;

/**
 * Represents an ro:FolderEntry.
 * 
 * @author piotrekhol
 * 
 */
public class FolderEntry extends Proxy {

    /** Name of the resource in the folder. */
    protected String entryName;


    /**
     * Default constructor.
     */
    public FolderEntry() {
        super();
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
        super();
        this.proxyFor = proxyFor;
        this.entryName = entryName;
    }


    public String getEntryName() {
        return entryName;
    }


    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

}
