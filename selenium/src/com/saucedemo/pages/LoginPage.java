package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    WebDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.className("btn_action");

    public void setUsername(String strUsername){
        driver.findElement(username).sendKeys(strUsername);
    }

    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }

    public void clickLogIn(){
        driver.findElement(loginButton).click();
    }
}
