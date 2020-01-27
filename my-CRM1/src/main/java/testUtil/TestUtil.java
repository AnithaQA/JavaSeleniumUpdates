package testUtil;

import java.io.IOException;

import testBase.TestBase;

public class TestUtil extends TestBase {
public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


public static long loadPage=30;
public static long implicitWait=40;


public void switchToFrame() {
	driver.switchTo().frame("main-nav");

}
}
