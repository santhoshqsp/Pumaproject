package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
		
	@FindBy(xpath="(//span[.='Login'])[1]")
			private WebElement login;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(name="login[username]")
	private WebElement email;
	
	@FindBy(linkText="LOGIN")
	private WebElement LOGIN;
	
	
	public Checkoutpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void login() {
	  login.click();
	}
	public void emailtb(String email1) {
		  email.sendKeys(email1);
		}
	public void passtb(String pass1) {
		pass.sendKeys(pass1);
	}

	public void LOGIN() {
		LOGIN.click();
	}

}
