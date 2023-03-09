package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	 WebDriver driver;

	//Item
	@FindBy(css = "div[class='product-item'] img[title='Show details for Blue Jeans']")
	private WebElement item;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Click On Item
	public void clickOnItem() {
		item.click();
	}
	

}
