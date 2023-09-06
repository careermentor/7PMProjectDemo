package learnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario1 
{

	WebDriver driver;
	
	@Test(priority=1)
	public void first_tstcase()
	{
		
		
		
		System.out.println("this is first test cases");
		
		//Assert.assertEquals("Hello", "Hello1");  //failed  -- assertion - hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Hello", "Hello1");   //soft assertion - failed
		
		System.out.println("this is executed");
		
		sa.assertAll();  //pass/fail
	}
	
	@Test(priority=2)
	public void second_tstcase()
	{
		System.out.println("this is second test cases");
	}
	
	@Test(priority=3)
	public void third_tstcase()
	{
		System.out.println("this is third test cases");
	}
	
	@Test(priority=-1)
	public void forth_tstcase()
	{
		System.out.println("this is forth test cases");
	}
	
	@Test
	public void fifth_tstcase()
	{
		System.out.println("this is fifth test cases");
	}
	
	@Test(priority=-2)
	public void sixth_tstcase()
	{
		System.out.println("this is sixth test cases");
	}
	
}
