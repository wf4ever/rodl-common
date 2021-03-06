package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

import com.hp.hpl.jena.util.FileManager;

/**
 * W4E class test.
 * 
 * @author piotrekhol
 * 
 */
public class W4ETest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(W4E.STANDARD_NAMESPACES);
        Assert.assertNotNull(W4E.DEFAULT_MODEL);
        Assert.assertTrue(W4E.DEFAULT_MODEL.countSubModels() == 2);
        W4E.DEFAULT_MODEL.addSubModel(FileManager.get().loadModel(RO.NAMESPACE));
        W4E.DEFAULT_MODEL.addSubModel(FileManager.get().loadModel(ROEVO.NAMESPACE));
    }

}
