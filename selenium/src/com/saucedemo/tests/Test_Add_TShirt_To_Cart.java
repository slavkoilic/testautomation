package com.saucedemo.tests;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.ShoppingCartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_Add_TShirt_To_Cart {

    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    ShoppingCartPage shoppingCartPage;

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
        driver.get("https://www.saucedemo.com/");

    }

    @Test
    public void userCanAddBackpackToCart(){

        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);

        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogIn();

        inventoryPage.addToCartBackpack();
        inventoryPage.addToCartBoltTShirt();
        inventoryPage.openShoppingCart();

        Assert.assertTrue(shoppingCartPage.pageAddress().contains("/cart.html"));


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
