package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionlib {
	public WebDriver driver;
	public static void movetoelement(WebDriver driver,WebElement target) {
		
		
		Actions a =new Actions(driver);
		a.moveToElement(target).perform();
	}

}
