package org.wipro.uo.dataGenerators;

import org.testng.annotations.DataProvider;

public class DataGeneratorClass
{


	
	@DataProvider(name="StaticData")
	public Object[][] testdata()
	{
	
		
		Object[][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-d Array
		return data;
		
	}
	
}
