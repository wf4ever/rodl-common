/**
 * 
 */
package pl.psnc.dl.wf4ever.common;

import java.net.URI;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * A DAO for a research object.
 * 
 * @author piotrekhol
 * 
 */
@Entity
public class ResearchObject {

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

    /** id used in dLibra as a name. */
    private final String id;

    /** Hibernate session factory. */
    private static SessionFactory sessionFactory;


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
    public URI getUri() {
        return uri;
    }


    public void setUri(URI uri) {
        this.uri = uri;
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
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        ResearchObject researchObject = (ResearchObject) session.get(ResearchObject.class, uri);

        session.getTransaction().commit();

        return researchObject;
    }

}
