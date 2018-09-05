package pom1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import genericlibraries.Excel;
import genericlibraries.Selectlib;

public class Selectedproductpage {
	@FindBy(linkText="Add to Wishlist")
	private WebElement addtowishlist;
	
	@FindBy(xpath="//div[@class='add-to-cart-buttons']")
	private WebElement addtocart;
	
	@FindBy(xpath="//div[@class='product-size-click-btn']")
	private WebElement productsize;
	
	@FindBy(xpath="(//span[@class='swatch-label2'])[3]")
	private WebElement selectsize;
	
	 @FindBy(name="send")
	private WebElement login;
	 
	  @FindBy(name="qty")
		private WebElement quantity;
		 
	 
	 @FindBy(linkText="Share Facebook")
		private WebElement sharefb;
	 
	public Selectedproductpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addtowishlist() {
		addtowishlist.click();
	}
	public void addtocart() {
		addtocart.click();
	}
	public void productsize() {
		productsize.click();
	}
	public void sharefb() {
		sharefb.click();
	}
	public void login() {
		login.click();
	}
	public void quantity(int number) {
		Selectlib.select(quantity, number);
	}
	
	public void selectsize() {
		selectsize.click();
	}
	
	
}
