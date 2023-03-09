package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {

	 WebDriver driver;
	
	//Button Add To Cart
	@FindBy(id = "add-to-cart-button-36")
	private WebElement buttonAddToCart;
	
	public ItemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Click On Add To Cart Button
	public void clickOnAddToCart() {
		buttonAddToCart.click();
	}
	
	
	
}
