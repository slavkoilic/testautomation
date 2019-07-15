package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.NavigationSection;

import java.util.concurrent.TimeUnit;

public class HomePageTest {

    WebDriver driver;
    NavigationSection navigation;
    HomePage homePage;
    String PATH_TO_FIREFOX_DRIVER = "/home/slavko/Everything/Development/Tools/Selenium/geckoDriver/geckodriver-v0.24.0-linux64/geckodriver";

    /**
     * setUp method to execute before this group of tests.
     * Set Firefox driver
     * Maximize window
     * go to web address
     */
    @BeforeTest
    public void setUp(){

        System.setProperty("webdriver.gecko.driver",PATH_TO_FIREFOX_DRIVER);


        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");

    }

    /**
     * Check if number of Popular items shown on a home page is equal to the expected number
     */

    @Test
    public void checkNumberOfPopularItems(){
        navigation = new NavigationSection(driver);
        homePage = new HomePage(driver);

        homePage.selectPopularTab();
        Assert.assertEquals(homePage.getNumberOfPopularItems(),7);

    }

    /**
     * Check if number of Best Seller items shown on a home page is equal to the expected number
     */
    @Test
    public void checkNumberOfBestSellerItems(){
        navigation = new NavigationSection(driver);
        homePage = new HomePage(driver);

        homePage.selectBestSellersTab();
        Assert.assertEquals(homePage.getNumberOfBestSellerItems(),7);

    }

    /**
     * After this group of tests, close browser, quit driver
     */
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
