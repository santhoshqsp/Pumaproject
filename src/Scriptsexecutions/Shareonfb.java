package Scriptsexecutions;

	import java.util.Set;
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
import genericlibraries.Scrollbarlib;
import genericlibraries.constant;
import pom1.Cartpage;
import pom1.Facebookpage;
import pom1.Homepage;
	import pom1.Productpage;
	import pom1.Loginpage;
	import pom1.Selectedproductpage;

	public class Shareonfb extends Basetest {

		@Test
		public void shareonfb() throws InterruptedException {
		    Loginpage l=new Loginpage(driver);
			l.signinbtn();
			String username = Excel.getdata("sheet3",3,2);
			l.username(username);
			 String password = Excel.getdata("sheet3",4,2);
			l.password(password);
			l.login();
			Thread.sleep(6000);
			 String product = Excel.getdata("sheet3",6,2);
			 Homepage h=new Homepage(driver);
	         h.searchbox(product);
	         h.submitbtn();
			  

	        Productpage p=new Productpage(driver);
	        p.pricehigh();
	        Scrollbarlib.scrollby(driver, 0, 500 );
			p.product3();
			Selectedproductpage s=new Selectedproductpage(driver);
			s.sharefb();
		    Popups.childbrowser(driver);
		
			   String username1 = Excel.getdata("sheet3",13,2);
			   String password1 = Excel.getdata("sheet3",14,2);
			   Facebookpage f=new Facebookpage(driver);
			   f.username(username1);
			   f.password(password1);
			   f.click();
			  
				 
			 
			
			

	}

}
