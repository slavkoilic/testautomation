package com.guru99.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
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
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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

        objLogin.loginToGuru99("mgr123","mgr123");
        objHomePage = new HomePage(driver);

        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manager id : mgr123"));
    }





}
