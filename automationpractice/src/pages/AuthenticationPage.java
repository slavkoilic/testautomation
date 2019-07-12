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

    public void enterNewAddress(String email){
        driver.findElement(txtCreateEmail).sendKeys(email);
    }

    public void clickCreateAccountBtn(){
        driver.findElement(btnCreateAccount).click();
    }
}
