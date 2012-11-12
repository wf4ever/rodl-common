package pl.psnc.dl.wf4ever.dl;

import java.net.URI;

/**
 * Research object interface for dLibra.
 * 
 * @author piotrekhol
 * 
 */
public interface DigitalPublication {

    /**
     * Get dLibra workspace id.
     * 
     * @return workspace id or 0 if not set
     */
    long getDlWorkspaceId();


    /**
     * Set dLibra workspace id.
     * 
     * @param dlWorkspaceId
     *            workspace id
     */
    void setDlWorkspaceId(long dlWorkspaceId);


    /**
     * Get dLibra RO id.
     * 
     * @return RO id or 0 if not set
     */
    long getDlROId();


    /**
     * Set dLibra RO id.
     * 
     * @param dlROId
     *            dLibra RO id
     */
    void setDlROId(long dlROId);


    /**
     * Get dLibra RO version id.
     * 
     * @return dLibra RO version id or 0 if not set
     */
    long getDlROVersionId();


    /**
     * Set dLibra RO version id.
     * 
     * @param dlROVersionId
     *            dLibra RO version id
     */
    void setDlROVersionId(long dlROVersionId);


    /**
     * Get dLibra edition id.
     * 
     * @return dLibra edition id or 0 if not set
     */
    long getDlEditionId();


    /**
     * Set dLibra edition id.
     * 
     * @param dlEditionId
     *            edition id
     */
    void setDlEditionId(long dlEditionId);


    /**
     * Get RO URI.
     * 
     * @return RO URI
     */
    URI getUri();


    /**
     * Set RO URI.
     * 
     * @param uri
     *            RO URI
     */
    void setUri(URI uri);

}
