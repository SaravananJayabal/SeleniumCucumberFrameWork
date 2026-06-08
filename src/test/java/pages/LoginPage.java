package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By userName = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");

    public void enterUserName(String uname) {
        enterText(userName, uname);
    }

    public void enterPassword(String pwd) {
        enterText(password, pwd);
    }

    public void clickLogin() {
        click(loginBtn);
    }

    public void login(String uname, String pwd) {

        enterUserName(uname);
        enterPassword(pwd);
        clickLogin();
    }

}
