/**
 * 
 */
package pl.psnc.dl.wf4ever.dl;

/**
 * A value that is being added to RODL already exists.
 * 
 * @author piotrek
 * 
 */
public class ConflictException extends RodlException {

    /** id. */
    private static final long serialVersionUID = -3060338267583511733L;


    /**
     * Constructor.
     * 
     * @param message
     *            exception message
     */
    public ConflictException(String message) {
        super(message);
    }


    /**
     * Constructor.
     * 
     * @param message
     *            message
     * @param e
     *            original exception
     */
    public ConflictException(String message, Exception e) {
        super(message, e);
    }

}
