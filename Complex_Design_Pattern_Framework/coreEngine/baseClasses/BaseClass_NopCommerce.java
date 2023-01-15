package baseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

import properties_Readers.Knowledgeware_PropertiesReader;
import properties_Readers.NopCommerce_PropertiesReader;

public class BaseClass_NopCommerce {
	public WebDriver driver =null;
	
	@BeforeMethod
	public void basicRequisites() throws Exception {
	System.setProperty("webdriver.edge.driver",
			"F:\\Libraries/msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get(NopCommerce_PropertiesReader.getConfigValues(NopCommerce_PropertiesReader.filepath, "url"));

}
}
