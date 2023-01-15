package web_Common_Functions;

import org.openqa.selenium.*;

public class WebButton {
	/*
	 * following method will click on the submit buttons
	 * parameter - driver & element
	 */
	public static void clickButton(WebDriver driver, WebElement element) {
	
	if(WebWait.elementClickable(driver, element)!=null) {
				element.click();
	}
	}

}
