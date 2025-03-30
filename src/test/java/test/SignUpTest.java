package test;

import data.Constants;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import page.objects.SignUpPage;


class SignUpTest extends BaseTest {

    @Test
     void createAccountTest() {
        homePage.clickOnSignUpLink();
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputEmail();
        signUpPage.inputPassword();
        signUpPage.clickSignUpButton();
        String actualSuccessMessage = signUpPage.getAlertText();
        String expectedSuccessMessage = Constants.SIGN_UP_SUCCESS;
        Assertions.assertEquals(expectedSuccessMessage, actualSuccessMessage);
        signUpPage.acceptAlert();
    }
}
