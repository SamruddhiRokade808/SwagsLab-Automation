package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;

public class CartTest extends BaseTest {
	
	
	@Test
	
	public void cart() 
	{
		LoginPage login= new LoginPage(driver);
		login.loginPage("standard_user", "secret_sauce");
		
		ProductPage page=new ProductPage(driver);
		page.product("Sauce Labs Backpack");
		page.product("Sauce Labs Bike Light");
		
		CartPage test= new CartPage(driver);
		
		Assert.assertTrue(test.cart("Sauce Labs Bike Light"),"product is not found in cart");
		
		
		
	}

}
