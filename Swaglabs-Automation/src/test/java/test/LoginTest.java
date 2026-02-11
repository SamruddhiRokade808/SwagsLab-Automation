package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;


public class LoginTest extends BaseTest
{
	
	@Test
	
	public void verifyVaildLogin() throws Exception{
	LoginPage login= new LoginPage(driver);
	
	login.loginPage("standard_user", "secret_sauce");
	
	Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
	
	
	
	Thread.sleep(2000);
	
	}
	
	

}