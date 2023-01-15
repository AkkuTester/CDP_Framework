package web_Common_Functions;

import org.openqa.selenium.*;

public class WebClick {
	/*
	 * this method will click on buttons, and links
	 * Parameter - driver, element
	 * explicit wait already been checked
	 * 
	 */
	
	public static void click(WebDriver driver, WebElement element) {
		if(WebWait.elementClickable(driver, element)!=null) {
			element.click();
		}
	}

}
