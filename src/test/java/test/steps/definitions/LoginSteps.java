package test.steps.definitions;

import data.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;

import page.objects.HomePage;
import page.objects.LoginPage;

public class LoginSteps extends CucumberBaseTest {

    @Given("User navigates to website homepage")
    public void userNavigateToHomepage() {
        initializeDriver();
        goToHomepage();
    }


    @When("User clicks on login button")
    public void userClicksOnLoginButton() {
        HomePage homepage = new HomePage(driver);
        homepage.clickLoginLink();
    }

    @And("User inserts valid username and password")
    public void userInsertsValidUsernameAndPassword() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.inputLoginEmail();
        loginpage.inputLoginPassword();
    }

    @And("User clicks submit button")
    public void userClicksSubmitButton() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnLoginButton();
    }

    @Then("User sees a successful login message")
    public void userSeesASuccessfulLoginMessage() {
        HomePage homepage = new HomePage(driver);
        String loginMessage = homepage.getSuccessfulLoginMessage();
        Assertions.assertTrue(loginMessage.contains(Constants.WELCOME));
    }
}
