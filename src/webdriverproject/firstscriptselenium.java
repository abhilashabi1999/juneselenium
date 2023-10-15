package webdriverproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstscriptselenium {

	public static void main(String[] args) {
		
		
	//chromedriver
	//firefoxdriver
	//edgedriver
		
		
		ChromeDriver Driver =new ChromeDriver(); //BROWSER LAUNCH
		Driver.get ("https://www.google.com"); //open application
		
		String actualtitle= Driver.getTitle();
		String exp="Google";
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Driver.close();
	}

}
