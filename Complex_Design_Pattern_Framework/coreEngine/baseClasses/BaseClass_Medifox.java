package baseClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import properties_Readers.Medifox_PropertiesReader;
import web_Common_Functions.BrowserInitialization;

public class BaseClass_Medifox {
	
	public WebDriver driver = null;
	
	@BeforeClass
	public void basicRequisites() throws Exception {
		driver = BrowserInitialization.browserOpening("edge");
		driver.get(Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "url"));
	}
	
	@AfterClass
	public void closeDown() {
		driver.close();
	}
}
