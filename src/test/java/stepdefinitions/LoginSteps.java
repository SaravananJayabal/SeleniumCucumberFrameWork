package stepdefinitions;

import base.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Constants;

public class LoginSteps {

    LoginPage loginPage =
            new LoginPage(DriverManager.getDriver());

    @Given("User opens SauceDemo website")
    public void openSite() {
        DriverManager.getDriver().get(Constants.URL);
    }

    @When("User enters valid credentials")
    public void enterCredentials() {
        loginPage.login(Constants.USERNAME, Constants.PASSWORD);
    }

    @Then("User should login successfully")
    public void verifyLogin() {
        String actualUrl = DriverManager.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        String expectedUrl = "https://www.saucedemo.com/inventory.html";

        Assert.assertEquals(expectedUrl, actualUrl);
    }
}
