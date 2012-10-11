/**
 * 
 */
package pl.psnc.dl.wf4ever.common;

import java.net.URI;

/**
 * A DAO for a research object.
 * 
 * @author piotrekhol
 * 
 */
public class ResearchObject {

    /** Manifest path. */
    public static final String MANIFEST_PATH = ".ro/manifest.rdf";

    /** RO URI. */
    private final URI uri;

    /** workspace id in dLibra. */
    private long dlWorkspaceId;

    /** RO id in dLibra, default is 0. */
    private long dlROId = 0;

    /** RO version id in dLibra, default is 0. */
    private long dlROVersionId = 0;

    /** RO edition id in dLibra, default is 0. */
    private long dlEditionId = 0;

    /** id used in dLibra as a name. */
    private final String id;


    /**
     * Constructor.
     * 
     * @param uri
     *            RO URI
     */
    public ResearchObject(URI uri) {
        this.uri = uri.normalize();
        String[] segments = uri.getPath().split("/");
        this.id = segments[segments.length - 1];
    }


    public long getDlWorkspaceId() {
        return dlWorkspaceId;
    }


    public void setDlWorkspaceId(long dlWorkspaceId) {
        this.dlWorkspaceId = dlWorkspaceId;
    }


    public long getDlROId() {
        return dlROId;
    }


    public void setDlROId(long dlROId) {
        this.dlROId = dlROId;
    }


    public long getDlROVersionId() {
        return dlROVersionId;
    }


    public void setDlROVersionId(long dlROVersionId) {
        this.dlROVersionId = dlROVersionId;
    }


    public long getDlEditionId() {
        return dlEditionId;
    }


    public void setDlEditionId(long dlEditionId) {
        this.dlEditionId = dlEditionId;
    }


    public URI getUri() {
        return uri;
    }


    public URI getManifestUri() {
        return uri.resolve(MANIFEST_PATH);
    }


    public String getId() {
        return id;
    }


    /**
     * Load a research object or create a new instance.
     * 
     * @param uri
     *            RO URI
     * @return a research object with its URI set and other details loaded, if possible
     */
    public static ResearchObject get(URI uri) {
        return new ResearchObject(uri);
    }
}
