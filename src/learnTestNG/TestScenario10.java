package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario10 
{

	@Test
	public void first_tstcase()
	{
		System.out.println("this is first test cases");
		Assert.assertEquals("ABC", "abc");
	}
	
	@Test
	public void second_tstcase()
	{
		System.out.println("this is second test cases");
	}
	
	@Test
	public void third_tstcase()
	{
		System.out.println("this is third test cases");
	}
	
	@Test
	public void forth_tstcase()
	{
		System.out.println("this is forth test cases");
	}
	
	@Test
	public void fifth_tstcase()
	{
		System.out.println("this is fifth test cases");
	}
	
	@Test
	public void sixth_tstcase()
	{
		System.out.println("this is sixth test cases");
	}
	
}
