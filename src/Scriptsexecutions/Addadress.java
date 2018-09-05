package Scriptsexecutions;

import org.testng.annotations.Test;

import genericlibraries.Basetest;
import genericlibraries.Excel;
import pom1.Adresspage;
import pom1.Cartpage;
import pom1.Homepage;
import pom1.Loginpage;
import pom1.Selectedproductpage;

public class Addadress extends Basetest {
    @Test   
		public void addadres() throws InterruptedException {
	     Loginpage l=new Loginpage(driver);
			l.signinbtn();
			String username = Excel.getdata("sheet7",3,2);
			l.username(username);
			 String password = Excel.getdata("sheet7",4,2);
			l.password(password);
			l.login();
			Thread.sleep(6000);
			
		
			Homepage h=new Homepage(driver);
			h.myaccounttab(driver);
			h.addressbook();
			Adresspage ad=new Adresspage(driver);
			ad.addadress();
			String streetadress= Excel.getdata("sheet7",8,2);
			ad.streettb(streetadress);
			String city = Excel.getdata("sheet7",9,2);
			ad.citytb(city);
			String telephone = Excel.getdata("sheet7",10,2);
			ad.telephonetb(telephone);
			ad.shipping();
			String postcode = Excel.getdata("sheet7",12,2);
			ad.postcode(postcode);
			ad.region(driver);
	
			ad.saveadress();
			  


       
	}


}
