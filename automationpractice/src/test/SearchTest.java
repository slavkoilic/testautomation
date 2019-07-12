package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.NavigationSection;
import pages.SearchResultsPage;

import java.util.concurrent.TimeUnit;

public class SearchTest {

    WebDriver driver;
    HomePage homePage;
    NavigationSection navigation;
    SearchResultsPage searchResultsPage;


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
     * Use a query to search for products on the website
     * Print the names of the products found to the txt file
     * Verify if file is created
     * Verify if the file content is as expected
     */
    @Test
    public void printSearchResultItems(){
        navigation = new NavigationSection(driver);
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);

        navigation.searchQuery("Printed dresses");
        navigation.clickSearchButton();

        //print list of results to the txt file
        searchResultsPage.printListToFile("/home/slavko/Everything/tmp/list.txt");

        //Assert if file is created and if its content is as expected
        //TBD

    }

    /**
     * After each test method - close browser, quit driver
     *
     */
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
