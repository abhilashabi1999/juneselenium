package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepkg.baseclass;
import page.fbloginpage;

public class fblogintest extends baseclass {
	

	@Test
	public void test()
	{
		
		fbloginpage ob= new fbloginpage(driver);
		ob.setValues("abc123@gmail.com", "abc12345");
		ob.loginClick();
		driver.navigate().back();
	}
}
