package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropFile 
{

	
	public static void readprop() throws Exception
	{
		
		
		//File f = new File("./Data/abc.properties");
		
		FileReader fr = new FileReader("./Data/abc.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		System.out.println(prop.get("programming"));
		
		
		System.out.println(prop.get("automation"));
		System.out.println(prop.get("application_url"));
		System.out.println(prop.get("email"));
		
		
	}
	
	public static void main(String[] args) throws Exception {
		ReadPropFile.readprop();
	}
	
}
