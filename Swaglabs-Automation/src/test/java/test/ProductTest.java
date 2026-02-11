package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest{
	
	@Test
	
	public void productAdded() throws Exception
	{
		LoginPage login= new LoginPage(driver);
		login.loginPage("standard_user", "secret_sauce");
		
		ProductPage page=new ProductPage(driver);
		page.product("Sauce Labs Backpack");
		page.product("Sauce Labs Bike Light");
		
		Thread.sleep(2000);
		
	}

}
