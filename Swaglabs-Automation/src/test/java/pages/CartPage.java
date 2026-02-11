package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	WebDriver driver;
	WebDriverWait wait;

	By cartbutton = By.className("shopping_cart_link");
	By cartItemDetails = By.className("cart_item");

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean cart(String expText) {
		WebElement element = driver.findElement(cartbutton);
		element.click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(cartItemDetails));

		List<WebElement> cartitem = driver.findElements(cartItemDetails);

		for (WebElement item : cartitem) {

			if (item.getText().equalsIgnoreCase(expText)) {
				return true;
			}
		}

		return false;

	}

}
