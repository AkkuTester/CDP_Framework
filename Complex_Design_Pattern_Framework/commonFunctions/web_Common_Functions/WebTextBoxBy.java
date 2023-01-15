package web_Common_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTextBoxBy {
	
	public static void sendInput(WebDriver driver, String input, By b) {
		if(WebWaitBy.elementPresent(driver, b) != null) {
		WebElement element = WebWaitBy.elementPresent(driver, b);
		element.sendKeys(input);
		}
		
		
	}

}
