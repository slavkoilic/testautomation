package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    By ulHomeFeatured = By.id("homefeatured");
    By ulBestSellers = By.id("blockbestsellers");
    By btnPopular = By.cssSelector("a.homefeatured");
    By btnBestSellers = By.cssSelector("a.blockbestsellers");
    By listItems = By.tagName("li");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void selectPopularTab(){
        driver.findElement(btnPopular).click();
    }

    public void selectBestSellersTab(){
        driver.findElement(btnBestSellers).click();
    }

    public int getNumberOfPopularItems(){
        return driver.findElement(ulHomeFeatured).findElements(listItems).size();

    }

    public int getNumberOfBestSellerItems(){
        return driver.findElement(ulBestSellers).findElements(listItems).size();

    }

}
