package Testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterspgm {
	
    @Parameters("a")
	@Test
	public void test(String v)
	{
		System.out.println(v);
	}
}
