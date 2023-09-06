package org.wipro.uo.utilitiesClass;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class CommonUtilitiesFile 
{

	
	public static String configProp(String key) throws Exception
	{
		FileReader fr = new FileReader("./Data/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		return prop.get(key).toString();
		
	}
	
	public static String elementProp(String key) throws Exception
	{
		FileReader fr = new FileReader("./Data/element.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		return prop.get(key).toString();
		
	}
	
}
