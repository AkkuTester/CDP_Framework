package web_Common_Functions;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class WebCheckBoxe {

	public static void singleCheckkBox(WebElement element) {
		if(Checks.isClickable(element)) {
			element.click();
		}
	}
	
	public static void allCheckboxes(List<WebElement> elements) {
		
		for(WebElement options : elements) {
			options.click();
		}
	}
	
	public static void multipleCheckboxes(List<WebElement> elements, WebElement arr[]) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<elements.size(); j++) {
				if(arr[i].equals(elements.get(j))) {
					elements.get(j).click();
				}
			}
		}
	}
	
}
