package Scriptsexecutions;

	import java.util.concurrent.TimeUnit;


	import org.openqa.selenium.WebDriver;
     import org.testng.annotations.Test;
import genericlibraries.Basetest;
import genericlibraries.Excel;
import pom1.Cartpage;
import pom1.Homepage;
	import pom1.Loginpage;
import pom1.Productpage;
import pom1.Selectedproductpage;

	public class Editcart extends Basetest  {
	
		
              @Test   
		public void editcart() throws InterruptedException {
	     Loginpage l=new Loginpage(driver);
			l.signinbtn();
			String username = Excel.getdata("Sheet9",3,2);
			l.username(username);
			 String password = Excel.getdata("Sheet9",4,2);
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
			  
				 p.productsize();
				 p.selectsize();
				 Thread.sleep(6000);
				 
				Thread.sleep(3000);
				 p.addtocart();
				 
			  
			 Cartpage c = new Cartpage(driver);
			 Thread.sleep(3000);
			
	
			 Thread.sleep(3000);
			 c.cart(driver);
			 c.edititem();
			 p.productsize();
			 p.selectsize();
			 Thread.sleep(6000);
			 p.quantity(1);
			Thread.sleep(3000);
			 p.addtocart();
        
	}

}
