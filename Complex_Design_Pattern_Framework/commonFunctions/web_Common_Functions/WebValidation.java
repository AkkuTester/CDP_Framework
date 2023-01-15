package web_Common_Functions;

import org.openqa.selenium.WebElement;

public class WebValidation {
	public static String getElementText(WebElement element) {
		String title = element.getText();
		return title;
	}
	
	public static boolean logoValidation(WebElement element) {
		boolean flag = false;
		if(element.isDisplayed()) {
			flag =true;
		}
			
		return flag;
					
	}
}
