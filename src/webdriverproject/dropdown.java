package webdriverproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
    @Test
    public void test1()
    {
    	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    	
    WebElement dayelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
    	Select day=new Select(dayelement);
    	day.selectByValue("02");
    	
    	 WebElement monthelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
     	Select month=new Select(monthelement);
     	month.selectByVisibleText("JAN");
     	
     	

}
}
