package knowledgeware_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web_Common_Functions.WebWait;

public class PageFour_Locators {

	WebDriver driver = null;
	
	//creating the constructor for initializing the driver;
	public PageFour_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//finding the elements
	@FindBy(name = "Hobby_Drawing")
	private WebElement drawing;
	public WebElement getDrawing() {
		if(WebWait.elementPresent(driver, drawing)!=null) {
			return drawing;
		}else
			return null;
	}
	
	@FindBy(name = "Hobby_Singing")
	private WebElement singing;
	public WebElement getSinging() {
		if(WebWait.elementPresent(driver, singing)!=null) {
			return singing;
		}else
			return null;
	}
	
	@FindBy(name = "Hobby_Dancing")
	private WebElement dancing;
	public WebElement getDacing() {
		if(WebWait.elementPresent(driver, dancing)!=null) {
			return dancing;
		}else
			return null;
	}
	
	@FindBy(name = "Hobby_Cooking")
	private WebElement cooking;
	public WebElement getCooking() {
		if(WebWait.elementPresent(driver, cooking)!=null) {
			return cooking;
		}else
			return null;
	}
	
	@FindBy(name = "Hobby_Other")
	private WebElement other;
	public WebElement getOther() {
		if(WebWait.elementPresent(driver, other)!=null) {
			return other;
		}else
			return null;
	}
	@FindBy(name = "Other_Hobby")
	private WebElement otherHobby;
	public WebElement getOtherHobby() {
		if(WebWait.elementPresent(driver, otherHobby)!=null) {
			return otherHobby;
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
