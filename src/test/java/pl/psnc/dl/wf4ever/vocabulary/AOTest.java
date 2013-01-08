package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * AO class test.
 * 
 * @author piotrekhol
 * 
 */
public class AOTest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(AO.NAMESPACE);
        Assert.assertNotNull(AO.ONT_MODEL);
        Assert.assertNotNull(AO.annotatesResource);
        Assert.assertNotNull(AO.body);
        Assert.assertNotNull(AO.Annotation);
    }

}
