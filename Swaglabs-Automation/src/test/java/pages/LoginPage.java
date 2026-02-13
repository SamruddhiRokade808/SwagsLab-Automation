package pages;
	
	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;

	public class LoginPage {
		
		WebDriver driver;
		WebDriverWait wait;
		//locators
		
		By username=By.id("user-name");
		By password = By.id("password");
		By login= By.id("login-button");
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			wait=new WebDriverWait(driver, Duration.ofSeconds(50000));
		}

		
		public void loginPage(String user,String pass)
		{
			driver.findElement(username).sendKeys(user);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(login).click();
		}
}
