package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * ORE class test.
 * 
 * @author piotrekhol
 * 
 */
public class ORETest {

    /**
     * Test that the ontology is loaded.
     */
    @Test
    public void test() {
        Assert.assertNotNull(ORE.NAMESPACE);
        Assert.assertNotNull(ORE.ONT_MODEL);
        Assert.assertNotNull(ORE.AggregatedResource);
        Assert.assertNotNull(ORE.aggregates);
        Assert.assertNotNull(ORE.Aggregation);
        Assert.assertNotNull(ORE.describes);
        Assert.assertNotNull(ORE.isAggregatedBy);
        Assert.assertNotNull(ORE.isDescribedBy);
        Assert.assertNotNull(ORE.Proxy);
        Assert.assertNotNull(ORE.proxyFor);
        Assert.assertNotNull(ORE.proxyIn);
        Assert.assertNotNull(ORE.ResourceMap);
    }

}
