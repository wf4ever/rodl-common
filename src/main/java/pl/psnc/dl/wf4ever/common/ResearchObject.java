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

    /** RO URI. */
    private final URI uri;

    /** workspace id in dLibra. */
    private long dlWorkspaceId;

    /** RO id in dLibra. */
    private long dlROId;

    /** RO version id in dLibra. */
    private long dlROVersionId;


    /**
     * Constructor.
     * 
     * @param uri
     *            RO URI
     */
    public ResearchObject(URI uri) {
        this.uri = uri;
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


    public URI getUri() {
        return uri;
    }

}
