package Scriptsexecutions;

import org.testng.annotations.Test;

import genericlibraries.Basetest;
import genericlibraries.Excel;
import genericlibraries.Scrollbarlib;
import pom1.Cartpage;
import pom1.Checkoutpage;
import pom1.Homepage;
import pom1.Loginpage;
import pom1.Productpage;
import pom1.Selectedproductpage;

public class Selectproductandlogin extends Basetest {

	@Test
	public void  selectproductandlogin() throws InterruptedException {
	   
		 String product = Excel.getdata("sheet8",2,2);
		 Homepage h=new Homepage(driver);
         h.searchbox(product);
         h.submitbtn();
		  

        Productpage p=new Productpage(driver);
        p.pricehigh();
        Scrollbarlib.scrollby(driver, 0, 500 );
		p.product3();
		  Selectedproductpage p1=new Selectedproductpage(driver);
		  
			 p1.productsize();
			 p1.selectsize();
			Thread.sleep(3000);
			 p1.addtocart();
			 Cartpage c = new Cartpage(driver);
			 Thread.sleep(3000);
			 c.proceedtocheckout();
			 c.LOGIN();
	       Checkoutpage l=new Checkoutpage(driver);
		
			String username = Excel.getdata("sheet8",10,2);
			l.emailtb(username);
			 String password = Excel.getdata("sheet8",11,2);
			l.passtb(password);
			l.login();
			Thread.sleep(6000);

}
}
