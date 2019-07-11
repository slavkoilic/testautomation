package com.guru99.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class TestGuru99Login {



    WebDriver driver;
    LoginPage objLogin;
    HomePage objHomePage;



    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.gecko.driver","/home/slavko/Everything/Development/Tools/Selenium/geckoDriver/geckodriver-v0.24.0-linux64/geckodriver");

        FirefoxBinary firefoxBinary = new FirefoxBinnary();
        firefoxBinary.addCommandLineOptions("-headless");

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);

        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

    @Test(priority=0)
    public void test_HomePageTitle(){

        objLogin = new LoginPage(driver);

        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
    }


    @Test
    public void test_SuccessfulLogin(){
        objLogin = new LoginPage(driver);

        objLogin.loginToGuru99("mngr207817","Ygudyta");
        objHomePage = new HomePage(driver);
        String username = objHomePage.getHomePageDashboardUserName();

        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr207817"));
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }





}
