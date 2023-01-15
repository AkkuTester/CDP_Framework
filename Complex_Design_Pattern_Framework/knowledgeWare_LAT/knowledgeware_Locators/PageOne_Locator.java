package knowledgeware_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebWait;
 
public class PageOne_Locator {
	
	// creating an instance of webDriver
	WebDriver driver = null;
	
	//creating an constructor for initializing the driver
	public PageOne_Locator(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this); // page factory initialization mandatory step
	}

	//WebElement userName = driver.findElement(By.name("name"));
	@FindBy(name="name")
	private WebElement userName;
	/*
	 * so basically @findBy is a replacement for driver.findElement(By.
	 */
	// encapsulation - public getter method
	public WebElement getUserName() {
		if(WebWait.elementPresent(driver, userName)!=null) { 
		return userName;
		}else
			return null;
	}
	// finfing for password
	@FindBy(name = "password")
	private WebElement password;
	
	//setting up public getter for password element
	public WebElement getPassword() {
		if(WebWait.elementPresent(driver, password)!=null) {
			return password;
		}else
			return null;
	}
	
	@FindBy(name = "confirmpassword")
	private WebElement confPass;
	
	//setting up public getter for confirm password element
	public WebElement getconfPass() {
		if(WebWait.elementPresent(driver, confPass)!=null) {
			return confPass;
		}else
			return null;
	}
	@FindBy(partialLinkText = "LOGIN")
	private WebElement click;
	
	public WebElement clickLogin() {
		if(WebWait.elementPresent(driver, click)!=null) {
			return click;
		} else
			return null;
	}
}
/*
 * @findBy supports all the 8 types of locators 
*/