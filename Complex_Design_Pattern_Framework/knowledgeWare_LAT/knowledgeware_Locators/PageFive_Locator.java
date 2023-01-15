package knowledgeware_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebWait;

public class PageFive_Locator {
	
	WebDriver driver = null;
	
	public PageFive_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[contains(text() , 'Welcome')]")
	private WebElement confirmText;
	
	public WebElement getConfirmText() {
		if(WebWait.elementPresent(driver, confirmText)!=null) {
			return confirmText;
		}else
			return null;
	}
}
