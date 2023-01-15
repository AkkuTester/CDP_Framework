package web_Common_Functions;

import org.openqa.selenium.WebElement;

public class WebTextBox {
	// this class is for all the input tags, where sendKeys are performed
	/*
	 * purpose- to enter the text into the input field
	 * parameter - webElement, String input
	 * return - void
	 */
	public static void sendInput(WebElement element, String input) {

			if(Checks.isClickable(element)) {
				element.sendKeys(input);
			}
		}	
	/*
	 * following method will clear the pre existing text from the text field
	 */
	public static void clearText(WebElement element) {
		if(Checks.isClickable(element)) {
			element.clear();
		}
	}

}
