package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountChangePasswordPage {

	 WebDriver driver;
	
	//Input Old Password
	@FindBy(id = "OldPassword")
	private WebElement inputOldPassword;
	
	//Input NewPassword
	@FindBy(id = "NewPassword")
	private WebElement inputNewPassword;
	
	//Input Confirm Password
	@FindBy(id = "ConfirmNewPassword")
	private WebElement inputonfirmPassword;
	
	//Button Change Password
	@FindBy(css = "input[value='Change password']")
	private WebElement buttonChangePassword;
	
	//Verify Password Change 
	@FindBy(css = ".result")
	private WebElement verifyPasswordChange;

	//Error Old Password don't match
	@FindBy(css = "div[class='center-2'] form")
	private WebElement errorOldPassword;

	//Error confirm Password not match
	@FindBy(css = ".field-validation-error")
	private WebElement errorConfirmPassword;

	//Error new password to short
	@FindBy(css = "span[for='NewPassword']")
	private WebElement errorNewPassword;
	
	
	public AccountChangePasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Input Old Password
	public void inputOldPassword(String oldPassword) {
		inputOldPassword.sendKeys(oldPassword);
	}
	
	//Input New Password
	public void inputNewPassword(String newPassword) {
		inputNewPassword.sendKeys(newPassword);
	}
	
	//Input Confirm Password
	public void inputConfirmPassword(String confirmPassword) {
		inputonfirmPassword.sendKeys(confirmPassword);
	}
	
	//Click On Change Password
	public void clickOnChangePassword() {
		buttonChangePassword.click();
	}
	
	//Verify Password Change
	public String verifyPasswordChange() {
		return verifyPasswordChange.getText();
	}

	//Error old Password
	public String errorOldPassword() {
		return errorOldPassword.getText();
	}

	//Error confirm password not match
	public String errorConfimrPassword() {
		return errorConfirmPassword.getText();
	}

	//Error new password to short
	public String errorNewPasswordToShort() {
		return errorNewPassword.getText();
	}

	
}
