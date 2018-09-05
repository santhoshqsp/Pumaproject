package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	@FindBy(xpath="//img[@title='Green']")
	private WebElement green;
	
	@FindBy(xpath="(//span[@class='swatch-label'])[2]")
			private WebElement size;
	
	@FindBy(xpath="(//h2[@class='product-name'])[8]")
	private WebElement productcric;
	
	@FindBy(linkText="Jackets")
	private WebElement jackets;
	
	@FindBy(linkText="Price[High]")
	private WebElement pricehigh;
	
	@FindBy(linkText="Evostripe Ultimate Sportstyle Men's Jacket")
	private WebElement selectproduct;
	
	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void pricehigh() {
		pricehigh.click();
	}
	
	public void green() {
	  green.click();
	}
	public void product3() {
		productcric.click();
	}
	public void size() {
		size.click();
	}
	public void selectproduct() {
		selectproduct.click();
	}
	 
	

	


}
