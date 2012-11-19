package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * FOAF class test.
 * 
 * @author piotrekhol
 * 
 */
public class FOAFTest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(FOAF.NAMESPACE);
        Assert.assertNotNull(FOAF.ONT_MODEL);
        Assert.assertNotNull(FOAF.Agent);
        Assert.assertNotNull(FOAF.name);
        Assert.assertNotNull(FOAF.Person);
        Assert.assertNotNull(FOAF.primaryTopic);
    }

}
