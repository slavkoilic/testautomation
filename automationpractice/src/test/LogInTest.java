package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.NavigationSection;
//import utils.SendEmail; <------ didn't get SMTP server, tried to find some free, but ran out of time.

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LogInTest {
    WebDriver driver;
    NavigationSection navigation;
    AuthenticationPage authentication;
    //SendEmail sendEmail;


    /**
     * setUp method to execute before this group of tests.
     * Set Firefox driver
     * Maximize window
     * go to web address
     */
    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.gecko.driver","/home/slavko/Everything/Development/Tools/Selenium/geckoDriver/geckodriver-v0.24.0-linux64/geckodriver");


        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");

    }

    /**
     * Test if user can log in with valid credentials.
     * If test fails, create screenshot on the dedicated path
     * If test fails, send email to the dedicated email address
     */
    @Test
    public void userCanLogIn(){
        navigation = new NavigationSection(driver);
        authentication = new AuthenticationPage(driver);
        navigation.clickSignIn();
        authentication.logInUser("this_test_will_fail", "this_is_no_password");

        Assert.assertTrue(navigation.isSignOutVisible());
    }

    /**
     * Execute after each method.
     * Take test result as an input
     * If result == Failure then take a screenshot and send email
     * @param result - test result of an executed method
     */
    @AfterMethod
    public void tearDown(ITestResult result){

        if (ITestResult.FAILURE == result.getStatus()){

            try{

                TakesScreenshot screenshot=(TakesScreenshot)driver;

                File src=screenshot.getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(src, new File("/home/slavko/Everything/tmp/"+result.getName()+".png"));
                System.out.println("Successfully captured a screenshot");

                //sendEmail.sendMail();

            }catch (Exception e){

                System.out.println("Exception while taking screenshot "+e.getMessage());

            }

        }

        driver.quit();

    }
}
