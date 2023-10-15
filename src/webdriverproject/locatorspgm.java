package webdriverproject;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorspgm {

	public static void main(String[] args) {
		
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.name("email")).sendKeys("Abcdefg");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("loginbutton")).click();
		

	}

}
