package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * PROV class test.
 * 
 * @author piotrekhol
 * 
 */
public class PROVTest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(PROV.NAMESPACE);
        Assert.assertNotNull(PROV.ONT_MODEL);
        Assert.assertNotNull(PROV.hadOriginalSource);
        Assert.assertNotNull(PROV.wasRevisionOf);
        Assert.assertNotNull(PROV.wasDerivedFrom);
        Assert.assertNotNull(PROV.wasQuotedFrom);
    }

}
