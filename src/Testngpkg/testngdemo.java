package Testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class testngdemo {
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("browser open");
	}
	
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url details");
	}
	
	@Test()
	public void test1()
	{
		System.out.println("test 1");
	}
	
	@Test(priority=1)
	public void test2() 
	{
		System.out.println("test 2");
	}
	
	@AfterMethod
	public void methodclose()
	{
		System.out.println("aftermethod");
	}
	
	@AfterTest
	public void teardown()
	{
		System.out.println("browser close");
	}
	

}
