package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * ROEVO class test.
 * 
 * @author piotrekhol
 * 
 */
public class ROEVOTest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(ROEVO.NAMESPACE);
        Assert.assertNotNull(ROEVO.ONT_MODEL);
        Assert.assertNotNull(ROEVO.Addition);
        Assert.assertNotNull(ROEVO.archivedAtTime);
        Assert.assertNotNull(ROEVO.archivedBy);
        Assert.assertNotNull(ROEVO.ArchivedRO);
        Assert.assertNotNull(ROEVO.Change);
        Assert.assertNotNull(ROEVO.ChangeSpecification);
        Assert.assertNotNull(ROEVO.hasArchive);
        Assert.assertNotNull(ROEVO.hasChange);
        Assert.assertNotNull(ROEVO.hasSnapshot);
        Assert.assertNotNull(ROEVO.isArchiveOf);
        Assert.assertNotNull(ROEVO.isSnapshotOf);
        Assert.assertNotNull(ROEVO.LiveRO);
        Assert.assertNotNull(ROEVO.Modification);
        Assert.assertNotNull(ROEVO.relatedResource);
        Assert.assertNotNull(ROEVO.Removal);
        Assert.assertNotNull(ROEVO.SnapshotRO);
        Assert.assertNotNull(ROEVO.snapshottedAtTime);
        Assert.assertNotNull(ROEVO.snapshottedBy);
        Assert.assertNotNull(ROEVO.wasChangedBy);
    }

}
