package web_Common_Functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import baseClasses.BaseClass_Knowledgeware;

public class WebSelect extends BaseClass_Knowledgeware{
	
	/*
	public void select() {
	WebElement selct = driver.findElement(By.name("Birthday_day"));
	
	//Select select = new Select(selct); // passing the element
	
	}*/
	public static void selectByText(WebElement element, String selectValue) {
		Select select = new Select(element);
		select.selectByVisibleText(selectValue);
	}

	public static void selectAll(WebElement element) {
		
		Select select = new Select(element);
		if(select.isMultiple()) {
			
	List<WebElement> options=select.getOptions();
			for(WebElement E: options) {
				E.click();
			}
		}else {
		Assert.assertEquals(select.isMultiple(), true);
		}
	}
	
	// firstly consiering visible text
	/*
	 * public static void selectMultiple(List<WebElement> element, String values[])
	 * { //Select select = new Select((WebElement) element);
	 * 
	 * //Select select = new Select(element); if(select.isMultiple()) {
	 * List<WebElement> options = select.getOptions();
	 * 
	 * for(int i=0; i<options.size(); i++) {
	 * 
	 * for(int j =0; j<values.length;j++) { if(options.get(i).equals(values[j])) {
	 * options.get(i).click(); } } } }else {
	 * Assert.assertEquals(select.isMultiple(), true); }
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"F:\\Libraries/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/TAGS/tryit.asp?filename=tryhtml_select_multiple");
		//driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		driver.switchTo().frame("iframeResult");
		
	//WebElement opt = driver.findElement(By.name("cars"));
	WebElement opt = driver.findElement(By.name("cars"));
	
	
	Select select = new Select(opt);
	
	if(select.isMultiple()) {
		List<WebElement> list = select.getOptions();
		for(WebElement L:list) {
			L.click();
		}
	}else
		System.out.println("not multiple");
	}	
	
	//selectAll(opt);


}


