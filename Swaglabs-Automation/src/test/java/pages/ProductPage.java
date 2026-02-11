package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By sProducts = By.className("inventory_item");
	By sPaddToCartbuttons=By.xpath("//button[contains(text(),'Add to cart')]");
	By sProductName= By.className("inventory_item_name");
	
	public  ProductPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void product(String expectedProductName)

	{
		List<WebElement> element= driver.findElements(sProducts);
		
		//System.out.println(element.size());
		//String text="Sauce Labs Backpack";
		
		
		for(WebElement product1:element)
		{
			
			String actualName= product1.findElement(sProductName).getText();
			
			if(actualName.equals(expectedProductName))
			{
				product1.findElement(sPaddToCartbuttons).click();
				break;
				
			}
		}
		
		
		
	}
	
	
	

}
