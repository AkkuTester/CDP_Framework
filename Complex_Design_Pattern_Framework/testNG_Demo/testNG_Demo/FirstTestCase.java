package testNG_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority = 1)
	public void openBrowser() {
		System.out.println("opning browser");
	}
	
	@Test
	public void setUp() {
		System.out.println("setup code here");
	}
	
	@Test
	public void failing() {
		Assert.assertEquals(false, true);
	}
	

}
