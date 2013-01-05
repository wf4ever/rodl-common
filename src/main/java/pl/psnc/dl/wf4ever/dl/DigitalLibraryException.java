package pl.psnc.dl.wf4ever.dl;

/**
 * A dLibra exception.
 * 
 * @author piotrhol
 * 
 */
public class DigitalLibraryException extends RodlException {

    /** id. */
    private static final long serialVersionUID = 8004921765200303834L;


    /**
     * Constructor.
     * 
     * @param e
     *            base exception
     */
    public DigitalLibraryException(Exception e) {
        super("An unknown exception", e);
    }

}
