package medifox_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import web_Common_Functions.*;

public class PathologyBloodTests_Locator {

	WebDriver driver = null;
	
	public PathologyBloodTests_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "Username")
	private WebElement userName;
	public WebElement getUserName() {
		if(WebWait.elementPresent(driver, userName)!=null) {
			return userName;
		}else
			return null;
	}
	
	@FindBy(name = "Password")
	private WebElement password;
	public WebElement getPassword() {
		if(WebWait.elementPresent(driver, password)!=null) {
			return password;
		}else
			return null;
	}
	
	@FindBy(xpath = "//input[@type ='submit']")
	private WebElement clickLogin;
	public WebElement clickLogin() {
		if(WebWait.elementPresent(driver, clickLogin)!=null) {
			return clickLogin;
		}else
			return null;
	}
	
	@FindBy(xpath = "//span[text() = 'Pathology']")
	private WebElement pathology;
	public WebElement getPathology() {
		if(WebWait.elementPresent(driver, pathology)!=null) {
			return pathology;
		}else
			return null;
	}
	
	@FindBy(xpath = "//li[text() = 'Blood Tests ']")
	private WebElement validateBT;
	public WebElement getValidateBT() {
		if(WebWait.elementPresent(driver, validateBT)!=null) {
			return validateBT;
		}else
			return null;
	}
	
}
