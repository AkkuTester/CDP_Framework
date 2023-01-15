package medifox_Test;

import org.testng.annotations.Test;
import baseClasses.BaseClass_Medifox;
import medifox_Actions.PathologyBloodTest_Action;
import properties_Readers.Medifox_PropertiesReader;

public class PathologyBloodTests_Test extends BaseClass_Medifox{
	
	PathologyBloodTest_Action bloodTests = null;
	@Test(priority = 1)
	public void loginTest() throws Exception {
		bloodTests = new PathologyBloodTest_Action(driver);
		bloodTests.login(Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "userName"), 
				Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "password"));
	}
	
	@Test(priority = 2)
	public void validatePathology() {
		bloodTests.valildatePathology();
	}
	
	@Test(priority = 3) 
	public void validateBTText() throws Exception {
	bloodTests.validateBT();
	}
	
}
