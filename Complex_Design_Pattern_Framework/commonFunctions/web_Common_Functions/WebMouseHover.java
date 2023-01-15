package web_Common_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class WebMouseHover {

	public static void mouseHover(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver",
				"F:\\Libraries/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.metropolisindia.com/parameter/food-intolerance-test");
		WebElement bt = driver.findElement(By.xpath("//li[text() = 'Blood Tests ']"));
		
		/*
		 * Actions action = new Actions(driver); Thread.sleep(3000);
		 * action.moveToElement(bt).perform();
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.partialLinkText("Food Intolerance Test")).click();
		 * 
		 *
		 */
		mouseHover(driver, bt); 
		Thread.sleep(2000);
 		 mouseHover(driver, driver.findElement(By.partialLinkText("Food Intolerance Test")));
 		Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Food Intolerance Test")).click();
		 System.out.println("success");
		 
		
	}
}
