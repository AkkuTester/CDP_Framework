package knowledgeware_Action;

import org.openqa.selenium.*;

import knowledgeware_Locators.PageTwo_Locator;
import web_Common_Functions.WebClick;
import web_Common_Functions.WebSelect;
import web_Common_Functions.WebTextBox;

public class PageTwo_Action {
	WebDriver driver = null;
	PageTwo_Locator ptl = null;
	
	public PageTwo_Action(WebDriver driver) {
		this.driver = driver;
		ptl = new PageTwo_Locator(driver);
	}
	
	//entering first name
	public void enterFname(String fname) {
		WebTextBox.sendInput(ptl.getFirstName(), fname);
	}
	//entering last name
	public void enterLname(String lname) {
		WebTextBox.sendInput(ptl.getlastName(), lname);
	}
	
	//selecting dob
	public void enterDate(String date) {
		WebSelect.selectByText(ptl.getBirthD(), date);
	}
	//selecting dom
	public void enterMonth(String month) {
		WebSelect.selectByText(ptl.getBirthM(), month);
	}
	//selecting year
	public void enterYear(String year) {
		WebSelect.selectByText(ptl.getBirthY(), year);
	}
	//entering email id
	public void enterEmail(String email) {
		WebTextBox.sendInput(ptl.getEmail(), email);
	}
	//entering mobile
	public void enterMobile(String mobile) {
		WebTextBox.sendInput(ptl.getMobile(), mobile);
	}
	//selecting gender
	public void genderSelect() {
		WebClick.click(driver, ptl.getGender());
	}
	//clicking on next
	public void nextClick() {
		WebClick.click(driver, ptl.clickNext());
	}
	
//common method for all the above actions
	
	public void commonActionsPageTwo(String fn, String ln, String d, String m, String y, String em, String mob) {
		enterFname(fn);
		enterLname(ln);
		enterDate(d);
		enterMonth(m);
		enterYear(y);
		enterEmail(em);
		enterMobile(mob);
		genderSelect();
		nextClick();
	}
}
