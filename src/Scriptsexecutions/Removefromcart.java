  package Scriptsexecutions;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericlibraries.Basetest;
import genericlibraries.Excel;
import genericlibraries.Popups;
import genericlibraries.constant;
   import pom1.Cartpage;
   import pom1.Homepage;
	import pom1.Productpage;
	import pom1.Loginpage;
	import pom1.Selectedproductpage;

	public class Removefromcart  extends Basetest {

		@Test
		public void removefromcart() throws InterruptedException {
		    Loginpage l=new Loginpage(driver);
			l.signinbtn();
			String username = Excel.getdata("sheet4",3,2);
			l.username(username);
			 String password = Excel.getdata("sheet4",4,2);
			l.password(password);
			l.login();
			Thread.sleep(6000);
		
			Homepage h=new Homepage(driver);
			h.shopnowbutton();
			  

	       Selectedproductpage p=new Selectedproductpage(driver);
			  
			 p.productsize();
			 p.selectsize();
			Thread.sleep(3000);
			 p.addtocart();
			 
			 Cartpage c = new Cartpage(driver);
			 Thread.sleep(3000);
			
			 
			 Thread.sleep(3000);
			 c.cart(driver);
			 c.removeitem();
			 Thread.sleep(6000);
              Popups.alert(driver);

	}

}
