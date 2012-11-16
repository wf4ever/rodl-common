package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * RO class test.
 * 
 * @author piotrekhol
 * 
 */
public class ROTest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(RO.NAMESPACE);
        Assert.assertNotNull(RO.ONT_MODEL);
        Assert.assertNotNull(RO.AggregatedAnnotation);
        Assert.assertNotNull(RO.annotatesAggregatedResource);
        Assert.assertNotNull(RO.checksum);
        Assert.assertNotNull(RO.entryName);
        Assert.assertNotNull(RO.filesize);
        Assert.assertNotNull(RO.Folder);
        Assert.assertNotNull(RO.FolderEntry);
        Assert.assertNotNull(RO.Manifest);
        Assert.assertNotNull(RO.name);
        Assert.assertNotNull(RO.ResearchObject);
        Assert.assertNotNull(RO.Resource);
        Assert.assertNotNull(RO.rootFolder);
    }

}
