package org.wipro.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.uo.utilitiesClass.CommonUtilitiesFile;

public class LoginPage 
{

	WebDriver driver;
	public LoginPage(WebDriver driver) 
	{	
		this.driver=driver;		
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(CommonUtilitiesFile.elementProp("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(CommonUtilitiesFile.elementProp("login_password_name"))).sendKeys(pass);
	}
	
	public void click_loginButton() throws Exception
	{
		driver.findElement(By.name(CommonUtilitiesFile.elementProp("login_loginbtn_name"))).click();
	}
}
