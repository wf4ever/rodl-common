/**
 * 
 */
package pl.psnc.dl.wf4ever.dl;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.log4j.Logger;

/**
 * dLibra user model.
 * 
 * @author piotrhol
 * 
 */
public class UserMetadata {

    /** Simple user privileges model. */
    public enum Role {
        /** Can do everything in RODL. */
        ADMIN,
        /** Can manipulate his own resources. */
        AUTHENTICATED,
        /** Anyone else. */
        PUBLIC
    }


    /** A profile representing the admin. */
    public static final UserMetadata ADMIN = new UserMetadata("admin", "admin", Role.ADMIN,
            URI.create("http://example.org/admin"));

    /** A profile representing an anonymous user. */
    public static final UserMetadata PUBLIC = new UserMetadata("public", "public user", Role.PUBLIC,
            URI.create("http://example.org/public"));

    /** Logger. */
    private static final Logger LOG = Logger.getLogger(UserMetadata.class);

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
    public UserMetadata() {

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
    public UserMetadata(String login, String name, Role role, URI uri) {
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
    public UserMetadata(String login, String name, Role role) {
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


    public URI getHomePage() {
        return homePage;
    }


    public void setLogin(String login) {
        this.login = login;
    }


    public String getLogin() {
        return login;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setRole(Role role) {
        this.role = role;
    }


    public Role getRole() {
        return role;
    }


    public void setUri(URI uri) {
        this.uri = uri;
    }


    public URI getUri() {
        return uri;
    }

}
