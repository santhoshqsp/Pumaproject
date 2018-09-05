package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.Actionlib;

public class Cartpage {

	@FindBy(xpath="(//button[@title='Proceed to Checkout'])[1]")
	private WebElement proceedtocheckout;
	
	@FindBy(xpath="//span[@class='cart_icon']")
			private WebElement cart;
	
	@FindBy(xpath="//a[@class='remove']")
	private WebElement removeitem;
	
	@FindBy(xpath="//a[@class='btn-edit']")
	private WebElement edititem;
	
	@FindBy(linkText="LOGIN")
	private WebElement LOGIN;
	
	
	public Cartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void proceedtocheckout() {
	  proceedtocheckout.click();
	}
	public void LOGIN() {
		  LOGIN.click();
		}
	public void removeitem() {
		removeitem.click();
	}
	public void cart(WebDriver driver) {
		Actionlib.movetoelement(driver,cart);
	}
	public void edititem() {
		edititem.click();
	}
	
	
}
