package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * WFPROV class test.
 * 
 * @author piotrekhol
 * 
 */
public class WFPROVTest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(WFPROV.NAMESPACE);
        Assert.assertNotNull(WFPROV.ONT_MODEL);
        Assert.assertNotNull(WFPROV.Artifact);
        Assert.assertNotNull(WFPROV.describedByParameter);
        Assert.assertNotNull(WFPROV.describedByProcess);
        Assert.assertNotNull(WFPROV.describedByWorkflow);
        Assert.assertNotNull(WFPROV.ProcessRun);
        Assert.assertNotNull(WFPROV.usedInput);
        Assert.assertNotNull(WFPROV.wasEnactedBy);
        Assert.assertNotNull(WFPROV.wasOutputFrom);
        Assert.assertNotNull(WFPROV.wasPartOfWorkflowRun);
        Assert.assertNotNull(WFPROV.WorkflowEngine);
        Assert.assertNotNull(WFPROV.WorkflowRun);
    }

}
