package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * ROEVO class test.
 * 
 * @author piotrekhol
 * 
 */
public class NotificationServiceTest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(NotificationService.NAMESPACE);
        Assert.assertNotNull(NotificationService.ONT_MODEL);
        Assert.assertNotNull(NotificationService.notifications);
    }

}
