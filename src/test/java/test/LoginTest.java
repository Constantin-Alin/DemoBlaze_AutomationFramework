package test;

import data.Constants;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import page.objects.LoginPage;

class LoginTest extends BaseTest {

    @Test
    void loginTest() {
        homePage.clickLoginLink();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputLoginEmail();
        loginPage.inputLoginPassword();
        loginPage.clickOnLoginButton();
        String actualLogInMessage = homePage.getSuccessfulLoginMessage();
        Assertions.assertTrue(actualLogInMessage.contains(Constants.WELCOME));
    }
}
