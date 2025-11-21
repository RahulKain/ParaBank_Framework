package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
//Locators
    //@FindBy(xpath = "//img[@alt='ParaBank']")
    //private WebElement logo;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameInput;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;
    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement logInButton;
    @FindBy(xpath = "//p[@class='smallText']")
    private WebElement loginMessage;
    @FindBy(xpath = "//p[text()='The username and password could not be verified.']")
    private WebElement usernameErrorMessage;
    public LoginPage(WebDriver driver) {
        super(driver);
    }
   public boolean isLogoDisplayed() {
       WebElement logo = driver.findElement(By.cssSelector("img.logo"));
       return logo.isDisplayed();
  }
    public void setUsername(String username){
        usernameInput.sendKeys(username);
    }
    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void clickLogInButton(){
        logInButton.click();
    }
    public boolean isLoginMessageDisplayed(){
        wait.until(ExpectedConditions.visibilityOf(loginMessage));
        return loginMessage.isDisplayed();
    }
    public boolean isUsernameErrorMessageDisplayed(){
        wait.until(ExpectedConditions.visibilityOf(usernameErrorMessage));
        return usernameErrorMessage.isDisplayed();
    }
}
