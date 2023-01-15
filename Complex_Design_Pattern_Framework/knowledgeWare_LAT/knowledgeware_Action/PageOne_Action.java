package knowledgeware_Action;

import org.openqa.selenium.*;

import knowledgeware_Locators.PageOne_Locator;
import web_Common_Functions.WebClick;
import web_Common_Functions.WebTextBox;

public class PageOne_Action {
	
	WebDriver driver =null;
	PageOne_Locator pol = null;
	
	public PageOne_Action(WebDriver driver) {
		this.driver = driver;
		pol= new PageOne_Locator(driver); //driver passed to the constructor of PageOne_Locator
	}

	public void enterUserName(String userName) {
		WebTextBox.sendInput(pol.getUserName(), userName);
	}
	
	public void enterPassword(String pass) {
		WebTextBox.sendInput(pol.getPassword(), pass);
	}
	public void enterConfPass(String confpass) {
		WebTextBox.sendInput(pol.getconfPass(), confpass);
	}
	public void clickLogin() {
		WebClick.click(driver, pol.clickLogin());
	}
	
	
	//common method to call all the above methods
	public void enterPageOneDetails(String u, String p, String cnfp) {
		enterUserName(u);
		enterPassword(p);
		enterConfPass(cnfp);
		clickLogin();
		
	}
}
