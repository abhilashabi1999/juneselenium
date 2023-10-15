package webdriverproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpgm {
	
	ChromeDriver driver;
	
	@Before
	public void SetUp() {
		 driver =new ChromeDriver();

  }
	@Test
	public void Test1()
	{
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("122354");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		}
	
	}


