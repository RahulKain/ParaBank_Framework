package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

public class CucumberHooks {

    public static WebDriver driver;

    @Before
    public void setup() {
       System.out.println("Setting up Browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Navigate to url: " + ConfigReader.get("url"));
        driver.get(ConfigReader.get("url"));
    }
    @After
    public void teardown() {
        System.out.println("Closing Browser");
        if (driver != null) {
            driver.quit();
        }
    }
}