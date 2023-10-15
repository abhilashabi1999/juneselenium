package webdriverproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class junitdemo {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void titleverification()
	{
		
	}
	@AfterTest
	public void pagesrc()
	{
		driver.quit();
	}
}
