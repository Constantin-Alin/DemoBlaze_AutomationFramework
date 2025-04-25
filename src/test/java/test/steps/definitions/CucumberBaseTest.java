package test.steps.definitions;

import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberBaseTest {
    WebDriver driver;

    public void initializeDriver() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void goToHomepage() {
        driver.get(Constants.URL);
    }
}
