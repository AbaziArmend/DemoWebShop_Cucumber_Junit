package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	 WebDriver driver;
	
	//Input Box Search
	@FindBy(id = "small-searchterms")
	private WebElement inputSearch;
	
	//Button Search
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement buttonSearch;
	
	//Button Shopping Cart
	@FindBy(css = "a[class='ico-cart'] span[class='cart-label']")
	private WebElement buttonShoppingCart;
	
	//Button Login
	@FindBy(css = ".ico-login")
	private WebElement buttonLogin;
	
	//Input Box Newsletter
	@FindBy(id = "newsletter-email")
	private WebElement inputNewsletter;
	
	//Input Box Newsletter
	@FindBy(id = "newsletter-email")
	private WebElement inputWrongNewsletter;
	
	//Button Subscribe
	@FindBy(id = "newsletter-subscribe-button")
	private WebElement buttonSubscibe;

	//Verify Subscription To Newsletter
	@FindBy(id = "newsletter-result-block")
	private WebElement subscriptionMessage;
	
	//Verify Wrong Subscription To Newsletter
	@FindBy(id = "newsletter-result-block")
	private WebElement wrongSubscriptionMessage;
		
	//Button Account
	@FindBy(css = "div[class='header-links'] a[class='account']")
	private WebElement buttonAccount;
	
	//Button Contact Us
	@FindBy(css = "a[href='/contactus']")
	private WebElement buttonContactUs;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Methoden
	//Search For Items
	public void searchForItem(String item) {
		inputSearch.sendKeys(item);
	}
	
	//Click On Search Button
	public void clickOnSearch() {
		buttonSearch.click();
	}
	
	//Click On Shopping Cart Button
	public void clickOnShoppingCart() {
		buttonShoppingCart.click();
	}
	
	//Click On Login
	public void clickOnLogin() {
		buttonLogin.click();
	}
	
	//Input E-mail in Newsletter
	public void inputMailInNewsletter(String mail) {
		inputNewsletter.sendKeys(mail);
	}
	
	//Input Wrong E-mail in Newsletter
		public void inputWrongMailInNewsletter(String mail) {
			inputNewsletter.sendKeys(mail);
	}		
	
	//Click On Subscribe
	public void clickOnSubscribe() {
		buttonSubscibe.click();
	}
	
	//Verify Subscription To Newsletter
	public String subscriptionMessage() {
		return subscriptionMessage.getText();
	}
	
	//Verify Subscription To Newsletter
		public String wrongSubscriptionMessage() {
			return wrongSubscriptionMessage.getText();
		}
	
	//Click On Account
	public void clickOnAccount() {
		buttonAccount.click();
	}
	
	//Click On Customer Service
	public void clickOnContactUs() {
		buttonContactUs.click();
	}

}
