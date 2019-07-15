package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    WebDriver driver;
    By addToCartBackpackButton = By.xpath("//div//div[@class='inventory_list']//div[1]//div[3]//button[1]");
    By getAddToCartBoltTShirtButton = By.xpath("//div//div[@class='inventory_list']//div[5]//div[3]//button[1]");
    By cartIcon = By.className("fa-shopping-cart");

    public String pageAddress(){
        return driver.getCurrentUrl();
    }

    public void addToCartBackpack(){
        driver.findElement(addToCartBackpackButton).click();
    }

    public void addToCartBoltTShirt(){
        driver.findElement(getAddToCartBoltTShirtButton).click();
    }

    public void openShoppingCart(){
        driver.findElement(cartIcon).click();
    }
}
