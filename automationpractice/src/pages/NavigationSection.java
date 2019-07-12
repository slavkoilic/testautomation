package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationSection {

    WebDriver driver;
    By btnSignIn = By.className("login");
    By btnSignOut = By.className("logout");
    By imgLogo = By.className("logo");
    By txtSearchField = By.id("search_query_top");
    By btnSearchButton = By.className("button-search");

    public NavigationSection(WebDriver driver){
        this.driver = driver;
    }


    public void clickOnLogo(){
        driver.findElement(imgLogo).click();
    }

    public void clickSignIn(){
        driver.findElement(btnSignIn).click();
    }

    public void clickSignOut(){
        driver.findElement(btnSignOut).click();
    }

    public void searchQuery(String query){
        driver.findElement(txtSearchField).sendKeys(query);
    }

    public void clickSearchButton(){
        driver.findElement(btnSearchButton).click();
    }

    public boolean isSignOutVisible(){

        if (driver.findElement(btnSignOut).isDisplayed()){
            return true;
        } else
            return false;

    }


}
