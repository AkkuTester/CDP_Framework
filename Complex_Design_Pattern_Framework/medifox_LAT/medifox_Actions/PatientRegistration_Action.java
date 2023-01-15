package medifox_Actions;

import org.openqa.selenium.WebDriver;

import medifox_Locators.PatientRegistration_Locator;
import web_Common_Functions.*;

public class PatientRegistration_Action {
	
	WebDriver driver = null;
	PatientRegistration_Locator regL = null;
	
	public PatientRegistration_Action(WebDriver driver) {
		this.driver = driver;
		regL = new PatientRegistration_Locator(driver);
	}
	public void enterUN(String u) {
		WebTextBox.sendInput(regL.getUserName(), u);
	}
	public void enterP(String p) {
		WebTextBox.sendInput(regL.getPassword(), p);
	}
	public void clickSubmit() {
		WebClick.click(driver, regL.clickLogin());
	}
	
	public void combineLoginFunctions(String userN, String pass) {
		enterUN(userN);
		enterP(pass);
		clickSubmit();
	}

}
