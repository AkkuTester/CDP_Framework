package medifox_Actions;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import medifox_Locators.Login_Page_Locator;
import web_Common_Functions.*;


public class Login_Page_Action {

	WebDriver driver =null;
	Login_Page_Locator loginLocator = null;
	
	public Login_Page_Action(WebDriver driver) {
		this.driver = driver;
		loginLocator = new Login_Page_Locator(driver);
	}
	
	//validation points
	
	public void validatePageTitle() {
	String pTitle =	WebPageTitle.verifyPageTitle(loginLocator.validatePageTitle());
	Assert.assertEquals("Login", pTitle, "Heading_Of_the_Page");
	}
	
	public void validateLogo() {
		WebValidation.logoValidation(loginLocator.validatelogo());
	}
	
	public void validateImage() {
		WebValidation.logoValidation(loginLocator.validateImg1());
	}
	
	public void validateForgetPassword() {
	String forgetPass =	WebValidation.getElementText(loginLocator.validateForgetPassword());
	Assert.assertEquals("Forgot password?", forgetPass, "forget password present");
	}
	public void validateRegHere() {
		String regHere = WebValidation.getElementText(loginLocator.validateRegisterHere());
		Assert.assertEquals("Register here", regHere);
	}
	public void validateTermsAndCondition() {
		String termsCond = WebValidation.getElementText(loginLocator.validateTermsOfUse());
		Assert.assertEquals(termsCond, "Terms of use.");
	}
	public void validatePrivacyPolicy() {
		String privacy = WebValidation.getElementText(loginLocator.validatePrivacyPolicy());
		Assert.assertEquals(privacy, "Privacy policy");
	}
	public void emptyClick() {
		WebClick.click(driver, loginLocator.clickLogin());
		String uName = WebValidation.getElementText(loginLocator.pleaseEnterUsername());
		Assert.assertEquals(uName, "Please enter your Username");
		String uPass = WebValidation.getElementText(loginLocator.pleaseEnterPassword());
		Assert.assertEquals(uPass, "Please enter your Password");
	}
	public void passEmptyLi(String uname) {
		WebTextBox.sendInput(loginLocator.getUserName(), uname);
		WebClick.click(driver, loginLocator.clickLogin());
		String temp = WebValidation.getElementText(loginLocator.passwordEmptyLi());
		Assert.assertEquals(temp, "Please enter your Password");
	}
	public void wrongPassword1(String uname, String pass) {
		WebTextBox.clearText(loginLocator.getUserName());
		WebTextBox.sendInput(loginLocator.getUserName(), uname);
		WebTextBox.sendInput(loginLocator.getPassword(), pass);
		WebClick.click(driver, loginLocator.clickLogin());
		String temp = WebValidation.getElementText(loginLocator.wrongPassword());
		Assert.assertEquals(temp, "Username or Password incorrect");
	}
	public void watermarkUsername(String uname, String pass) {
		WebTextBox.sendInput(loginLocator.getUserName(), uname);
		WebTextBox.sendInput(loginLocator.getPassword(), pass);
		WebClick.click(driver, loginLocator.clickLogin());
		
		WebElement usr = loginLocator.getUserName();
		String temp = usr.getAttribute("value");
		boolean flag = temp.isEmpty();
		Assert.assertTrue(flag);	
	}
	public void login(String userName, String Password) {
		WebTextBox.clearText(loginLocator.getUserName());
		WebTextBox.sendInput(loginLocator.getUserName(), userName);
		WebTextBox.sendInput(loginLocator.getPassword(), Password);
		WebClick.click(driver, loginLocator.clickLogin());
	}


}
