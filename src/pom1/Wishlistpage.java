package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage {
	@FindBy(xpath="//a[.='Remove item']")
	private WebElement removeitem;
	@FindBy(xpath="//a[.='	Add to Cart']")
	private WebElement addtocart;

	
	public Wishlistpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void removeitem() {
		removeitem.click();
	}
	public void addtocart() {
		removeitem.click();
	}

}
