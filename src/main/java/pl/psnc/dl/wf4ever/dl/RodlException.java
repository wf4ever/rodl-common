package pl.psnc.dl.wf4ever.dl;

/**
 * Generic RODL exception.
 * 
 * @author piotrekhol
 * 
 */
public class RodlException extends RuntimeException {

    /** id. */
    private static final long serialVersionUID = 2157102296863571887L;


    /**
     * Constructor.
     * 
     * @param message
     *            message
     */
    public RodlException(String message) {
        super(message);
    }


    /**
     * Constructor.
     * 
     * @param message
     *            message
     * @param e
     *            parent exception
     */
    public RodlException(String message, Exception e) {
        super(message, e);
    }
}
