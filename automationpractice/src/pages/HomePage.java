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

    /**
     * Selects the Popular tab on the Home Page
     */
    public void selectPopularTab(){
        driver.findElement(btnPopular).click();
    }

    /**
     * Selects the Best Sellers tab on the Home Page
     */
    public void selectBestSellersTab(){
        driver.findElement(btnBestSellers).click();
    }

    /**
     * Gets the number of Popular Items shown on the Home Page
     * @return
     */
    public int getNumberOfPopularItems(){
        return driver.findElement(ulHomeFeatured).findElements(listItems).size();

    }

    /**
     * Gets the number of Best Seller items shown on the Home Page
     * @return
     */
    public int getNumberOfBestSellerItems(){
        return driver.findElement(ulBestSellers).findElements(listItems).size();

    }

}
