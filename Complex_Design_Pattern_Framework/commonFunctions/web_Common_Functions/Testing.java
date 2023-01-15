package web_Common_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Testing {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver",
				"F:\\Libraries/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.knowledgeware.in/final.html");
	
	By b = By.name("name");
	WebTextBoxBy.sendInput(driver, "nifty", b);

	}
//@DataProvider

public Object [][] dp(){
	Object [][] data = {
		{"Supriya", 24, 's'},
		{"Akash", 12, 'A'}
	};
	return data;
  }
}

