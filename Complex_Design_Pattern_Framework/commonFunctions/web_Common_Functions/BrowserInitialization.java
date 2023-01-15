package web_Common_Functions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserInitialization {
	
	public static WebDriver driver = null;
	
	public static WebDriver browserOpening(String browserName) {
		switch (browserName.toLowerCase()) {
		case "edge" :
			System.setProperty("webdriver.edge.driver",
					"F:\\Libraries/msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.setProperty("webdriver.edge.driver",
					"F:\\Libraries/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		}
		return driver;
	}

}
