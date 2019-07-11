package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

    WebDriver driver;
    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
    }

    public String pageAddress(){
        return driver.getCurrentUrl();
    }
}
