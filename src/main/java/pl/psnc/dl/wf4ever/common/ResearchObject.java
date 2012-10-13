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
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * A DAO for a research object.
 * 
 * @author piotrekhol
 * 
 */
@Entity
@Table(name = "research_objects")
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
    private String id;

    /** Hibernate session factory. */
    private static SessionFactory sessionFactory;


    /**
     * Constructor.
     */
    public ResearchObject() {

    }


    /**
     * Constructor.
     * 
     * 
     * @param sessionFactory
     *            Hibernate session factory
     * @param uri
     *            RO URI
     */
    public ResearchObject(SessionFactory sessionFactory, URI uri) {
        ResearchObject.sessionFactory = sessionFactory;
        setUri(uri.normalize());
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


    /**
     * Set the URI, as well as the id.
     * 
     * @param uri
     *            RO URI
     */
    public void setUri(URI uri) {
        this.uri = uri;
        String[] segments = uri.getPath().split("/");
        this.id = segments[segments.length - 1];
    }


    @Transient
    public URI getManifestUri() {
        return uri != null ? uri.resolve(MANIFEST_PATH) : null;
    }


    @Transient
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
        ResearchObject researchObject = (ResearchObject) session.get(ResearchObject.class, uri.toString());
        return researchObject;
    }


    /**
     * Persist the object in the database.
     */
    public void save() {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(this);
    }


    /**
     * Delete the object from the database.
     */
    public void delete() {
        Session session = sessionFactory.getCurrentSession();
        session.delete(this);
    }

}
