package web_Common_Functions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TakeScreenshot {
	
	/*
	 * this is the common method for taking the screenshots
	 */

	/*
	 * public static String takeScreenShot(WebDriver driver, String
	 * screenShotName)throws Exception { String dateName = new
	 * SimpleDateFormat("dd_MM_yyyy_hh:mm:ss").format(new Date()); TakesScreenshot
	 * ts = (TakesScreenshot) driver; File screeenhsotFile
	 * =ts.getScreenshotAs(OutputType.FILE);
	 * 
	 * String destination =
	 * "C:\\Users\\HP\\eclipse-workspace\\Complex_Design_Pattern_Framework\\Knowledgeware\\Screenshot/"
	 * +dateName +".png"; File destFile = new File(destination);
	 * 
	 * FileUtils.copyFile(screeenhsotFile, destFile);
	 * 
	 * return destination; }
	 */
	
	public static void takeScreenShot(WebDriver driver, String filePath) throws Exception {
		TakesScreenshot ss= (TakesScreenshot) driver;
		File src =ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(filePath);
		FileUtils.copyFile(src, dest);
		/*
		 * filePath = folder where we wanted to store the screen shot
		 */
	}
	
	/* public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver",
				"F:\\Libraries/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		// ChromeDriver driver = new ChromeDriver(); // if we initialize driver like this, then no need to type cast the
		//TakseScreenshot interface, as all the methods from takescreenshot have been implemented in the chrome driver
		String fileName = "demo";
		TakesScreenshot ss = (TakesScreenshot) driver;
		// casting is nothing but, we are doing friendship between two unknown interfaces
		File src =	ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Medifox_Testing_Datas\\Screenshot/" +fileName + ".png");
		FileUtils.copyFile(src, dest);
		
		String fileName1 = ".\\Medifox_Testing_Datas\\Screenshot/demo2.png";
		takeScreenShot(driver, fileName1);
}*/


}
