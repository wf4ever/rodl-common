package pl.psnc.dl.wf4ever.dl;

/**
 * Requested resource does not exist.
 * 
 * @author piotrek
 * 
 */
public class NotFoundException extends RodlException {

    /** id. */
    private static final long serialVersionUID = -3060338267583511733L;


    /**
     * Constructor.
     * 
     * @param message
     *            exception message
     */
    public NotFoundException(String message) {
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
    public NotFoundException(String message, Exception e) {
        super(message, e);
    }

}
