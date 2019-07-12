package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavigationSection;
import pages.SearchResultsPage;

import java.util.concurrent.TimeUnit;

public class SearchTest {

    WebDriver driver;
    HomePage homePage;
    NavigationSection navigation;
    SearchResultsPage searchResultsPage;



    @BeforeTest
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
    public void printSearchResultItems(){
        navigation = new NavigationSection(driver);
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);

        navigation.searchQuery("Printed dresses");
        navigation.clickSearchButton();

        //Assert.assertEquals(homePage.getNumberOfPopularItems(),7);

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
