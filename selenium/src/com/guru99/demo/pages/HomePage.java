package com.guru99.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    //By homePageUserName = By.xpath("//table//tr[@class='heading3']");
    By homePageUserName = By.cssSelector("tr.heading3");
//tr.heading3

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public String getHomePageDashboardUserName(){

        return driver.findElement(homePageUserName).getText();
    }
}
