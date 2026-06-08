package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSteps {
    WebDriver driver;
    @Given("User launches Chrome browser")
    public void user_launches_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @When("User opens Google website")
    public void user_opens_google_website() {
        driver.get("https://www.google.com");

    }
    @Then("Google page should be displayed")
    public void google_page_should_be_displayed() {
        System.out.println("Title: " + driver.getTitle());
        driver.quit();

    }
}
