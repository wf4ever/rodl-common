package pl.psnc.dl.wf4ever.model.RO;

import java.net.URI;
import java.util.List;

/**
 * ro:Folder.
 * 
 * @author piotrekhol
 * 
 */
public class Folder {

    /** folder URI. */
    private URI uri;

    /** folder entries. */
    private List<FolderEntry> folderEntries;


    public URI getUri() {
        return uri;
    }


    public void setUri(URI uri) {
        this.uri = uri;
    }


    public List<FolderEntry> getFolderEntries() {
        return folderEntries;
    }


    public void setFolderEntries(List<FolderEntry> folderEntries) {
        this.folderEntries = folderEntries;
    }
}
