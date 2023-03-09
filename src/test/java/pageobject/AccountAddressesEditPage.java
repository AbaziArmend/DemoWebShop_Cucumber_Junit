package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountAddressesEditPage {

	 WebDriver driver;
	
	//Address1
	@FindBy(id = "Address_Address1")
	private WebElement inputAddress1;
	
	//Button Save
	@FindBy(css = "input[value='Save']")
	private WebElement buttonSave;
	
	
	public AccountAddressesEditPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Input Address1
	public void inputAddress1(String Address) {
		inputAddress1.clear();
		inputAddress1.sendKeys(Address);
	}
	
	//Click On Save Button
	public void clickOnSave() {
		buttonSave.click();
	}
	
	
	
	
}
