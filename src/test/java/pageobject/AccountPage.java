package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	 WebDriver driver;
	
	//Button Change Password
	@FindBy(xpath = "//a[normalize-space()='Change password']")
	private WebElement buttonChangePassword;
	
	//Button Addresses
	@FindBy(css = "div[class='master-wrapper-main'] li:nth-child(2) a:nth-child(1)")
	private WebElement buttonAddresses;
	
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Click On Change Password
	public void clickOnChangePassword() {
		buttonChangePassword.click();
	}
	
	//Click On Addresses
	public void clickOnAddresses() {
		buttonAddresses.click();
	}
	
	
	
}
