package page.objects;

import data.Constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;

public class LoginPage extends BasePage {
    Logger log = LogManager.getLogger(LoginPage.class);

    @FindBy(css = "#loginusername")
    WebElement loginEmail;

    @FindBy(css = "#loginpassword")
    WebElement loginPassword;

    @FindBy(xpath = "//button[@onclick='logIn()']")
    WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputLoginEmail() {
        Wait.waitUntilElementIsClickable(loginEmail, driver);
        loginEmail.sendKeys(Constants.LOGIN_EMAIL);
        log.info("Inputting email address");
    }

    public void inputLoginPassword() {
        Wait.waitUntilElementIsClickable(loginPassword, driver);
        loginPassword.sendKeys(Constants.PASSWORD);
        log.info("Inputting password");
    }

    public void clickOnLoginButton() {
        Wait.waitUntilElementIsClickable(loginButton, driver);
        loginButton.click();
        log.info("Clicking on the login button");
    }
}
