package page.objects;

import data.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wait;

public class CheckoutPage extends BasePage {

    Logger log = LogManager.getLogger(CheckoutPage.class);

    @FindBy(css = "#cartur")
    WebElement cartButton;

    @FindBy(xpath = "//button[@data-target='#orderModal']")
    WebElement placeOrderButton;

    @FindBy(xpath = "//input[@id='name']")
    WebElement inputName;

    @FindBy(xpath = "//input[@id='country']")
    WebElement inputCountry;

    @FindBy(xpath = "//input[@id='city']")
    WebElement inputCityName;

    @FindBy(xpath = "//input[@id='card']")
    WebElement inputCardNumber;

    @FindBy(xpath = "//input[@id='month']")
    WebElement inputMonth;

    @FindBy(xpath = "//input[@id='year']")
    WebElement inputYear;

    @FindBy(xpath = "//button[@onclick='purchaseOrder()']")
    WebElement purchaseButton;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    WebElement okButton;



    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCartButton() {

        Wait.waitUntilElementIsClickable(cartButton, driver);
        cartButton.click();
        log.info("Clicking on cart button");
    }

    public void clickOnPlaceOrderButton() {
        Wait.waitUntilElementIsClickable(placeOrderButton, driver);
        placeOrderButton.click();
        log.info("Placing order");
    }

    public void insertName() {
        Wait.waitUntilElementIsVisible(inputName, driver);
        inputName.sendKeys(Constants.NAME_FOR_SHIPPING);
        log.info("Inserting name for shipping");
    }

    public void insertCountry() {
        Wait.waitUntilElementIsVisible(inputCountry, driver);
        inputCountry.sendKeys(Constants.COUNTRY_FOR_SHIPPING);
        log.info("Inserting country for shipping");
    }

    public void insertCity() {
        Wait.waitUntilElementIsVisible(inputCityName, driver);
        inputCityName.sendKeys(Constants.CITY_FOR_SHIPPING);
        log.info("Inserting city for shipping");
    }

    public void insertCardNumber() {
        Wait.waitUntilElementIsVisible(inputCardNumber, driver);
        inputCardNumber.sendKeys(Constants.CARD_NUMBER);
        log.info("Inserting card number for purchase");
    }

    public void insertMonth() {
        Wait.waitUntilElementIsVisible(inputMonth, driver);
        inputMonth.sendKeys(Constants.MONTH);
        log.info("Inserting the month of birth");
    }

    public void insertYear() {
        Wait.waitUntilElementIsVisible(inputYear, driver);
        inputYear.sendKeys(Constants.YEAR);
        log.info("Inserting the year of birth");
    }

    public void clickOnPurchaseButton() {
        Wait.waitUntilElementIsClickable(purchaseButton, driver);
        purchaseButton.click();
        log.info("Clicking on place order button");
    }

    public void clickOnOkButton() {
        Wait.waitUntilElementIsVisible(okButton, driver);
        okButton.click();
        log.info("Clicking on the confirmation button");
    }

    public String getSuccessfulPurchaseText() {
        log.info("Message acquired");
        return Constants.PURCHASE_SUCCESFUL;
    }
}
