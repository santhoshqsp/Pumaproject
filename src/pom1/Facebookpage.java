package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookpage {

	@FindBy(id="email")
	private WebElement username;
	
	
	@FindBy(id="pass")
			private WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement click;
	
	@FindBy(linkText="Edit Item ")
	private WebElement edititem;
	
	public Facebookpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void username(String username1) {
	  username.sendKeys(username1);
	}
	public void password(String password1) {
		password.sendKeys(password1);
	}
	public void click() {
		click.click();
	}
	
	
	
}
