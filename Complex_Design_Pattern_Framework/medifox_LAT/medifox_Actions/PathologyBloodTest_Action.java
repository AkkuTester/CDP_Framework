package medifox_Actions;

import org.openqa.selenium.*;
import org.testng.Assert;
import medifox_Locators.PathologyBloodTests_Locator;
import web_Common_Functions.*;


public class PathologyBloodTest_Action {
	WebDriver driver = null;
	PathologyBloodTests_Locator pBloodTests = null;
	
	public PathologyBloodTest_Action(WebDriver driver) {
		this.driver = driver;
		pBloodTests = new PathologyBloodTests_Locator(driver);
	}
	public void login(String userName, String Password) {
		WebTextBox.clearText(pBloodTests.getUserName());
		WebTextBox.sendInput(pBloodTests.getUserName(), userName);
		WebTextBox.sendInput(pBloodTests.getPassword(), Password);
		WebClick.click(driver, pBloodTests.clickLogin());
	}
	public void valildatePathology() {
		String flag = WebValidation.getElementText(pBloodTests.getPathology());
		Assert.assertEquals(flag, "Pathology");
	}
	public void validateBT() throws Exception {
		driver.get("https://www.metropolisindia.com/");
		String flag = WebValidation.getElementText(pBloodTests.getValidateBT());
		Assert.assertEquals(flag, "Blood Tests");
	}
	
}
