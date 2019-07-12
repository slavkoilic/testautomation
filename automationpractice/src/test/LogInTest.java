package test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.NavigationSection;
import org.apache.commons.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LogInTest {
    WebDriver driver;
    NavigationSection navigation;
    AuthenticationPage authentication;


    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.gecko.driver","/home/slavko/Everything/Development/Tools/Selenium/geckoDriver/geckodriver-v0.24.0-linux64/geckodriver");

        //FirefoxBinary firefoxBinary = new FirefoxBinary();
        //firefoxBinary.addCommandLineOptions("-headless");

        //FirefoxOptions firefoxOptions = new FirefoxOptions();
        //firefoxOptions.setBinary(firefoxBinary);
        //driver = new FirefoxDriver(firefoxOptions);


        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");

    }

    @Test
    public void userCanLogIn(){
        navigation = new NavigationSection(driver);
        authentication = new AuthenticationPage(driver);
        navigation.clickSignIn();
        authentication.logInUser("this_test_should_fail", "this_is_no_password");

        Assert.assertTrue(navigation.isSignOutVisible());
    }

    @AfterMethod
    public void tearDown(ITestResult result){

        if (ITestResult.FAILURE == result.getStatus()){

            try{

                TakesScreenshot screenshot=(TakesScreenshot)driver;

                File src=screenshot.getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(src, new File("D:\\"+result.getName()+".png"));

                System.out.println("Successfully captured a screenshot");

            }catch (Exception e){

                System.out.println("Exception while taking screenshot "+e.getMessage());

            }

        }

        driver.quit();

    }
}
