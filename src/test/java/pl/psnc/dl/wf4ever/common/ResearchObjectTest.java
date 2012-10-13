package pl.psnc.dl.wf4ever.common;

import java.net.URI;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.Test;

/**
 * ResearchObject unit tests.
 * 
 * @author piotrek
 * 
 */
public class ResearchObjectTest {

    /** URI of the RO used in the test. */
    private static URI roURI = URI.create("http://example.org/ROs/foobar/");


    /**
     * Clean up the tests.
     */
    @AfterClass
    public static void tearDownAfterClass() {
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        ResearchObject ro = new ResearchObject(roURI);
        ro.delete();
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
    }


    /**
     * Test correct initial values.
     */
    @Test
    public void testInit() {
        ResearchObject ro = new ResearchObject();
        Assert.assertNull(ro.getUri());
        Assert.assertNull(ro.getManifestUri());
        Assert.assertNull(ro.getId());
        Assert.assertEquals(0, ro.getDlWorkspaceId());
        Assert.assertEquals(0, ro.getDlROId());
        Assert.assertEquals(0, ro.getDlROVersionId());
        Assert.assertEquals(0, ro.getDlEditionId());
    }


    /**
     * Test correct initial values.
     */
    @Test
    public void testUri() {
        ResearchObject ro = new ResearchObject();
        ro.setUri(roURI);
        Assert.assertEquals(roURI, ro.getUri());
        Assert.assertEquals("foobar", ro.getId());
        Assert.assertEquals(roURI.resolve(".ro/manifest.rdf"), ro.getManifestUri());
    }


    /**
     * Test saving and loading from database.
     */
    @Test
    public void testSaveLoad() {
        ResearchObject ro = new ResearchObject(roURI);
        ro.setDlWorkspaceId(1);
        ro.setDlROId(2);
        ro.setDlROVersionId(3);
        ro.setDlEditionId(4);
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        ro.save();
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        ResearchObject ro2 = ResearchObject.findByUri(roURI);
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        Assert.assertEquals(roURI, ro2.getUri());
        Assert.assertEquals(1, ro2.getDlWorkspaceId());
        Assert.assertEquals(2, ro2.getDlROId());
        Assert.assertEquals(3, ro2.getDlROVersionId());
        Assert.assertEquals(4, ro2.getDlEditionId());
    }


    /**
     * Test deleting the RO.
     */
    @Test
    public void testDelete() {
        ResearchObject ro = new ResearchObject(roURI);
        ro.setDlWorkspaceId(1);
        ro.setDlROId(2);
        ro.setDlROVersionId(3);
        ro.setDlEditionId(4);
        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        ro.save();
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        ResearchObject ro2 = ResearchObject.findByUri(roURI);
        ro2.delete();
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();

        HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
        ResearchObject ro3 = ResearchObject.findByUri(roURI);
        Assert.assertNull(ro3);
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
    }

}
