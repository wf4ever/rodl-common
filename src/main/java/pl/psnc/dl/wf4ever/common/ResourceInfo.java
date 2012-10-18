package pl.psnc.dl.wf4ever.common;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.joda.time.DateTime;

/**
 * File metadata.
 * 
 * @author piotrhol
 * 
 */
@Entity
@Table(name = "resource_infos")
public final class ResourceInfo extends ActiveRecord {

    /** id. */
    private static final long serialVersionUID = 6130642871779327154L;

    /** file path. */
    private String path;

    /** file name. */
    private String name;

    /** file checksum. */
    private String checksum;

    /** file checksum method. */
    private String digestMethod;

    /** file size in bytes. */
    private long sizeInBytes;

    /** last modification date. */
    private DateTime lastModified;

    /** MIME type. */
    private String mimeType;


    /**
     * Constructor.
     */
    private ResourceInfo() {

    }


    /**
     * Constructor.
     * 
     * @param path
     *            file path
     * @param name
     *            file name
     * @param checksum
     *            checksum
     * @param sizeInBytes
     *            size in bytes
     * @param digestMethod
     *            i.e. MD5, SHA1
     * @param lastModified
     *            date of last modification
     * @param mimeType
     *            MIME type
     */
    private ResourceInfo(String path, String name, String checksum, long sizeInBytes, String digestMethod,
            DateTime lastModified, String mimeType) {
        this.path = path;
        this.name = name;
        this.checksum = checksum;
        this.sizeInBytes = sizeInBytes;
        this.digestMethod = digestMethod;
        this.lastModified = lastModified;
        this.mimeType = mimeType;
    }


    /**
     * Load an instance or create a new one.
     * 
     * @param path
     *            file path
     * @param name
     *            file name
     * @param checksum
     *            checksum
     * @param sizeInBytes
     *            size in bytes
     * @param digestMethod
     *            i.e. MD5, SHA1
     * @param lastModified
     *            date of last modification
     * @param mimeType
     *            MIME type
     * @return an instance
     */
    public static ResourceInfo create(String path, String name, String checksum, long sizeInBytes, String digestMethod,
            DateTime lastModified, String mimeType) {
        ResourceInfo res = findByPath(path);
        if (res == null) {
            return new ResourceInfo(path, name, checksum, sizeInBytes, digestMethod, lastModified, mimeType);
        } else {
            return res;
        }
    }


    @Basic
    public String getName() {
        return name;
    }


    @Basic
    public String getChecksum() {
        return checksum;
    }


    @Basic
    public long getSizeInBytes() {
        return sizeInBytes;
    }


    @Basic
    public String getDigestMethod() {
        return digestMethod;
    }


    @Transient
    public DateTime getLastModified() {
        return lastModified;
    }


    @Basic
    public long getLastModifiedInMilis() {
        return lastModified != null ? lastModified.getMillis() : null;
    }


    public void setLastModifiedInMilis(long milis) {
        lastModified = new DateTime(milis);
    }


    @Basic
    public String getMimeType() {
        return mimeType;
    }


    @Id
    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }


    public void setDigestMethod(String digestMethod) {
        this.digestMethod = digestMethod;
    }


    public void setSizeInBytes(long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }


    public void setLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
    }


    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Find by file path.
     * 
     * @param path
     *            file path
     * @return resource info or null
     */
    public static ResourceInfo findByPath(String path) {
        return findByPrimaryKey(ResourceInfo.class, path);
    }

}
