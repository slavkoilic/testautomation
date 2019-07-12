package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.NavigationSection;
import testdata.NewUserData;

import java.util.concurrent.TimeUnit;

public class RegisterAccountTest {

    WebDriver driver;
    NavigationSection navigation;
    AuthenticationPage authentication;
    CreateAccountPage createAccount;

    /**
     * setUp method used to:
     * - set path to the Firefox Driver
     * - open browser and maximize window
     * - go to the web address
     */
    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.gecko.driver","/home/slavko/Everything/Development/Tools/Selenium/geckoDriver/geckodriver-v0.24.0-linux64/geckodriver");

        /*
        This part is used if we want to switch to headless execution

        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("-headless");

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        driver = new FirefoxDriver(firefoxOptions);
*/

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");

    }

    /**
     * Register an new account
     * Navigate to Authentication page
     * Fill out all the fields with valid data
     * Click register button
     * Verify user gets redirected to the "My Account Page", which has LogOut button visible in the Navigation bar
     */
    @Test //(dataProviderClass =NewUserData.class, dataProvider = "userData")
    public void registerNewAccount(){
        navigation = new NavigationSection(driver);
        authentication = new AuthenticationPage(driver);
        createAccount = new CreateAccountPage(driver);
        navigation.clickSignIn();
        authentication.enterNewAddress("mail@slavkoilic9.com");
        authentication.clickCreateAccountBtn();
        createAccount.setGender("Mr");
        createAccount.setCustomerFirstName("Slavko");
        createAccount.setCustomerLastName("Ilic");
        createAccount.setPassword("password213");
        createAccount.setDateOfBirth("17","4", "1985");
        createAccount.checkNewsletter();
        createAccount.checkOptIn();

        createAccount.setAddrFirstName("Slavko");
        createAccount.setAddrLastName("Ilic");
        createAccount.setCompany("Company Z");
        createAccount.setAddressLine1("First Address Line");
        createAccount.setAddressLine2("Second Address Line");
        createAccount.setCity("Novi Sad");
        createAccount.setState("Hawaii");
        createAccount.setPostCode("21000");
        createAccount.setCountry("United States");
        createAccount.setAdditionalInfo("This is additional info");
        createAccount.setHomePhone("+38121555555");
        createAccount.setMobilePhone("+38163555555");
        createAccount.setAddressAlias("My Home Address");
        createAccount.clickRegisterButton();

        Assert.assertTrue(navigation.isSignOutVisible());




    }

    /**
     * close browser, quit driver after each method
     */
    @AfterMethod
    public void tearDown(){
       driver.quit();
    }
}
