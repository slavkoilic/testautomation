/**
 * Page Object Model class for Authentication Page.
 * This Page allows users to either log in to an existing account, or register a new one
 */

package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class AuthenticationPage {

    WebDriver driver;
    By txtCreateEmail = By.id("email_create");
    By btnCreateAccount = By.id("SubmitCreate");
    By txtExistingEmail = By.id("email");
    By txtPassword = By.id("passwd");
    By btnSignIn = By.id("SubmitLogin");

    /**
     * Constructor - initializes driver
     * @param driver - used to pass the WebDriver. Enables tester to quickly change
     */
    public AuthenticationPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * method to enter mail address into the field for user registration
     * @param email - email address
     */
    public void enterNewAddress(String email){
        driver.findElement(txtCreateEmail).sendKeys(email);
    }

    /**
     * click on Create Account button
     */
    public void clickCreateAccountBtn(){
        driver.findElement(btnCreateAccount).click();
    }

    /**
     * method to enter mail address into to field for existing users' login
     * @param email
     */
    public void enterEmailAddress(String email){
        driver.findElement(txtExistingEmail).sendKeys(email);
    }

    /**
     * method to enter password into a password field for users' login
     * @param pass
     */
    public void enterPassword(String pass){
        driver.findElement(txtPassword).sendKeys(pass);
    }

    /**
     * Method for user login. Accepts 2 parameters.
     * @param email - email of the existing user
     * @param pass - corresponding password
     */
    public void logInUser(String email, String pass){
        enterEmailAddress(email);
        enterPassword(pass);
    }

    /**
     * click on Sign In button
     */
    public void clickSignInBtn(){
        driver.findElement(btnSignIn).click();
    }
}
