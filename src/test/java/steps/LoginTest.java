package steps;

import hooks.CucumberHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.LoginPage;
import hooks.CucumberHooks;

public class LoginTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    public LoginPage loginPage;
    public WebDriver driver;

    public LoginTest() {
        this.driver = CucumberHooks.driver;   // use driver initialized in Hooks
        this.loginPage = new LoginPage(driver);


    }

        @Given("User is on the ParaBank Log In page")
        public void user_is_on_the_para_bank_log_in_page() {
            //System.out.println("User is on the ParaBank Log In page");
            loginPage.isLogoDisplayed();

        }

        @When("I enter a valid Username and Password")
        public void i_enter_a_valid_username_and_password() {
            //System.out.println("I enter a valid Username and Password");
            loginPage.setUsername("amans");
            loginPage.setPassword("xyz#321K");
        }

        @When("I click the Log In button")
        public void i_click_the_log_in_button() {
           // System.out.println("I click the Log In button");
            loginPage.clickLogInButton();
        }

        @Then("the welcome message is displayed")
        public void the_welcome_message_is_displayed() {
            loginPage.isLoginMessageDisplayed();
        }


        @When("User enters the Invalid Username and Password")
        public void user_enters_the_invalid_username_and_password() {
            loginPage.setUsername("1223456");
            loginPage.setPassword("123");
        }

        @Then("a generic login error message should be displayed")
        public void a_generic_login_error_message_should_be_displayed() {
        loginPage.isLoginMessageDisplayed();
           System.out.println("Login Error");
        }
    }

