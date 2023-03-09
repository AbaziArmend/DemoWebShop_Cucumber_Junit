package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.*;
import support.testdata;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import static org.junit.Assert.assertTrue;

@RunWith(Cucumber.class)
public class SendCustomerRequestStepDefinitons {

    HttpURLConnection http;

    WebDriver driver;

    @Given("I navigate to {string} website")
    public void i_navigate_to_website(String website) throws IOException {
        if(website.equals("TricentisDemoWebshop")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(testdata.tricentisDemoWebshop);
            driver.manage().window().maximize();

            URL url = new URL(testdata.tricentisDemoWebshop);
            URLConnection con = url.openConnection();
            http = (HttpURLConnection) con;

            http.setRequestMethod("GET");
            http.setRequestProperty("Accept", "application/json; charset=UTF-8");
            if (http.getResponseCode() == 200) {
                System.out.println("Navigate to" + testdata.tricentisDemoWebshop);
            }
        }
    }

    @When("I pass a {string} to input box {string}")
    public void iPassAToInputBox(String inputText, String inputBox) {
        CustomerServicePage customerServicePage = new CustomerServicePage(driver);
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountAddressesEditPage accountAddressesEditPage = new AccountAddressesEditPage(driver);
        AccountChangePasswordPage accountChangePasswordPage = new AccountChangePasswordPage(driver);
        switch (inputBox) {
            case "Newsletter":
                mainPage.inputMailInNewsletter(inputText);
                break;
            case "Old password":
                accountChangePasswordPage.inputOldPassword(inputText);
                break;
            case "New password":
                accountChangePasswordPage.inputNewPassword(inputText);
                break;
            case "Confirm password":
                accountChangePasswordPage.inputConfirmPassword(inputText);
                break;
            case "Email enquiry":
                customerServicePage.inputYourMail(inputText);
                break;
            case "Email log in" :
                loginPage.inputMail(inputText);
                break;
            case "Password log in" :
                loginPage.inputPassword(inputText);
                break;
            case "Name enquiry" :
                customerServicePage.inputYourName(inputText);
                break;
            case "Enquiry" :
                customerServicePage.inputEnquiry(inputText);
                break;
            case "Search" :
                mainPage.searchForItem(inputText);
                break;
            case "Address 1":
                accountAddressesEditPage.inputAddress1(inputText);
                break;
            default:
                System.out.println("Input box don't exist");
        }

    }

    @Then("I have successfully sent an enquiry")
    public void iHaveSuccessfullySentAnEnquiry()  {
        System.out.println("Enquiry has Sent");
        CustomerServicePage customerServicePage = new CustomerServicePage(driver);
        String text = customerServicePage.verifyEnquiryMessage();
        assertTrue(text.contains("Your enquiry has been successfully sent to the store owner."));
        }

    @Then("I get an error message for name")
    public void iGetAnErrorMessageForName() {
        System.out.println("Get Error Message For Name");
        CustomerServicePage customerServicePage = new CustomerServicePage(driver);
        String text = customerServicePage.errorNameMessage();
        assertTrue(text.contains("Enter your name"));

        }


    @Then("I get an error message for e-mail")
    public void iGetAnErrorMessageForEmail() {
        System.out.println("Get Error Message For E-Mail");
        CustomerServicePage customerServicePage = new CustomerServicePage(driver);
        String text = customerServicePage.errorMailMessage();
        assertTrue(text.contains("Enter email"));
    }

    @Then("I get an error message for enquiry")
    public void iGetAnErrorMessageForEnquiry()  {
        System.out.println("Get Error Message For Enquiry");
        CustomerServicePage customerServicePage = new CustomerServicePage(driver);
        String text = customerServicePage.errorEnquiryMessage();
        assertTrue(text.contains("Enter enquiry"));
    }


    @And("I click {string} button")
    public void iClickButton(String button) {
        MainPage mainPage = new MainPage(driver);
        CustomerServicePage customerServicePage = new CustomerServicePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ItemPage itemPage = new ItemPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountAddressesPage accountAddressesPage = new AccountAddressesPage(driver);
        AccountAddressesEditPage accountAddressesEditPage = new AccountAddressesEditPage(driver);
        AccountChangePasswordPage accountChangePasswordPage = new AccountChangePasswordPage(driver);
        switch (button){
            case "Subscribe":
                mainPage.clickOnSubscribe();
                break;
            case "change password" :
                accountChangePasswordPage.clickOnChangePassword();
                break;
            case "Change Password":
                accountPage.clickOnChangePassword();
                break;
            case "Contact Us":
                mainPage.clickOnContactUs();
                break;
            case "Submit":
                customerServicePage.clickOnSubmitButton();
                break;
            case "Search":
                mainPage.clickOnSearch();
                break;
            case "Blue Jeans":
                searchPage.clickOnItem();
                break;
            case "Add to cart":
                itemPage.clickOnAddToCart();
                break;
            case "Shopping cart":
                mainPage.clickOnShoppingCart();
                break;
            case "Log in" :
                mainPage.clickOnLogin();
                break;
            case "Login" :
                loginPage.clickOnLogIn();
                break;
            case "Account" :
                mainPage.clickOnAccount();
                break;
            case "Addresses" :
                accountPage.clickOnAddresses();
                break;
            case "Edit" :
                accountAddressesPage.clickOnEdit();
                break;
            case "Save" :
                accountAddressesEditPage.clickOnSave();
                break;
            default:
                System.out.println("Button don't exist");
        }
    }

    @When("I close the website")
    public void iCloseTheWebsite() {
        driver.close();
    }

    @Then("I have successfully {string}")
    public void i_have_successfully(String successfulMessage) throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        AccountAddressesPage accountAddressesPage = new AccountAddressesPage(driver);
        AccountChangePasswordPage accountChangePasswordPage = new AccountChangePasswordPage(driver);
        CustomerServicePage customerServicePage = new CustomerServicePage(driver);
        switch (successfulMessage) {
            case "add an item to the shopping cart":
                String shoppingcart = shoppingCartPage.verifyShoppingCart();
                assertTrue(shoppingcart.contains("Blue Jeans"));
                break;
            case "change my address":
                String address = accountAddressesPage.verifyNewAddress();
                assertTrue(address.contains("Am kleinen Teich 5"));
                break;
            case "change my password" :
                String password = accountChangePasswordPage.verifyPasswordChange();
                assertTrue(password.contains("Password was changed"));
                break;
            case "subscribe the newsletter" :
                Thread.sleep(2000);
                String newsletter = mainPage.subscriptionMessage();
                assertTrue(newsletter.contains("Thank you for signing up! A verification email has been sent. We appreciate your interest."));
                break;
            case "sent an enquiry":
                String enquiry = customerServicePage.verifyEnquiryMessage();
                assertTrue(enquiry.contains("Your enquiry has been successfully sent to the store owner."));
                break;
        }
    }

    @Then("I get an error {string}")
    public void i_get_an_error(String error) throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        AccountChangePasswordPage accountChangePasswordPage = new AccountChangePasswordPage(driver);
        CustomerServicePage customerServicePage = new CustomerServicePage(driver);
        MainPage mainPage = new MainPage(driver);
        switch (error) {
            case "message no item found":
                String item = shoppingCartPage.errorMessageNoItem();
                assertTrue(item.contains("No products were found that matched your criteria."));
                break;
            case "message for old password":
                String oldPassword = accountChangePasswordPage.errorOldPassword();
                assertTrue(oldPassword.contains("Old password doesn't match"));
                break;
            case "message for name":
                String name = customerServicePage.errorNameMessage();
                assertTrue(name.contains("Enter your name"));
                break;
            case "message for e-mail":
                String email = customerServicePage.errorMailMessage();
                assertTrue(email.contains("Enter email"));
                break;
            case "message for enquiry" :
                String enquiry = customerServicePage.errorEnquiryMessage();
                assertTrue(enquiry.contains("Enter enquiry"));
                break;
            case "message for new password not confirm":
                String confirmPassword = accountChangePasswordPage.errorConfimrPassword();
                assertTrue(confirmPassword.contains("The new password and confirmation password do not match."));
                break;
            case "message for new password to short":
                String newPassword = accountChangePasswordPage.errorNewPasswordToShort();
                assertTrue(newPassword.contains("The password should have at least 6 characters."));
                break;
            case "message enter valid email":
                Thread.sleep(2000);
                String subscribeemail = mainPage.wrongSubscriptionMessage();
                assertTrue(subscribeemail.contains("Enter valid email"));
                break;
        }
    }


}



