/**
 * 
 */
package pl.psnc.dl.wf4ever.dl;

import java.io.InputStream;
import java.net.URI;

import com.google.common.collect.Multimap;

/**
 * Digital library abstraction.
 * 
 * @author piotrhol
 * 
 */
public interface DigitalLibrary {

    /**
     * Get the profile of a user.
     * 
     * @param login
     *            user login
     * @return user profile
     * @throws NotFoundException
     *             user profile not found
     * @throws DigitalLibraryException
     *             dLibra exception
     */
    UserMetadata getUserProfile(String login)
            throws DigitalLibraryException, NotFoundException;


    /**
     * Get a ZIP archive with all content stored inside a specified folder.
     * 
     * @param ro
     *            research object
     * @param folder
     *            folder path or null
     * @return ZIP input stream
     * @throws DigitalLibraryException
     *             dLibra error
     * @throws NotFoundException
     *             research object not found
     */
    InputStream getZippedFolder(URI ro, String folder)
            throws DigitalLibraryException, NotFoundException;


    /**
     * Get file content.
     * 
     * @param ro
     *            research object
     * @param filePath
     *            file path
     * @return ZIP input stream
     * @throws DigitalLibraryException
     *             dLibra error
     * @throws NotFoundException
     *             research object not found
     */
    InputStream getFileContents(URI ro, String filePath)
            throws DigitalLibraryException, NotFoundException;


    /**
     * Check if the file exists in the research object.
     * 
     * @param ro
     *            research object
     * @param filePath
     *            file path
     * @return true if the file exists, false otherwise
     * @throws DigitalLibraryException
     *             dLibra error
     */
    boolean fileExists(URI ro, String filePath)
            throws DigitalLibraryException;


    /**
     * Create a new file or update an existing one.
     * 
     * @param ro
     *            research object
     * @param filePath
     *            file path
     * @param inputStream
     *            content input stream
     * @param type
     *            MIME type
     * @return file metadata
     * @throws DigitalLibraryException
     *             dLibra error
     * @throws NotFoundException
     *             research object not found
     * @throws AccessDeniedException
     *             no access rights
     */
    ResourceMetadata createOrUpdateFile(URI ro, String filePath, InputStream inputStream, String type)
            throws DigitalLibraryException, NotFoundException, AccessDeniedException;


    /**
     * Return the file metadata.
     * 
     * @param ro
     *            research object
     * @param filePath
     *            file path
     * @return file metadata
     * @throws NotFoundException
     *             file not found
     * @throws AccessDeniedException
     *             no rights to get resource metadata
     * @throws DigitalLibraryException
     *             dLibra exception
     */
    ResourceMetadata getFileInfo(URI ro, String filePath)
            throws NotFoundException, DigitalLibraryException, AccessDeniedException;


    /**
     * Recalculate the file metadata.
     * 
     * @param ro
     *            research object
     * @param filePath
     *            file path
     * @param mimeType
     *            MIME type
     * @return file metadata
     * @throws NotFoundException
     *             file not found
     * @throws AccessDeniedException
     *             no rights to get resource metadata
     * @throws DigitalLibraryException
     *             dLibra exception
     */
    ResourceMetadata updateFileInfo(URI ro, String filePath, String mimeType)
            throws NotFoundException, DigitalLibraryException, AccessDeniedException;


    /**
     * Delete a file.
     * 
     * @param ro
     *            research object
     * @param filePath
     *            file path
     * @throws DigitalLibraryException
     *             dLibra error
     * @throws NotFoundException
     *             research object or file not found
     */
    void deleteFile(URI ro, String filePath)
            throws DigitalLibraryException, NotFoundException;


    /**
     * Create a new research object.
     * 
     * @param ro
     *            research object, can't have the dLibra ids set
     * @param mainFileContent
     *            main file input stream
     * @param mainFilePath
     *            main file path
     * @param mainFileMimeType
     *            main file MIME type
     * @throws DigitalLibraryException
     *             dLibra error
     * @throws ConflictException
     *             a research object with the given id already exists
     * @throws AccessDeniedException
     *             no rights to add objects to DL
     */
    void createResearchObject(URI ro, InputStream mainFileContent, String mainFilePath, String mainFileMimeType)
            throws DigitalLibraryException, ConflictException, AccessDeniedException;


    /**
     * Delete a research object.
     * 
     * @param ro
     *            research object
     * @throws DigitalLibraryException
     *             dLibra error
     * @throws NotFoundException
     *             research object was not found
     */
    void deleteResearchObject(URI ro)
            throws DigitalLibraryException, NotFoundException;


    /**
     * Create a user.
     * 
     * @param userId
     *            user login
     * @param password
     *            user password
     * @param username
     *            human-friendly name
     * @return true if the user was created, false if it already existed
     * @throws DigitalLibraryException
     *             dLibra error
     */
    boolean createOrUpdateUser(String userId, String password, String username)
            throws DigitalLibraryException;


    /**
     * Check if a user with a given login exists.
     * 
     * @param userId
     *            user login
     * @return true if the user exists, false otherwise
     * @throws DigitalLibraryException
     *             dLibra error
     */
    boolean userExists(String userId)
            throws DigitalLibraryException;


    /**
     * Delete a user.
     * 
     * @param userId
     *            user login
     * @throws DigitalLibraryException
     *             dLibra error
     * @throws NotFoundException
     *             user not found
     */
    void deleteUser(String userId)
            throws DigitalLibraryException, NotFoundException;


    /**
     * Get a ZIP archive with the research object contents.
     * 
     * @param ro
     *            research object
     * @return ZIP input stream
     * @throws DigitalLibraryException
     *             dLibra error
     * @throws NotFoundException
     *             research object not found
     */
    InputStream getZippedResearchObject(URI ro)
            throws DigitalLibraryException, NotFoundException;


    /**
     * Stores attributes in dLibra for a given RO.
     * 
     * @param ro
     *            research object
     * @param roAttributes
     *            pairs of property URIs and values (String, Calendar, other...)
     * @throws DigitalLibraryException
     *             dLibra error
     * @throws NotFoundException
     *             research object not found
     */
    void storeAttributes(URI ro, Multimap<URI, Object> roAttributes)
            throws NotFoundException, DigitalLibraryException;

}
