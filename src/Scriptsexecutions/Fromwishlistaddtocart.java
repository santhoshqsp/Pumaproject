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
import pom1.Homepage;
import pom1.Productpage;
import pom1.Loginpage;
import pom1.Selectedproductpage;
import pom1.Wishlistpage;

public class Fromwishlistaddtocart extends Basetest {

	@Test(priority=-2)
	public void  fromwishlistaddtocart() throws InterruptedException {
	
	    Loginpage l=new Loginpage(driver);
		l.signinbtn();
		String username = Excel.getdata("sheet6",3,2);
		l.username(username);
		 String password = Excel.getdata("sheet6",4,2);
		l.password(password);
		l.login();
		Thread.sleep(6000);
		
		Homepage h=new Homepage(driver);
	      h.mentab(driver);
		
		
		Productpage j=new Productpage(driver);
		  h.jackets();
		  j.green();
		  j.size();
		  Thread.sleep(3000);
	      j.selectproduct();
		  

       Selectedproductpage p=new Selectedproductpage(driver);
		   p.addtowishlist();
		   h.myaccounttab(driver);
	       l.mywishlist();
	       Wishlistpage w=new  Wishlistpage(driver);
	       w.addtocart();
	       Popups.alert(driver);
	       Thread.sleep(3000);
	   
		  
		  

	}

}
