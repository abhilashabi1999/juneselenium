package webdriverproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileimport {
	
	ChromeDriver driver;
	@BeforeTest
	public  void SetUp()
	{
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test() throws Exception
	{
		driver.get("https://www.ilove.com/word_to_pdf");
		driver.findElement(By.xpath("*[@id=\"pickfiles\"]")).click();
		
		fileUpload("D:\\Screeshot.png");
	}
	public void fileUpload (String p)throws AWTException{
		StringSelection StrSelection= new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(StrSelection, null);
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
		
		
	}


