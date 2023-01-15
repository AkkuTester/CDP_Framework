package knowledgeware_Action;

import org.openqa.selenium.*;

import knowledgeware_Locators.PageThree_Locator;
import web_Common_Functions.WebClick;
import web_Common_Functions.WebSelect;
import web_Common_Functions.WebTextBox;

public class PageThree_Action {
	//setting up the driver and PageThree_Locator object
	WebDriver driver = null;
	PageThree_Locator thirdL = null;

	//constructor of page three action
	public PageThree_Action(WebDriver driver) {
		this.driver = driver;
		thirdL = new PageThree_Locator(driver); //driver passed to the page three locator
	}
	
	public void enterAddress(String address) {
		WebTextBox.sendInput(thirdL.getAddress(), address);
	}
	
	public void enterCity(String city) {
		WebTextBox.sendInput(thirdL.getCity(), city);
	}
	
	public void enterPin(String pin) {
		WebTextBox.sendInput(thirdL.getPin(), pin);
	}
	
	public void enterState(String state) {
		WebTextBox.sendInput(thirdL.getState(), state);
	}
	
	public void enterCountry(String country) {
		WebSelect.selectByText(thirdL.getCountry(), country);
	}
	//clicking on next
		public void nextClick() {
			WebClick.click(driver, thirdL.clickNext());
		}
		
	public void PageThreeCommonActions(String add, String city, String pin, String state, String country) {
		enterAddress(add);
		enterCity(city);
		enterPin(pin);
		enterState(state);
		enterCountry(country);
		nextClick();
	}
}
