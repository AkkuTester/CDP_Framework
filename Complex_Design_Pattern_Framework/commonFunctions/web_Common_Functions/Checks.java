package web_Common_Functions;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class Checks {
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
	 * purpose - the following mwthod will check whether the element is clickable or not
	 * parameters - webElement
	 * return type - true
	 */
	
	public static boolean isClickable(WebElement element) {
		boolean isClick = false;
		
		if(isPresent(element)) {
			isClick = true;
		}
		return isClick;
	}
	/*
	 * following method will check if the alert is popped up or not
	 */
	public static Alert isAlertPresent(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	Alert alrt = wait.until(ExpectedConditions.alertIsPresent());
	return alrt;
	}
}
