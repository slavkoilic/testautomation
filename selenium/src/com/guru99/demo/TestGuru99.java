package com.guru99.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGuru99 {


    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver","/home/slavko/Everything/Development/Tools/Selenium/geckoDriver/geckodriver-v0.24.0-linux64/geckodriver");

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("http://demo.guru99.com/");

        WebElement emailField = driver.findElement(By.xpath("//input[@name='emailid']"));
        emailField.sendKeys("abc@emailaddress.com");


        WebElement submitButton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        submitButton.click();



    }

}
