package pom1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage{
	@FindBy(linkText="Sign In")
	private WebElement signin;
	
	@FindBy(id="magestore-sociallogin-popup-email")
	private WebElement username1;
	
	@FindBy(id="magestore-sociallogin-popup-pass")
	private WebElement password1;
	
	@FindBy(name="send")
	private WebElement login;
	 
	@FindBy(linkText="My Wishlist")
	private WebElement mywishlist;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void signinbtn() {
		signin.click();
	}
	public void username(String username) {
		username1.sendKeys(username);
	}
	public void password(String password) {
		password1.sendKeys(password);
	}
	public void login() {
		login.click();
	}
	public void mywishlist() {
		mywishlist.click();
	}
	
	
	
}
