package medifox_Test;

import org.testng.annotations.Test;

import baseClasses.BaseClass_Medifox;
import medifox_Actions.PatientRegistration_Action;
import properties_Readers.Medifox_PropertiesReader;

public class PatientRegistration_Test extends BaseClass_Medifox {
	
	PatientRegistration_Action regA = null;
	
	@Test
	public void login() throws Exception {
		regA = new PatientRegistration_Action(driver);
		regA.combineLoginFunctions(Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "un"), 
				Medifox_PropertiesReader.getConfigValue(Medifox_PropertiesReader.filepath, "pass"));
	}
	

}
