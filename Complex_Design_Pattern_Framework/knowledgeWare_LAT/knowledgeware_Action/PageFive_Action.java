package knowledgeware_Action;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import knowledgeware_Locators.PageFive_Locator;
import web_Common_Functions.TakeScreenshot;

public class PageFive_Action {
	//activating drivers
	WebDriver driver = null;
	PageFive_Locator pageFiveL = null;

	public PageFive_Action(WebDriver driver) {
		this.driver = driver;
		pageFiveL = new PageFive_Locator(driver);
	}
	
	public void validate() {
		Assert.assertTrue((pageFiveL.getConfirmText()!=null));
	}
	public void screenshot() throws Exception {
		if(pageFiveL.getConfirmText()==null) {
			TakeScreenshot.takeScreenShot(driver, "validationFailed");
		}
	}
	
	public void pageFiveComActions() throws Exception {
		validate();
		screenshot();
	}
}
