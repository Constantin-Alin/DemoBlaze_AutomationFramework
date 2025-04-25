package page.objects;


import data.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Wait;

public class ProductPage extends BasePage {
    Logger log = LogManager.getLogger(ProductPage.class);

    @FindBy(xpath = "(//a[@href='#'])[7]")
    WebElement addToCartButton;


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCartButton() {
        Wait.waitUntilElementIsClickable(addToCartButton, driver);
        addToCartButton.click();
        log.info("Clicking on add to cart button");
    }
}


