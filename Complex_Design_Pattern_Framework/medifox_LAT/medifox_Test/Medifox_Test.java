package medifox_Test;

import org.testng.annotations.Test;

import baseClasses.BaseClass_Medifox;
import medifox_Actions.Login_Page_Action;
import properties_Readers.Medifox_PropertiesReader;
import web_Common_Functions.TakeScreenshot;

public class Medifox_Test extends BaseClass_Medifox {
	Login_Page_Action login = null;
	@Test(priority = 1, description = "validation of page title")
	public void pageTitle() throws Exception {
		login = new Login_Page_Action(driver);
		//TakeScreenshot.takeScreenShot(driver, "C:\\Users\\HP\\eclipse-workspace\\Complex_Design_Pattern_Framework\\Medifox_Testing_Datas\\Screenshot/loginPage.png");
		login.validatePageTitle();
	}
	
	@Test(priority =2 , description = "validation of logo")
	public void pageLogo() throws Exception {
		login.validateLogo();
	}
	
	@Test(priority =3 , description = "validation of image")
	public void pageImage() throws Exception {
		login.validateImage();
	}
	
	@Test(priority =4 , description = "validation of forgetPassword")
	public void forgetPassword() throws Exception {
		login.validateForgetPassword();
	}
	
	@Test(priority =5 , description = "validation of Register Here")
	public void registerHere() throws Exception {
		login.validateRegHere();
	}
	@Test(priority =6 , description = "validation of Terms & Conditions")
	public void termsNdCondition() throws Exception {
		login.validateTermsAndCondition();
	}
	@Test(priority =7, description = "validation of Privacy policy")
	public void privacyPolicy() throws Exception {
		login.validatePrivacyPolicy();
	}
	@Test(priority =8, description = "empty click should display a warning")
	public void emptyClicks() throws Exception {
		login.emptyClick();
	}
	// data driven testing
	@Test(priority = 9, description = "empty Password field test")
	public void emptyPasswordTest() throws Exception {
		login.passEmptyLi(Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "userName"));
	}
	@Test(priority = 10, description = "wrong password test1")
	public void wrongPasswordTest1() throws Exception {
		login.wrongPassword1(Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "userName"), 
				Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "pass1"));
		Thread.sleep(3000);
	}
	@Test(priority = 11, description = "wrong password test2")
	public void wrongPasswordTest2() throws Exception {
		login.wrongPassword1(Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "userName"), 
				Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "pass2"));
		Thread.sleep(3000);
	}
	@Test(priority = 12, description = "wrong password test3")
	public void wrongPasswordTest3() throws Exception {
		login.wrongPassword1(Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "userName"), 
				Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "pass3"));
		Thread.sleep(3000);
	}
	@Test(priority = 13, description = "wrong password test4")
	public void wrongPasswordTest4() throws Exception {
		login.wrongPassword1(Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "userName"), 
				Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "pass4"));
		Thread.sleep(3000);
	}
	@Test(priority = 14, description = "watermark for Username")
	public void validateEmptyUsernameWatermark() throws Exception {
		login.watermarkUsername(Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "userName"), 
				Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "pass4"));
	}
	@Test(priority = 15, description = "loginTest")
	public void loginTest() throws Exception {
		login.login(Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "userName"), 
				Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "password"));
	}
}
