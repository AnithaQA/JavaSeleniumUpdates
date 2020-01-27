package testPages;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import testBase.TestBase;
import testUtil.TestUtil;

public class HomePageTest extends TestBase {
  LoginPage lp;
  HomePage homepage;
 ContactsPage contactsPage;
 TestUtil util;
  
	public HomePageTest() throws IOException {
		super();
		
	}
	
	
	@BeforeMethod
	
	public void setUp() throws IOException {
		initialize();
	lp=new LoginPage();
	
	
	
	homepage=lp.login(prop.getProperty("userName"), prop.getProperty("password"));
	
	}
	
	@Test(priority=1)
	public void  validatetitleOfHomePageTest() {
	String homePageTile=	homepage.VerifyingTitlePage();
		
		Assert.assertEquals(homePageTile, "Cogmento CRM");
		
	}
	
	
	@Test(priority=2)
	
	public void verifyContactsLinksTest() {
		
	contactsPage=homepage.clickOnContacts();
	}
	


}
