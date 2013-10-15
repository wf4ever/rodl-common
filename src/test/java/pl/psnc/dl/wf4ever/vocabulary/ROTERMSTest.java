package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * ORE class test.
 * 
 * @author pejot
 * 
 */
public class ROTERMSTest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(ROTERMS.performsTask);
        Assert.assertNotNull(ROTERMS.requiresDataset);
        Assert.assertNotNull(ROTERMS.requiresHardware);
        Assert.assertNotNull(ROTERMS.requiresSoftware);
        Assert.assertNotNull(ROTERMS.inputSelected);
        Assert.assertNotNull(ROTERMS.exampleValue);
        Assert.assertNotNull(ROTERMS.defaultValue);
    }
}
