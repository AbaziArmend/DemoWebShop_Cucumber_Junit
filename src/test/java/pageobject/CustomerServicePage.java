package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerServicePage {

	 WebDriver driver;
	
	//Your Name
	@FindBy(id = "FullName")
	private WebElement inputYourName;
	
	//Your Mail
	@FindBy(id = "Email")
	private WebElement inputYourMail;
	
	//Enquiry
	@FindBy(id = "Enquiry")
	private WebElement inputEnquiry;
	
	//Submit Button
	@FindBy(css = "input[value='Submit']")
	private WebElement buttonSubmit;
	
	//Verify Sent Enquiry 
	@FindBy(css = ".result")
	private WebElement verifyEnquiry;
	
	//Verify Enter Your Name Error
	@FindBy(css = "span[for='FullName']")
	private WebElement errorNameMessage;
	
	//Verify Enter Your Mail Error
	@FindBy(css = "span[for='Email']")
	private WebElement errorMailMessage;
	
	//Verify Enter Enquiry Message
	@FindBy(css = "span[for='Enquiry']")
	private WebElement errorEnquiryMessage;
	
	
	public CustomerServicePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Input Your Name
	public void inputYourName(String YourName) {
		inputYourName.sendKeys(YourName);
	}
	
	//Input Your Mail
	public void inputYourMail(String YourMail) {
		inputYourMail.sendKeys(YourMail);
	}
	
	//Input Enquiry
	public void inputEnquiry(String Enquiry) {
		inputEnquiry.sendKeys(Enquiry);
	}
	
	//Click On Submit Button
	public void clickOnSubmitButton() {
		buttonSubmit.click();
	}
	
	//Verify  Sent Enquiry 
	public String verifyEnquiryMessage() {
		return verifyEnquiry.getText();
	}
	
	//Verify Name Error
	public String errorNameMessage() {
		return errorNameMessage.getText();
	}
	
	//Verify Mail Error
	public String errorMailMessage() {
		return errorMailMessage.getText();
	}
	
	//Verify Enquiry Error
	public String errorEnquiryMessage() {
		return errorEnquiryMessage.getText();
	}
	
}
