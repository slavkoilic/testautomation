package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {

    public AuthenticationPage(WebDriver driver){
        this.driver = driver;
    }

    WebDriver driver;
    By txtCreateEmail = By.id("email_create");
    By btnCreateAccount = By.id("SubmitCreate");
    By txtExistingEmail = By.id("email");
    By txtPassword = By.id("passwd");
    By btnSignIn = By.id("SubmitLogin");

    public void enterNewAddress(String email){
        driver.findElement(txtCreateEmail).sendKeys(email);
    }

    public void clickCreateAccountBtn(){
        driver.findElement(btnCreateAccount).click();
    }

    public void enterEmailAddress(String email){
        driver.findElement(txtExistingEmail).sendKeys(email);
    }

    public void enterPassword(String pass){
        driver.findElement(txtPassword).sendKeys(pass);
    }

    public void logInUser(String email, String pass){
        enterEmailAddress(email);
        enterPassword(pass);
    }

    public void clickSignInBtn(){
        driver.findElement(btnSignIn).click();
    }
}
