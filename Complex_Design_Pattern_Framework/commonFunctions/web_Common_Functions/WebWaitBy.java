package web_Common_Functions;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class WebWaitBy {
	
	public static WebElement webExpliciteWait(WebDriver driver, By b) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement ele =wait.until(ExpectedConditions.elementToBeClickable(b));
	return ele;
	}
	
	public static WebElement elementPresent(WebDriver driver, By b) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement flag = wait.until(ExpectedConditions.presenceOfElementLocated(b));
	return flag;
	}

}
