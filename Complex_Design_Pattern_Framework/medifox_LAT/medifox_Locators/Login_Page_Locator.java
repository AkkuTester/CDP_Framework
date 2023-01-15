package medifox_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebWait;

public class Login_Page_Locator {
	
	//creating an instance of web driver
	WebDriver driver = null;
	
	public Login_Page_Locator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // page factory initialization 
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
	
	// validator
	@FindBy(tagName = "title")
	private WebElement pageTitle; 
	public WebElement validatePageTitle() {
		if(WebWait.elementPresent(driver, pageTitle)!=null) {
			return pageTitle;
		}else
			return null;
	}
	
	@FindBy(xpath = "(//img)[2]")
	private WebElement logo ;
	public WebElement validatelogo() {
		if(WebWait.elementPresent(driver, logo)!=null) {
			return logo;
		}else
			return null;
	}
	
	@FindBy(xpath = "(//img)[1]")
	private WebElement image1;
	
	public WebElement validateImg1() {
	if(WebWait.elementPresent(driver, image1)!=null) {
		return image1;
	}else
		return null;
	}
	
	@FindBy(xpath = "(//h4)[1]")
	private WebElement forgetPassword;
	public WebElement validateForgetPassword() {
		if(WebWait.elementPresent(driver, forgetPassword)!=null) {
			return forgetPassword;
		}else
			return null;
	}
	
	@FindBy(xpath = "//a[contains(text(), 'Register')]")
	private WebElement registerHere;
	public WebElement validateRegisterHere() {
		if(WebWait.elementPresent(driver, registerHere)!=null) {
			return registerHere;
		}else
			return null;
	}
	@FindBy(xpath = "//a[contains(text(), 'Term')]")
	private WebElement termsOfUse;
	public WebElement validateTermsOfUse() {
		if(WebWait.elementPresent(driver, termsOfUse)!=null) {
			return termsOfUse;
		}else
			return null;
	}
	@FindBy(xpath = "//a[contains(text(), 'policy')]")
	private WebElement privacyPolicy;
	public WebElement validatePrivacyPolicy() {
		if(WebWait.elementPresent(driver, privacyPolicy)!=null) {
			return privacyPolicy;
		}else
			return null;
	}
	@FindBy(xpath = "(//li)[1]")
	private WebElement pleaseEnterUsername;
	public WebElement pleaseEnterUsername() {
		if(WebWait.elementPresent(driver, pleaseEnterUsername)!=null) {
			return pleaseEnterUsername;
		}else
			return null;
	}
	@FindBy(xpath = "(//li)[2]")
	private WebElement pleaseEnterPassword;
	public WebElement pleaseEnterPassword() {
		if(WebWait.elementPresent(driver, pleaseEnterPassword)!=null) {
			return pleaseEnterPassword;
		}else
			return null;
	}
	@FindBy(tagName = "li")
	private WebElement passwordEmptyLi;
	public WebElement passwordEmptyLi() {
		if(WebWait.elementPresent(driver, passwordEmptyLi)!=null) {
			return passwordEmptyLi;
		}else
			return null;
	}
	@FindBy(tagName = "li")
	private WebElement wrongPass1;
	public WebElement wrongPassword() {
		if(WebWait.elementPresent(driver, wrongPass1)!=null) {
			return wrongPass1;
		}else
			return null;
	}
}
