package testPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import testBase.TestBase;

public class LoginPage extends TestBase {

	HomePage homepage;
	
	LoginPage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		
	}

	//pageFactory model
	
	@FindBy(xpath="//a[@title='free crm home']")
	WebElement logo;
	
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	WebElement login;
	
	@FindBy(name="email")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	
	
	public String validateTitle() {
		
		return driver.getTitle();
	
	}
	
	
	public boolean validateLogo() {
		
		return logo.isDisplayed();
		
	}
	
	public HomePage login(String un,String pw) throws IOException {
		login.click();
		userName.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
