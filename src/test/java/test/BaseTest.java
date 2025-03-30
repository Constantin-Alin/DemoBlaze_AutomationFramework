package test;

import data.Constants;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HomePage;

class BaseTest {
    public WebDriver driver;
    HomePage homePage;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.get(Constants.URL);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Test
    void goToWebsiteTest() {
        driver.get(Constants.URL);
    }
}
