package genericlibraries;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selectlib {
	
	
	public static void select(WebElement ele,int index) {
		Select s=new Select(ele);
		s.selectByIndex(index);
	}

}
 