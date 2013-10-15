package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * RO class test.
 * 
 * @author piotrekhol
 * 
 */
public class WF4EVERTest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(WF4EVER.rootURI);
    }

}
