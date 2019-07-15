/**
 * This is a Section class for the common navigation elements found in the application
 */
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

    /**
     * Click on a Logo. Returns user to the homepage
     */
    public void clickOnLogo(){
        driver.findElement(imgLogo).click();
    }

    /**
     * Click on a Sign In button
     */
    public void clickSignIn(){
        driver.findElement(btnSignIn).click();
    }

    /**
     * Click on a Sign Out button. Visible only when user is logged in
     */
    public void clickSignOut(){
        driver.findElement(btnSignOut).click();
    }

    /**
     * Method to enter search query into the Search field
     * Search field is visible accross the application
     * @param query
     */
    public void searchQuery(String query){
        driver.findElement(txtSearchField).sendKeys(query);
    }

    /**
     * Click on a Search button next to the Search field
     */
    public void clickSearchButton(){
        driver.findElement(btnSearchButton).click();
    }

    /**
     * Check if Sign Out button is visible.
     *
     * @return - returns boolean, can be used for verifications (i.e. if user is logged in)
     */
    public boolean isSignOutVisible(){

        if (driver.findElement(btnSignOut).isDisplayed()){
            return true;
        } else
            return false;

    }


}
