package webdriverproject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class saucedemopgm {
	ChromeDriver driver;
	@BeforeTest
	public  void SetUp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	}
	@Test
	public void test()
	{
		String expectedurl="https://www.saucedemo.com/inventory.html";
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedurl);
	
	}

}
