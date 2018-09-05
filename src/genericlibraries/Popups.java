package genericlibraries;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Popups {

	public  static void alert( WebDriver driver)  {
		Alert a = driver.switchTo().alert();
	       a.accept();
	}
	public static void childbrowser(WebDriver driver) {
		 Set<String> child = driver.getWindowHandles();
         for(String s1:child)
      	   driver.switchTo().window(s1);
	}

}

		