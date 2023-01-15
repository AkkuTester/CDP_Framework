package web_Common_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practise_Testing {

	@DataProvider
	public Object[][] dataTesting(){
		Object[][] data = {
						   {"admin" , "123"},
						   {"admin", "Koo"},
						   {"admin", "     "}
						   };
		
		return data;
	}
	//@Test
	public void login() throws Exception {
		Thread.sleep(3000);
		System.setProperty("webdriver.edge.driver",
				"F:\\Libraries/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://nursingdemo.medifox.in.net/Account/Login");
		driver.findElement(By.name("Username")).sendKeys("admin");
		driver.findElement(By.name("Password")).sendKeys("1236");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		WebElement u = driver.findElement(By.name("Username"));
		String tempV = u.getAttribute("value");
		System.out.println(tempV);

		boolean flag = tempV.isEmpty();
		Assert.assertFalse(flag);
		
	}
	//@Test
	public void windowHandle() {
		System.setProperty("webdriver.edge.driver",
				"F:\\Libraries/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		
		String windowH = driver.getWindowHandle();
		System.out.println(windowH); //CDwindow-E4AFEA9B11AF18186F7D70C7A84BA4A6
	
	} 
	@Test
	public void multipleDD() {
		System.setProperty("webdriver.edge.driver",
				"F:\\Libraries/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.mobiscroll.com/jquery/select/multiple-select#");
		
		driver.findElement(By.xpath("//div[@id='demo-multiple-select']//span[@class=' mbsc-ios mbsc-ltr mbsc-textfield-inner mbsc-textfield-inner-outline mbsc-textfield-inner-stacked mbsc-textarea-inner mbsc-textfield-tags-inner']//span[2]")).click();
		
	}
	
}
