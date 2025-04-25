package test.steps.definitions;

import data.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;

import page.objects.CheckoutPage;
import page.objects.HomePage;
import page.objects.ProductPage;

public class EndToEndSteps extends CucumberBaseTest{


    @And("User selects a product")
    public void userSelectsAProduct() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnProductLink();
    }


    @And("User adds product to cart")
    public void userAddsProductToCart() {
        ProductPage productPage = new ProductPage(driver);
        productPage.clickOnAddToCartButton();
    }

    @And("User clicks on cart button")
    public void userClicksOnCartButton() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickOnCartButton();
    }

    @And("User sees a successful cart addition message")
    public void userSeesASuccessfulCartAdditionMessage() {
        ProductPage productPage = new ProductPage(driver);
        String successfulAdditionMessage = productPage.getAlertText();
        String expectedSuccessMessage = Constants.PRODUCT_ADDED_TO_CART;
        Assertions.assertEquals(expectedSuccessMessage, successfulAdditionMessage);
        productPage.acceptAlert();
    }

    @And("User places an order")
    public void userPlacesAnOrder() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickOnPlaceOrderButton();
    }

    @And("User inserts order credentials")
    public void userInsertsOrderCredentials() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.insertName();
        checkoutPage.insertCountry();
        checkoutPage.insertCity();
        checkoutPage.insertCardNumber();
        checkoutPage.insertMonth();
        checkoutPage.insertYear();
    }

    @And("User purchases product")
    public void userPurchasesProduct() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickOnPurchaseButton();
    }

    @Then("User sees a successful purchase message")
    public void userSeesASuccessfulPurchaseMessage() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        String actualPurchaseMessage = checkoutPage.getSuccessfulPurchaseText();
        String expectedPurchaseMessage = Constants.PURCHASE_SUCCESFUL;
        Assertions.assertEquals(expectedPurchaseMessage, actualPurchaseMessage);
        checkoutPage.clickOnOkButton();
    }
}
