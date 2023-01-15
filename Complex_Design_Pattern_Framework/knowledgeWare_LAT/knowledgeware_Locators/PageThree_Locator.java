package knowledgeware_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import web_Common_Functions.WebWait;

public class PageThree_Locator {
	
	//creating an instance of webDriver
	WebDriver driver = null;
	
	//creating the constructor for initializing the constructor
	public PageThree_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initialization of page factor
	}
	
	//adress
	@FindBy(name = "Address")
	private WebElement adress;
	public WebElement getAddress() {
		if(WebWait.elementPresent(driver, adress)!=null) {
			return adress;
		}else
			return null;
	}
	//city
	@FindBy(name = "City")
	private WebElement city;
	public WebElement getCity() {
		if(WebWait.elementPresent(driver, city)!=null) {
			return city;
		}else
			return null;
	}
	//Pin_Code
	@FindBy(name = "Pin_Code")
	private WebElement pinCode;
	public WebElement getPin() {
		if(WebWait.elementPresent(driver, pinCode)!=null) {
			return pinCode;
		}else
			return null;
	}
	//State
	@FindBy(name = "State")
	private WebElement state;
	public WebElement getState() {
		if(WebWait.elementPresent(driver, state)!=null) {
			return state;
		}else
			return null;
	}
	@FindBy(name ="Country")
	private WebElement country;
	public WebElement getCountry() {
		if(WebWait.elementPresent(driver, country)!=null) {
			return country;
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
