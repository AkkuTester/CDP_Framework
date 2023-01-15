package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import properties_Readers.Knowledgeware_PropertiesReader;
import web_Common_Functions.BrowserInitialization;

public class BaseClass_Knowledgeware {
	
	public WebDriver driver =null;
/*
	@BeforeMethod
	public void basicRequisites() {
	System.setProperty("webdriver.edge.driver",
			"F:\\Libraries/msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get("https://www.knowledgeware.in/final.html");

}*/
/*	
	@BeforeMethod
	public void basicRequisites() throws Exception {
//
//		System.setProperty("webdriver.edge.driver",
//			"F:\\Libraries/msedgedriver.exe");
//	driver = new EdgeDriver();
//	
	driver =BrowserInitialization.browserOpening("edge");
	driver.get(Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "url"));
}
	*/
	@BeforeClass
	@Parameters({"browser"})
	public void basicRequisites(String bName) throws Exception {
		driver =BrowserInitialization.browserOpening(bName);
		driver.get(Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "url"));
	}

public void close() {
	//driver.close();
}

}
