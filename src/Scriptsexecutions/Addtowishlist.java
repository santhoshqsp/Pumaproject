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
import genericlibraries.constant;
import pom1.Homepage;
import pom1.Productpage;
import pom1.Loginpage;
import pom1.Selectedproductpage;

public class Addtowishlist extends Basetest {

	@Test
	public void addtowishlist() throws InterruptedException {
	
	    Loginpage l=new Loginpage(driver);
		l.signinbtn();
		String username = Excel.getdata("sheet2",3,2);
		l.username(username);
		 String password = Excel.getdata("sheet2",4,2);
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
		  
		  

	}

}
