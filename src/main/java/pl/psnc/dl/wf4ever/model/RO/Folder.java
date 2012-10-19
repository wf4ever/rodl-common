package pl.psnc.dl.wf4ever.model.RO;

import java.net.URI;
import java.util.ArrayList;
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
    private List<FolderEntry> folderEntries = new ArrayList<>();


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


    /**
     * Return a URI of an RDF graph that describes the folder. If folder URI is null, return null. If folder URI path is
     * empty, return folder.ttl (i.e. example.com becomes example.com/folder.ttl). Otherwise use the last path segment
     * (i.e. example.com/foobar/ becomes example.com/foobar/foobar.ttl). Turtle file extension is used.
     * 
     * @return RDF graph URI or null if folder URI is null
     */
    public URI getFolderManifestUri() {
        if (uri == null) {
            return null;
        }
        if (uri.getPath() == null) {
            return uri.resolve("folder.ttl");
        }
        String[] segments = uri.getPath().split("/");
        return uri.resolve(segments[segments.length - 1] + ".ttl");
    }
}
