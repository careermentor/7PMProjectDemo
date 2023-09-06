package org.wipro.uo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.uo.baseclass.InitiateClass;
import org.wipro.uo.dataGenerators.DataGeneratorClass;
import org.wipro.uo.pages.LoginPage;

public class LoginFunctionality_ddf extends InitiateClass
{

	@Test(dataProvider="StaticData", dataProviderClass=DataGeneratorClass.class)
	public void firsttestcase_loginfunc(String Uname, String Upass) throws Exception
	{
		LoginPage login  = new LoginPage(driver);
		login.enter_username(Uname);
		login.enter_password(Upass);
		login.click_loginButton();
		
		
	}
	
	
}
