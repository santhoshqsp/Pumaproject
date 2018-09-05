package Scriptsexecutions;

	import java.util.concurrent.TimeUnit;


	import org.openqa.selenium.WebDriver;
     import org.testng.annotations.Test;
import genericlibraries.Basetest;
import genericlibraries.Excel;
import pom1.Cartpage;
import pom1.Homepage;
	import pom1.Loginpage;
	import pom1.Selectedproductpage;

	public class Addtocart extends Basetest  {
	
		
              @Test(priority=-1)  
		public void addtocart() throws InterruptedException {
	     Loginpage l=new Loginpage(driver);
			l.signinbtn();
			String username = Excel.getdata("sheet1",3,2);
			l.username(username);
			 String password = Excel.getdata("sheet1",4,2);
			l.password(password);
			//l.login();
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
			 c.proceedtocheckout();

        
	}

}
