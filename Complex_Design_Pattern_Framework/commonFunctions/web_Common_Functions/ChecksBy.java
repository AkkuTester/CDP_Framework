package web_Common_Functions;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;

public class ChecksBy {
	/*
	 * purpose - to check whether the element is present in the dom or not
	 * parameters - webElement
	 * returnType - boolean
	 */
	
	public static boolean isPresent(WebElement element) {
		
		boolean isPre = false;
		
		if(element.isDisplayed()) {
			isPre = true;
		}
		return isPre;
	}
	
	/*
	 * purpose - the following method will check whether the element is clickable or not by using 
	 * By class
	 */

	public static boolean isClickable(WebDriver driver, By by) {
	boolean isClick = false;
		if(WebWaitBy.elementPresent(driver, by)!=null) {
		isClick = true;
		}
		return isClick;
	}
}
