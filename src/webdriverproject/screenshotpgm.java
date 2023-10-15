package webdriverproject;

import java.io.File;
import java.io.IOException;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotpgm {
	
	
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
    @Test
    public void test1()throws IOException
    {
    	driver.get("https://www.facebook.com");
    	
    	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	org.openqa.selenium.io.FileHandler .copy(src, new File("D://Screeshot.png"));
    	
    	
    WebElement searchbutton=driver.findElement(By.name("login"));
    File elementscreenshot= searchbutton.getScreenshotAs(OutputType.FILE);
    org.openqa.selenium.io.FileHandler.copy(elementscreenshot,new File("./creenshot/searchbutton.png"));

}
}