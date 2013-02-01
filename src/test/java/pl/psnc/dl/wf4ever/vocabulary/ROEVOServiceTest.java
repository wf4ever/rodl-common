package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * ROEVO class test.
 * 
 * @author piotrekhol
 * 
 */
public class ROEVOServiceTest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(ROEVOService.NAMESPACE);
        Assert.assertNotNull(ROEVOService.ONT_MODEL);
        Assert.assertNotNull(ROEVOService.copy);
        Assert.assertNotNull(ROEVOService.finalize);
        Assert.assertNotNull(ROEVOService.info);
    }

}
