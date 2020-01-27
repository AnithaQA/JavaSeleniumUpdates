package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import testUtil.TestUtil;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() throws IOException{
	 prop=new Properties();
	 FileInputStream fls=new FileInputStream("C:\\Users\\Anitha\\my-CRM1\\src\\main\\java\\testProperties\\Preperties");
	 prop.load(fls);
		
	}
	

	public static void initialize() {
		
	String browserName=	prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome1\\chromedriver.exe");
		driver=new ChromeDriver();
	}else if(browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\FireFoxDriver\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.loadPage, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.implicitWait, TimeUnit.MICROSECONDS);
	
	driver.get(prop.getProperty("url"));

		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	

