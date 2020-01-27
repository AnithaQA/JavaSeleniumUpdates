package testPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='main-nav']/a[3]")
	WebElement contacts;
	
	@FindBy(xpath="//div[@id='main-nav']/a[5]")
	WebElement Deals;
	
	@FindBy(xpath="//div[@id='main-nav']/a[6]")
	WebElement Task;
	
	@FindBy(xpath="//div[@id='main-nav']/a[7]")
	WebElement Cases;
	
	//Initailize the page Object
	
	
	public String VerifyingTitlePage() {
		
		
		return driver.getTitle();
	}
	
	
	
	public ContactsPage clickOnContacts() {
		contacts.click();
		
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals() {
		Deals.click();
		
		return new DealsPage();
	}
	
	public TaskPage clickOnTask() {
		
		Task.click();
		
		return new TaskPage();
	}
	
	public CasePage clickOnCases() {
		Cases.click();
		return new CasePage();
		
	}
	
	
}
