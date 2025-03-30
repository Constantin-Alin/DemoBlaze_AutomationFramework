package page.objects;

import data.Constants;

import data.EmailAddress;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;

public class SignUpPage extends BasePage{
    Logger log = LogManager.getLogger(SignUpPage.class);


    @FindBy(xpath = "//*[@id='sign-username']")
    WebElement signUpUsername;

    @FindBy(xpath = "//input[@type='password']")
    WebElement signUpPassword;

    @FindBy(xpath = "//button[@onclick='register()']")
    WebElement signUpButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail(){
        Wait.waitUntilElementIsClickable(signUpUsername, driver);
        signUpUsername.sendKeys(EmailAddress.generateEmail());
        log.info("Inputting email address");
    }

    public void inputPassword() {
        Wait.waitUntilElementIsClickable(signUpPassword, driver);
        signUpPassword.sendKeys(Constants.PASSWORD);
        log.info("Inputting password");
    }

    public void clickSignUpButton() {
        Wait.waitUntilElementIsClickable(signUpButton, driver);
        signUpButton.click();
        log.info("Clicking on the sign up button");
    }
}
