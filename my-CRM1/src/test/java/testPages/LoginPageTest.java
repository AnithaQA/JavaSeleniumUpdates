package testPages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBase.TestBase;

public class LoginPageTest extends TestBase{
	LoginPage lp;
	HomePage homepage;
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialize();
		 lp=new LoginPage();
		
	}
    @Test (priority=1)
	public void titleTest() {
		String title=lp.validateTitle();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		System.out.println(title);
	}
	@Test(priority=2)
	public void logoTest() {
	boolean img =	lp.validateLogo();
	Assert.assertTrue(img);
	
	System.out.println(img);
	}
	
	@Test(priority=3)
	public void loginTest() throws IOException {
	HomePage homepage=	lp.login(prop.getProperty("userName"), prop.getProperty("password"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
