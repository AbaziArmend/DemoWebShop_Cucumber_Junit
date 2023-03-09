package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageobject.AccountChangePasswordPage;
import pageobject.MainPage;

import static org.junit.Assert.assertTrue;

@RunWith(Cucumber.class)
public class ChangeCustomerPasswordStepDefinitions {

    WebDriver driver;

    @Then("I successfully change my password")
    public void iSuccessfullyChangeMyPassword() {
        System.out.println("Password has change");
        AccountChangePasswordPage accountChangePasswordPage = new AccountChangePasswordPage(driver);
        String text = accountChangePasswordPage.verifyPasswordChange();
        assertTrue(text.contains("password has change"));
    }

    @Then("I get an error message for old password")
    public void iGetAnErrorMessageForOldPassword() throws Throwable {
        System.out.println("Old Password don't match");
        AccountChangePasswordPage accountChangePasswordPage = new AccountChangePasswordPage(driver);
        String test = accountChangePasswordPage.errorOldPassword();
        assertTrue(test.contains("Old password doesn't match"));
    }

    @Then("I get an error message for new password not confirm")
    public void iGetAnErrorMessageForNewPasswordNotConfimr() throws Throwable {
        System.out.println("new password don't match");
        AccountChangePasswordPage accountChangePasswordPage = new AccountChangePasswordPage(driver);
        String text = accountChangePasswordPage.errorConfimrPassword();
        assertTrue(text.contains("The new password and confirmation password do not match."));
    }

    @Then("I get an error message for new password to short")
    public void iGetAnErrorMessageForNewPasswordToShort() throws Throwable {
        System.out.println("New password to short");
        AccountChangePasswordPage accountChangePasswordPage = new AccountChangePasswordPage(driver);
        String text = accountChangePasswordPage.errorNewPasswordToShort();
        assertTrue(text.contains("The password should have at least 6 characters."));
    }

    @Then("I have successfully subscribe the newsletter")
    public void iHaveSuccessfullySubscribeTheNewsletter() throws Throwable {
        System.out.println("Subscribe the Newsletter");
        MainPage mainPage = new MainPage(driver);
        String text = mainPage.subscriptionMessage();
        assertTrue(text.contains("Thank you for signing up! A verification email has been sent. We appreciate your interest."));
    }

    @Then("I have an error message enter valid email")
    public void i_Have_An_Error_Message_Enter_Valid_Mail() throws Throwable {
        System.out.println("invalid mail");
        MainPage mainPage = new MainPage(driver);
        String text = mainPage.wrongSubscriptionMessage();
        assertTrue(text.contains("Enter valid email"));
    }

}
