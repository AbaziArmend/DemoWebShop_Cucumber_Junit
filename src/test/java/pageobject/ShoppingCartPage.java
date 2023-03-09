package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	 WebDriver driver;
	
	//Verify Item In Shopping Cart
	@FindBy(xpath = "//a[@class='product-name']")
	private WebElement verifyItem;

	//Error message no item found
	@FindBy(css = "strong[class$='result']")
	private WebElement errorNoItem;


	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Verify Item In Shopping Cart
	public String verifyShoppingCart() {
		return verifyItem.getText();
	}

	//Error message no item found
	public String errorMessageNoItem() {
		return errorNoItem.getText();}

}
