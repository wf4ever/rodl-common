/**
 * 
 */
package pl.psnc.dl.wf4ever.common;

import java.net.URI;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.log4j.Logger;

/**
 * A DAO for a research object.
 * 
 * @author piotrekhol
 * 
 */
@Entity
@Table(name = "research_objects")
public final class ResearchObject extends ActiveRecord {

    /** id. */
    private static final long serialVersionUID = 9168888879916459732L;

    /** logger. */
    @SuppressWarnings("unused")
    private static final Logger LOGGER = Logger.getLogger(ResearchObject.class);

    /** Manifest path. */
    public static final String MANIFEST_PATH = ".ro/manifest.rdf";

    /** RO URI. */
    private URI uri;

    /** workspace id in dLibra. */
    private long dlWorkspaceId;

    /** RO id in dLibra, default is 0. */
    private long dlROId = 0;

    /** RO version id in dLibra, default is 0. */
    private long dlROVersionId = 0;

    /** RO edition id in dLibra, default is 0. */
    private long dlEditionId = 0;


    /**
     * Constructor.
     */
    private ResearchObject() {

    }


    /**
     * Constructor.
     * 
     * @param uri
     *            RO URI
     */
    private ResearchObject(URI uri) {
        setUri(uri.normalize());
    }


    /**
     * Load from database or create a new instance.
     * 
     * @param uri
     *            RO URI
     * @return an instance
     */
    public static ResearchObject create(URI uri) {
        ResearchObject result = ActiveRecord.create(ResearchObject.class, uri.toString());
        if (result == null) {
            return new ResearchObject(uri);
        }
        return result;
    }


    @Basic
    public long getDlWorkspaceId() {
        return dlWorkspaceId;
    }


    public void setDlWorkspaceId(long dlWorkspaceId) {
        this.dlWorkspaceId = dlWorkspaceId;
    }


    @Basic
    public long getDlROId() {
        return dlROId;
    }


    public void setDlROId(long dlROId) {
        this.dlROId = dlROId;
    }


    @Basic
    public long getDlROVersionId() {
        return dlROVersionId;
    }


    public void setDlROVersionId(long dlROVersionId) {
        this.dlROVersionId = dlROVersionId;
    }


    @Basic
    public long getDlEditionId() {
        return dlEditionId;
    }


    public void setDlEditionId(long dlEditionId) {
        this.dlEditionId = dlEditionId;
    }


    @Id
    @Column(name = "uri")
    public String getUriString() {
        return uri.toString();
    }


    /**
     * Set URI and id.
     * 
     * @param uriString
     *            RO URI as String
     */
    public void setUriString(String uriString) {
        setUri(URI.create(uriString));
    }


    @Transient
    public URI getUri() {
        return uri;
    }


    public void setUri(URI uri) {
        this.uri = uri;
    }


    @Transient
    public URI getManifestUri() {
        return uri != null ? uri.resolve(MANIFEST_PATH) : null;
    }


    /**
     * Find a research object in the database.
     * 
     * @param uri
     *            RO URI
     * @return research object or null
     */
    public static ResearchObject findByUri(URI uri) {
        return findByPrimaryKey(ResearchObject.class, uri.toString());
    }

}
