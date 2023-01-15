package knowledgeware_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import web_Common_Functions.WebWait;


public class PageTwo_Locator {
	//creating an instance of webdriver driver
	WebDriver driver = null;
	
	//creating the constructor for initializing the driver
	public PageTwo_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// finding the elements from page 2
	@FindBy(name = "First_Name")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		if(WebWait.elementPresent(driver, firstName)!=null) {
			return firstName;
		}
		else
			return null;
	}
	
	@FindBy(name = "Last_Name")
	private WebElement lastName;

	public WebElement getlastName() {
		if(WebWait.elementPresent(driver, lastName)!=null) {
			return lastName;
		}
		else
			return null;
	}
	@FindBy(name ="Birthday_day")
	private WebElement bd;
	
	public WebElement getBirthD() {
		if(WebWait.elementPresent(driver, bd)!=null) {
			return bd;
		}else
			return null;
	}
	@FindBy(name = "Birthday_Month")
	private WebElement bm;
	public WebElement getBirthM() {
		if(WebWait.elementPresent(driver, bm)!=null) {
			return bm;
		}else
			return null;
	}
	@FindBy(name = "Birthday_Year")
	private WebElement by;
	public WebElement getBirthY() {
		if(WebWait.elementPresent(driver, by)!=null) {
			return by;
		}else
			return null;
	}
	@FindBy(name = "Email_Id")
	private WebElement email;
	public WebElement getEmail() {
		if(WebWait.elementPresent(driver, email)!=null) {
			return email;
		}else
			return null;
	}
	@FindBy(name = "Mobile_Number")
	private WebElement mobile;
	public WebElement getMobile() {
		if(WebWait.elementPresent(driver, mobile)!=null) {
			return mobile;
		}else
			return null;
	}
	@FindBy(name = "Gender")
	private WebElement gender;
	public WebElement getGender() {
		if(WebWait.elementPresent(driver, gender)!=null) {
			return gender;
		}else
			return null;
	}
	@FindBy(partialLinkText = "NEXT")
	private WebElement next;
	public WebElement clickNext() {
		if(WebWait.elementPresent(driver, next)!=null) {
			return next;
		}else
			return null;
	}
	
}
