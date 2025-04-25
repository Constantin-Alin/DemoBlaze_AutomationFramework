package test;

import data.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.objects.CheckoutPage;
import page.objects.LoginPage;
import page.objects.ProductPage;

 class EndToEndTest extends BaseTest{

    @Test
    void productPurchaseTest() {
        homePage.clickLoginLink();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputLoginEmail();
        loginPage.inputLoginPassword();
        loginPage.clickOnLoginButton();
        String actualLogInMessage = homePage.getSuccessfulLoginMessage();
        Assertions.assertTrue(actualLogInMessage.contains(Constants.WELCOME));
        homePage.clickOnProductLink();
        ProductPage productPage = new ProductPage(driver);
        productPage.clickOnAddToCartButton();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickOnCartButton();
        String successfulAdditionMessage = productPage.getAlertText();
        String expectedSuccessMessage = Constants.PRODUCT_ADDED_TO_CART;
        Assertions.assertEquals(expectedSuccessMessage, successfulAdditionMessage);
        productPage.acceptAlert();
        checkoutPage.clickOnPlaceOrderButton();
        checkoutPage.insertName();
        checkoutPage.insertCountry();
        checkoutPage.insertCity();
        checkoutPage.insertCardNumber();
        checkoutPage.insertMonth();
        checkoutPage.insertYear();
        checkoutPage.clickOnPurchaseButton();
        String actualPurchaseMessage = checkoutPage.getSuccessfulPurchaseText();
        String expectedPurchaseMessage = Constants.PURCHASE_SUCCESFUL;
        Assertions.assertEquals(expectedPurchaseMessage, actualPurchaseMessage);
        checkoutPage.clickOnOkButton();
    }
}
