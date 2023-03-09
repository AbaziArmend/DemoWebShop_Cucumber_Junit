package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.ShoppingCartPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

@RunWith(Cucumber.class)
public class AddItemToShoppingCartStepDefinitons {

    WebDriver driver;
    
    @Then("I have successfully add an item to the shopping cart")
    public void iHaveSuccessfullyAddAnItemToTheShoppingCart() {
        System.out.println("Add correct item to shopping cart");
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        String text = shoppingCartPage.verifyShoppingCart();
        assertTrue(text.contains("Blue Jeans"));
    }


    @Then("I have an error message no item found")
    public void iHaveAnErrorMessageNoItemFound() {
        System.out.println("No item has found");
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        String text = shoppingCartPage.errorMessageNoItem();
        assertTrue(text.contains("No products were found that matched your criteria."));
    }


}
