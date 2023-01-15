package web_Common_Functions;


import org.openqa.selenium.*;

public class WebAlert {
	/*
	 *  this method will accept the alert
	 */
	public static void acceptAlert(WebDriver driver) {
		
		if(Checks.isAlertPresent(driver)!=null) {
			driver.switchTo().alert().accept();
		}
	}
	/*
	 * this method will decline the alert
	 */
	public static void declineAlert(WebDriver driver) {
		if(Checks.isAlertPresent(driver) != null) {
			driver.switchTo().alert().dismiss();
		}
	}
	/*
	 * this method will send input to the alert
	 */
	public static void sendAlertInput(WebDriver driver, String input) {
		if(Checks.isAlertPresent(driver)!=null) {
		Alert alrt = driver.switchTo().alert();
			alrt.sendKeys(input);
			alrt.accept();
		}
	}
	/*
	 * this method will return the text inside the alert
	 */
	public static String alertText(WebDriver driver) {
		String text= null;
		if(Checks.isAlertPresent(driver)!=null) {
		text =driver.switchTo().alert().getText();
		}
		return text;
	}
}
