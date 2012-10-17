/**
 * 
 */
package pl.psnc.dl.wf4ever.common;

import java.net.URI;
import java.net.URISyntaxException;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;

/**
 * RODL user model.
 * 
 * @author piotrhol
 * 
 */
@Entity
@Table(name = "user_profiles")
public class UserProfile extends ActiveRecord {

    /** id. */
    private static final long serialVersionUID = -4468344863067565271L;


    /** Simple user privileges model. */
    public enum Role {
        /** Can do everything in RODL. */
        ADMIN,
        /** Can manipulate his own resources. */
        AUTHENTICATED,
        /** Anyone else. */
        PUBLIC
    }


    /** Logger. */
    private static final Logger LOG = Logger.getLogger(UserProfile.class);

    /** User login. */
    private String login;

    /** Nice name. */
    private String name;

    /** Role. */
    private Role role;

    /** User URI. */
    private URI uri;

    /** User homepage. */
    private URI homePage;


    /**
     * Constructor.
     */
    public UserProfile() {

    }


    /**
     * Constructor.
     * 
     * @param login
     *            login
     * @param name
     *            name
     * @param role
     *            role
     * @param uri
     *            uri
     */
    public UserProfile(String login, String name, Role role, URI uri) {
        super();
        this.login = login;
        this.name = name;
        this.role = role;
        this.uri = generateAbsoluteURI(uri, login);
    }


    /**
     * Constructor.
     * 
     * @param login
     *            login
     * @param name
     *            name
     * @param role
     *            role
     */
    public UserProfile(String login, String name, Role role) {
        this(login, name, role, null);
    }


    /**
     * Create an absolute URI.
     * 
     * @param uri
     *            user URI, may be null
     * @param login
     *            user login, may be null only if the URI is not null
     * @return absolute URI
     */
    public static URI generateAbsoluteURI(URI uri, String login) {
        if (uri == null) {
            try {
                uri = new URI(login);
            } catch (URISyntaxException e2) {
                try {
                    uri = new URI(null, login, null);
                } catch (URISyntaxException e) {
                    try {
                        uri = new URI(null, login.replaceAll("\\W", ""), null);
                    } catch (URISyntaxException e1) {
                        //impossible
                        LOG.error(e1);
                    }
                }
            }
        }
        if (!uri.isAbsolute()) {
            uri = URI.create("http://sandbox.wf4ever.project.com/users/").resolve(uri);
        }
        return uri;
    }


    public void setHomePage(URI uri) {
        this.homePage = uri;
    }


    @Basic
    public URI getHomePage() {
        return homePage;
    }


    public void setLogin(String login) {
        this.login = login;
    }


    @Id
    public String getLogin() {
        return login;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Basic
    public String getName() {
        return name;
    }


    public void setRole(Role role) {
        this.role = role;
    }


    @Basic
    public Role getRole() {
        return role;
    }


    public void setUri(URI uri) {
        this.uri = uri;
    }


    @Basic
    public URI getUri() {
        return uri;
    }


    /**
     * Find by user login.
     * 
     * @param login
     *            user login
     * @return user profile or null
     */
    public static UserProfile findByLogin(String login) {
        return findByPrimaryKey(UserProfile.class, login);
    }

}
