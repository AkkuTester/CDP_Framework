package web_Common_Functions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebWait {
	 static int seconds = 10;
	/*
	 * purpose - the following method will apply explicite waits on the elements
	 * 
	 */

	public static WebElement elementPresent(WebDriver driver, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
	WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(element));
	return visibleElement;
	}
	
	public static boolean elementSelection(WebDriver driver, WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		boolean	elementSelected =	wait.until(ExpectedConditions.elementToBeSelected(element));
		return elementSelected;
	}
	public static WebElement elementClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		WebElement elementClick =	wait.until(ExpectedConditions.elementToBeClickable(element));
		return elementClick;
	}
	
	
}
