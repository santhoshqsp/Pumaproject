package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.Actionlib;
import genericlibraries.Selectlib;

public class Adresspage {
	 @FindBy(xpath="//button[@title='Add New Address']")
	 private WebElement addadress;
	 
	 @FindBy(id="firstname")
	 private WebElement firstname;
		
	 @FindBy(name="telephone")
	private WebElement telephone;
	 
	 @FindBy(name="street[]")
		private WebElement street;

	 @FindBy(name="city")
		private WebElement cityname;
	 @FindBy(name="postcode")
		private WebElement postcode;
	
	@FindBy(id="region_id")
	private WebElement regionalid;
	
	@FindBy(linkText="Delete Address")
	private WebElement deleteaddress;
	
	@FindBy(id="primary_shipping")
	private WebElement shipping;
	
	@FindBy(xpath="(//span[.='Save Address'])[1]")
	private WebElement saveadress;
	
	public Adresspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addadress() {
	  addadress.click();
	}
	public void deleteaddres() {
		  deleteaddress.click();
		}
	public void saveadress() {
		  saveadress.click();	 
	}
	public void postcode(String postcode1) {
		postcode.sendKeys(postcode1);
	}
	public void telephonetb(String number) {
		
		telephone.sendKeys(number);
	}
	public void streettb(String adress) {
		
		street.sendKeys(adress);
		}
		public void shipping() {
			
			shipping.click();
	}
      public void citytb(String cityname1) {
		
		cityname.sendKeys(cityname1);
	}
	
	public void region(WebDriver driver) {
		Selectlib.select(regionalid,17);
	
	}
	

}
