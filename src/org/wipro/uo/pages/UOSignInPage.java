package org.wipro.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.uo.utilitiesClass.CommonUtilitiesFile;

public class UOSignInPage 
{

	WebDriver driver;
	public UOSignInPage(WebDriver driver) 
	{	
		this.driver=driver;		
	}

	
	public void click_menu() throws Exception
	{
		driver.findElement(By.cssSelector(CommonUtilitiesFile.elementProp("UO_menu_css"))).click();
	}
	
	public void click_sign() throws Exception
	{
		driver.findElement(By.xpath(CommonUtilitiesFile.elementProp("UO_signin_xpath"))).click();
	}
	
	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.name(CommonUtilitiesFile.elementProp("UO_Signin_username_name"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.id(CommonUtilitiesFile.elementProp("UO_Signin_password_id"))).sendKeys(pass);
	}
	
	public void click_SignButton() throws Exception
	{
		driver.findElement(By.name(CommonUtilitiesFile.elementProp("login_loginbtn_name"))).click();
	}
}
