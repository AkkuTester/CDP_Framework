package knowledgeware_Action;

import org.openqa.selenium.*;

import knowledgeware_Locators.PageFour_Locators;
import web_Common_Functions.*;

public class PageFour_Action {
	//activating drivers
	WebDriver driver = null;
	PageFour_Locators pfl = null;
	
	//constructor
	public PageFour_Action(WebDriver driver) {
		this.driver = driver;
		pfl = new PageFour_Locators(driver);
	}

	//action begins from here
	//selecting hobbies
	public void singing() {
		WebClick.click(driver, pfl.getSinging());
	}
	
	public void drawing() {
		WebClick.click(driver, pfl.getDrawing());
	}
	
	public void dancing() {
		WebClick.click(driver, pfl.getDacing());
	}
	
	public void sketching() {
		WebClick.click(driver,pfl.getCooking());
	}
	
	public void other() {
		WebClick.click(driver, pfl.getOther());
	}
	
	public void otherHobby(String hb) {
		WebTextBox.sendInput(pfl.getOtherHobby(), hb);
	}
	
	public void nextClick() {
		WebClick.click(driver, pfl.clickNext());
	}
	
	public void PageFourCommActions(String hb) {
		singing();
		drawing();
		dancing();
		sketching();
		other();
		otherHobby(hb);
		nextClick();
	}
}
