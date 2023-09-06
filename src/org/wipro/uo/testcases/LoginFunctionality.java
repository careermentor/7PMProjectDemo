package org.wipro.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.uo.baseclass.InitiateClass;
import org.wipro.uo.pages.LoginPage;

public class LoginFunctionality extends InitiateClass
{

	@Test
	public void firsttestcase_loginfunc() throws Exception
	{
		LoginPage login  = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass1234");
		login.click_loginButton();
		
		
	}
	
}
