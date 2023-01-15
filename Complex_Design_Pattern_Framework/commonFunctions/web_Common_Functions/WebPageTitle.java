package web_Common_Functions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class WebPageTitle {
	
	public static String verifyPageTitle(WebElement element) {
		String title = element.getText();
		return title;
	}
	
	
	
	
	/*
	 * public static void main(String[] args) {
	 * System.setProperty("webdriver.edge.driver",
	 * "F:\\Libraries/msedgedriver.exe"); WebDriver driver = new EdgeDriver();
	 * driver.get("https://nursingdemo.medifox.in.net/Account/Login");
	 * 
	 * WebElement title = driver.findElement(By.xpath("(//h4)[2]")); String tn
	 * =title.getText(); System.out.println(tn);
	 * 
	 * }
	 */
}
