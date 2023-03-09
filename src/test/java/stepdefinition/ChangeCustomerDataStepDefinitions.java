package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageobject.AccountAddressesPage;
import pageobject.*;

import static org.junit.Assert.assertTrue;

@RunWith(Cucumber.class)
public class ChangeCustomerDataStepDefinitions {

    WebDriver driver;


    @Then("I successfully change my address")
    public void iSuccessfullyChangeMyAddress() throws Throwable {
        System.out.println("Address has change");
        AccountAddressesPage accountAddressesPage = new AccountAddressesPage(driver);
        String text = accountAddressesPage.verifyNewAddress();
        assertTrue(text.contains("Am kleinen Teich 5"));
    }
}