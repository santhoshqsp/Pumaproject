package genericlibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom1.Cartpage;
import pom1.Homepage;
import pom1.Loginpage;
import pom1.Selectedproductpage;


public class Basetest implements constant {
	public static WebDriver driver;
	@BeforeMethod
	public  void openapp() {
		System.setProperty(key,value);
		 driver = new ChromeDriver();
		
		String url = Excel.getdata("sheet1",1,2);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
        
         @AfterMethod
        public  void closeapp(ITestResult testname) throws InterruptedException
         {
        	 String name=testname.getName();
        	 int status=testname.getStatus();
        	 if(status==2)
        	 {
        		 Photo.getphoto(photopath, name, driver);
        	 }
             Thread.sleep(6000);
        	driver.quit();
         }


}
