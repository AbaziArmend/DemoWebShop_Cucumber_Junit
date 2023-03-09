package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountAddressesPage {

	WebDriver driver;
	
	//Button Edit
		@FindBy(className = "edit-address-button")
		private WebElement buttonEdit;
		
		//Verify New Address
		@FindBy(xpath = "//li[@class='address1']")
		private WebElement verifyNewAddress;
		

	public AccountAddressesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Click On Edit
	public void clickOnEdit() {
		buttonEdit.click();
	}
	
	//Verify New Address
		public String verifyNewAddress() {
			return verifyNewAddress.getText();
		}
	
}
