package pl.psnc.dl.wf4ever.vocabulary;

import junit.framework.Assert;

import org.junit.Test;

/**
 * ORE class test.
 * 
 * @author pejot
 * 
 */
public class WFDESCTest {

	/**
	 * Test that the ontology is loaded.
	 */
	@Test
	public void test() {
		Assert.assertNotNull(WFDESC.hasInput);
		Assert.assertNotNull(WFDESC.hasOutput);
		Assert.assertNotNull(WFDESC.hasSubWorkflow);
		Assert.assertNotNull(WFDESC.sampleSize);
		Assert.assertNotNull(WFDESC.subsequentWorkflow);
		Assert.assertNotNull(WFDESC.runtime);
		Assert.assertNotNull(WFDESC.previousWorkflow);
	}
}
