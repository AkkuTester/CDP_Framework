package listeners;


import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginByEmail() {
		System.out.println("login by email");
		Assert.assertEquals("nifty", "nifty");
	}
	
	@Test
	public void loginByfacebook() {
		System.out.println("login by facebook");
		Assert.assertEquals("facebbok", "google");
	}
	
	@Test(dependsOnMethods = "loginByfacebook")
	public void loginByYAHOO() {
		System.out.println("login by YAHOO");
		Assert.assertEquals("facebbok", "yahoo");
	}

}
