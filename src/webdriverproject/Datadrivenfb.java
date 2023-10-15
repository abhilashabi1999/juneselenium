package webdriverproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenfb {
	ChromeDriver driver;
	
	@BeforeTest
	public void setuUp()
	{
		driver = new ChromeDriver();
	}
	
    @Test
    public void test()throws IOException
    {
    	
    	FileInputStream f= new FileInputStream("");
    }
}
