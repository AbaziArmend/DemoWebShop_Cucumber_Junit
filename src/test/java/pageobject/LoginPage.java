package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver driver;
	
	//Input Box E-Mail
	@FindBy(id = "Email")
	private WebElement inputMail;
	
	//Input Box Password
	@FindBy(id = "Password")
	private WebElement inputPassword;
	
	//Button Log In
	@FindBy(css = "input[value='Log in']")
	private WebElement buttonLogin;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Methoden
	//Input E-Mail
	public void inputMail(String mail) {
		inputMail.sendKeys(mail);
	}

	//Input Password
	public void inputPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	//Click On Log In Button
	public void clickOnLogIn() {
		buttonLogin.click();
	}
	

}
