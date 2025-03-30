package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Wait;

public class HomePage extends BasePage {

    Logger log = LogManager.getLogger(HomePage.class);

    @FindBy(xpath = "//a[@data-target='#signInModal']")
    WebElement signUpLink;

    @FindBy(css = "#login2")
    WebElement loginLink;

    @FindBy(css = "#nameofuser")
    WebElement succesfulLoginMessage;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSignUpLink() {
        Wait.waitUntilElementIsClickable(signUpLink, driver);
        signUpLink.click();
        log.info("Clicking on sign up link");
    }

    public void clickLoginLink() {
        Wait.waitUntilElementIsClickable(loginLink, driver);
        loginLink.click();
        log.info("Clicking on login link");
    }

    public String getSuccessfulLoginMessage() {
        Wait.waitUntilElementIsVisible(succesfulLoginMessage, driver);
        log.info("Message acquired");
        return succesfulLoginMessage.getText();
    }
}
