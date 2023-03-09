package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/albertabazi/eclipse-workspace_0/Maven_Selenium/src/test/java/features/05_SubscribeNewsletter.feature",
        glue = "stepdefinition")

public class Testrunner {
}
