package org.wipro.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.uo.baseclass.InitiateClass;
import org.wipro.uo.pages.UOSignInPage;

public class UO_SignInTestcase extends InitiateClass
{

	@Test
	public void firsttestcase_loginfunc() throws Exception
	{
		UOSignInPage sign = new UOSignInPage(driver);
		sign.click_menu();
		sign.click_sign();
		sign.enter_username("abc");
		sign.enter_password("pass123");
		sign.click_SignButton();
		
	}
	
}
