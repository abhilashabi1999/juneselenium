package webdriverproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datepickerpgm {
	
   ChromeDriver driver;
   
   @BeforeTest
   public void setUp()
   {
	   driver =new ChromeDriver();
	   driver.get("https://www.booking.com");
   }
   @Test
   public void main()
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[4]/button/span")).click();
	   
	   while (true)
	   {
		   String monthtext=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
		   System.out.println("month="+monthtext);
		   if (monthtext.equals("november 2023"));
		   {
			   System.out.println("month selected");
			   break;
		   }
		   else
	   
		   {
			   driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button[2]/span/span/svg/path")).click();
		   }
	   }
		   List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span"));
	        
		for (WebElement dateelement:alldates)
		{
			String date=dateelement.getText();
			if (date.equals("20"));
			{
				dateelement.click();
				break;
			}
   }
   }
}
