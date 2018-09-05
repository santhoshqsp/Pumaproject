package pom1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.Actionlib;


public class Homepage{
	@FindBy(xpath="(//a[@class='btn2 btn'])[1]")
	private WebElement shopnow;
	
	@FindBy(linkText="My Account")
			private WebElement myaccount;
	
	@FindBy(linkText="Address Book")
	private WebElement addressbook;
	
	@FindBy(linkText="Jackets")
	private WebElement jackets;
	 
	 @FindBy(id="search")
	 private WebElement search;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 private WebElement submit;
		
	 @FindBy(name="send")
	private WebElement login;
	 
	 @FindBy(linkText="Find a Store")
		private WebElement findstore;
	
	@FindBy(xpath="(//a[@class='digimeg-nav-item'])[1]")
	private WebElement men;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void shopnowbutton() {
	  shopnow.click();
	}
	public void jackets() {
		jackets.click();
	}
	public void addressbook() {
		addressbook.click();
	}
	public void login() {
		login.click();
	}
	public void findstore() {
		findstore.click();
	}
	public void mentab(WebDriver driver) {
		Actionlib.movetoelement(driver, men);
	}
	public void myaccounttab(WebDriver driver) {
		Actionlib.movetoelement(driver, myaccount);
	}
	public void searchbox(String search1) {
		search.sendKeys(search1);
	}
	public void submitbtn() {
		submit.click();
	}
	 
	
	

	
}
