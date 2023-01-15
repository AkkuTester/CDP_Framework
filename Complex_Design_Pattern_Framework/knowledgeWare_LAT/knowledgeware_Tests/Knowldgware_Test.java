package knowledgeware_Tests;

import org.testng.annotations.Test;

import baseClasses.BaseClass_Knowledgeware;
import knowledgeware_Action.PageFive_Action;
import knowledgeware_Action.PageFour_Action;
import knowledgeware_Action.PageOne_Action;
import knowledgeware_Action.PageThree_Action;
import knowledgeware_Action.PageTwo_Action;
import knowledgeware_Locators.PageFive_Locator;
import properties_Readers.Knowledgeware_PropertiesReader;

public class Knowldgware_Test extends BaseClass_Knowledgeware {
	
	@Test(priority = 1, description = "entering_details_into_the_Login_Page")
	public void pageOneTest() throws Exception {
		PageOne_Action poa = new PageOne_Action(driver);
		//poa.enterPageOneDetails("nifty", "banknifty", "smallcap");
//		poa.enterPageOneDetails(Knowledgeware_PropertiesReader.getUserName("username"), 
//				Knowledgeware_PropertiesReader.getPass("password"), 
//				Knowledgeware_PropertiesReader.getconfPass("confirmpassword"));
	poa.enterPageOneDetails
	(Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "username"), 
			Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "password"), 
			Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "confirmpassword"));
		
	}
	@Test(priority = 2, description = "Registering_User_Page_1")
	public void PageTwoTest() throws Exception {
		PageTwo_Action ptl = new PageTwo_Action(driver);
		ptl.commonActionsPageTwo
		(Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "firstName"), 
		Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "lastName"), 
		Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "birthDay"), 
		Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "bithMonthh"), 
		Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "birthYear"),
		Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "email"),
		Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "mobile"));
	}
	@Test(priority = 3, description = "Registering_User_Page_2")
	public void pageThreeTest() throws Exception {
		PageThree_Action pt3 = new PageThree_Action(driver);
		pt3.PageThreeCommonActions
		(Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "address"), 
			Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "city"),  
			Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "pin"),  
			Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "state"), 
			Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, "country") );
	}
	
	@Test(priority = 4, description = "Registering_User_Page_3")
	public void pageFourTest() throws Exception {
		PageFour_Action fourAction = new PageFour_Action(driver);
		fourAction.PageFourCommActions(Knowledgeware_PropertiesReader.getConfigValues(Knowledgeware_PropertiesReader.filePath, 
				"otherHobby"));
	}
	
	@Test(priority = 5, description = "SuccesfullY_Registered_Or_Not_?")
	public void validateRegSuccess() throws Exception {
		PageFive_Action fiveAction = new PageFive_Action(driver);
		fiveAction.pageFiveComActions();
	}
	
}
