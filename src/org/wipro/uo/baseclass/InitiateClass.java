package org.wipro.uo.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.wipro.uo.utilitiesClass.CommonUtilitiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitiateClass 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void inititateBrowser() throws Exception
	{
		if(CommonUtilitiesFile.configProp("BrowserName").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();  //will take care of the ChromeBroser and ChromeDriver
			driver= new ChromeDriver(); //launch your chrome browser
		}
		
		else if(CommonUtilitiesFile.configProp("BrowserName").equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();  //will take care of the ChromeBroser and ChromeDriver
			driver= new EdgeDriver(); //launch your chrome browser
		}
		
		else if(CommonUtilitiesFile.configProp("BrowserName").equalsIgnoreCase("IE"))
		{
			WebDriverManager.edgedriver().setup();  //will take care of the ChromeBroser and ChromeDriver
			driver= new EdgeDriver(); //launch your chrome browser
		}
		
		else if(CommonUtilitiesFile.configProp("BrowserName").equalsIgnoreCase("opera"));
		
		{
			WebDriverManager.edgedriver().setup();  //will take care of the ChromeBroser and ChromeDriver
			driver= new EdgeDriver(); //launch your chrome browser
		}
		
		
		
		
		driver.get(CommonUtilitiesFile.configProp("Application_URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	}
	
	@AfterMethod
	public void closebrowsr()
	{
		driver.quit();
		
	}
	
}
