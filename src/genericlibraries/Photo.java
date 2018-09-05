package genericlibraries;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Photo {
	public static WebDriver driver;
	public static String getphoto(String folder,String testcasename,WebDriver driver) {
		String path="";
		try {
			Date d=new Date();
			String date=d.toString().replace(":", "-");
			path=folder+testcasename+date+".png";
		
	 TakesScreenshot t=(TakesScreenshot) driver;
     File src=t.getScreenshotAs(OutputType.FILE);

     FileUtils.copyFile(src, new File(path) );
	}
		catch(Exception e) {
			Reporter.log(" photo is taken");
			
		}
		return path;
	}

}
