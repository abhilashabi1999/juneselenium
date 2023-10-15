package webdriverproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class alertpgm {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
    public void test1()
    {
		driver.get("file:///C:/Users/abhi/Desktop/java/functiondisplayalert1.html");
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alertext=a.getText();
		System.out.println(alertext);
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Abhilash");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("m b");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
    }

	public static void main(String[] args) {
	

	}

}
