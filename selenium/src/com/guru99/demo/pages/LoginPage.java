package com.guru99.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPage {

    WebDriver driver;

    By user99GuruName = By.name("uid");
    By password99Guru = By.name("password");
    By titleText = By.className("barone");
    By loginButton = By.name("btnLogin");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    public void setUserName(String strUserName){
        driver.findElement(user99GuruName).sendKeys(strUserName);
    }

    public void setPassword(String strPassword){
        driver.findElement(password99Guru).sendKeys(strPassword);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public String getLoginTitle(){
        return driver.findElement(titleText).getText();
    }


    public void loginToGuru99(String strUserName, String strPassword){

        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickLogin();
    }

}
