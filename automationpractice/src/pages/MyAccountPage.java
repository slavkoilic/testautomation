package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    WebDriver driver;
    By btnOrderHistory = By.linkText("Order history and details");
    By btnMyCreditSlips = By.linkText("My credit slips"); //not unique
    By btnMyAddresses = By.linkText("My addresses"); // not unique
    By btnMyPersonalInformation = By.linkText("My Personal information");
    By btnMyWishLists = By.linkText("My Wishlists");


}
