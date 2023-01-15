package testNG_Demo;

import org.testng.annotations.Test;

public class SecondTestCase {
	
	@Test(priority = 1)
	public void addFeature() {
		System.out.println("adding feature");
	}
	
	@Test(priority = 2)
	public void tearDown() {
		System.out.println("closing the browser");
	}
	
	

}
