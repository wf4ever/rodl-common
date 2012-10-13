package pl.psnc.dl.wf4ever.common;

import java.net.URI;

import junit.framework.Assert;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ResearchObject unit tests.
 * 
 * @author piotrek
 * 
 */
public class ResearchObjectTest {

    /** Session factory. */
    private static SessionFactory sessionFactory;

    /** URI of the RO used in the test. */
    private static URI roURI = URI.create("http://example.org/ROs/foobar/");


    /**
     * Init the tests.
     * 
     * @throws Exception
     *             error
     */
    @BeforeClass
    public static void setUpBeforeClass()
            throws Exception {
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
                .buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }


    /**
     * Clean up the tests.
     */
    @AfterClass
    public static void tearDownAfterClass() {
        sessionFactory.getCurrentSession().beginTransaction();
        ResearchObject ro = new ResearchObject();
        ro.setUri(roURI);
        ro.delete();
        sessionFactory.getCurrentSession().getTransaction().commit();
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
        ResearchObject ro = new ResearchObject(sessionFactory, roURI);
        ro.setDlWorkspaceId(1);
        ro.setDlROId(2);
        ro.setDlROVersionId(3);
        ro.setDlEditionId(4);
        sessionFactory.getCurrentSession().beginTransaction();
        ro.save();
        sessionFactory.getCurrentSession().getTransaction().commit();

        sessionFactory.getCurrentSession().beginTransaction();
        ResearchObject ro2 = ResearchObject.get(roURI);
        sessionFactory.getCurrentSession().getTransaction().commit();
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
        ResearchObject ro = new ResearchObject(sessionFactory, roURI);
        ro.setDlWorkspaceId(1);
        ro.setDlROId(2);
        ro.setDlROVersionId(3);
        ro.setDlEditionId(4);
        sessionFactory.getCurrentSession().beginTransaction();
        ro.save();
        sessionFactory.getCurrentSession().getTransaction().commit();

        sessionFactory.getCurrentSession().beginTransaction();
        ResearchObject ro2 = ResearchObject.get(roURI);
        ro2.delete();
        sessionFactory.getCurrentSession().getTransaction().commit();

        sessionFactory.getCurrentSession().beginTransaction();
        ResearchObject ro3 = ResearchObject.get(roURI);
        Assert.assertNull(ro3);
        sessionFactory.getCurrentSession().getTransaction().commit();
    }

}
