package pl.psnc.dl.wf4ever.dl;

import org.joda.time.DateTime;

/**
 * File metadata.
 * 
 * @author piotrhol
 * 
 */
public class ResourceMetadata {

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
    public ResourceMetadata() {

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
    public ResourceMetadata(String path, String name, String checksum, long sizeInBytes, String digestMethod,
            DateTime lastModified, String mimeType) {
        this.path = path;
        this.name = name;
        this.checksum = checksum;
        this.sizeInBytes = sizeInBytes;
        this.digestMethod = digestMethod;
        this.lastModified = lastModified;
        this.mimeType = mimeType;
    }


    public String getName() {
        return name;
    }


    public String getChecksum() {
        return checksum;
    }


    public long getSizeInBytes() {
        return sizeInBytes;
    }


    public String getDigestMethod() {
        return digestMethod;
    }


    public DateTime getLastModified() {
        return lastModified;
    }


    public String getMimeType() {
        return mimeType;
    }


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

}
