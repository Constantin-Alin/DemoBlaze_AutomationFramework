package test.steps.definitions;

import data.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;

import page.objects.HomePage;
import page.objects.SignUpPage;

public class SignUpSteps extends CucumberBaseTest {

    @Given("User navigates to website")
    public void userNavigateToHomepage() {
        initializeDriver();
        goToHomepage();
    }


    @When("User clicks on sign up link")
    public void userClicksOnSignUpLink() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnSignUpLink();
    }


    @And("User inserts valid credentials")
    public void userInsertsValidCredentials() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputEmail();
        signUpPage.inputPassword();
    }

    @And("User clicks on sign up button")
    public void userClicksOnSignUpButton() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.clickSignUpButton();
    }

    @Then("User sees a successful sign up message")
    public void userSeesASuccessfulSignUpMessage() {
        SignUpPage signUpPage = new SignUpPage(driver);
        String succesfulSignUpMessage = signUpPage.getAlertText();
        Assertions.assertTrue(succesfulSignUpMessage.contains(Constants.SIGN_UP_SUCCESS));
    }
}

