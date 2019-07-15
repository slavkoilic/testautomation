package testdata;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class NewUserData {

    WebDriver driver;

    /**
     * DataProvider method to store data needed for new users creation.
     * @return - returns the two dimensional array of Objects. In this case, all type of String
     */
    @DataProvider(name = "newUserData")
    public static Object[][] userData(){

        //email, gender, firstname, lastname, password, day, month, year, company, addressLine1, addressLine2, city, state, postalCode, country, additionalInfo, homePhone, mobilePhone, addressAlias
        return new Object[][]{
                            {"mail@slavkoilic11.com","Mr", "Slavko", "Ilic", "password123", "17", "4", "1985", "Company Z", "First Address Line", "Second Address Line", "Novi Sad", "Hawaii", "21000", "United States","This is Additional Info", "+38121555555", "+38163555555", "MyHomeAddressAlias"},
                            {"mail@slavkoilic12.com","Mr", "Slavko", "Ilic", "password123", "17", "4", "1985", "Company Z", "First Address Line", "Second Address Line", "Novi Sad", "Hawaii", "21000", "United States","This is Additional Info", "+38121555555", "+38163555555", "MyHomeAddressAlias"},
                            {"mail@slavkoilic13.com","Mr", "Slavko", "Ilic", "password123", "17", "4", "1985", "Company Z", "First Address Line", "Second Address Line", "Novi Sad", "Hawaii", "21000", "United States","This is Additional Info", "+38121555555", "+38163555555", "MyHomeAddressAlias"},
                            {"mail@slavkoilic14.com","Mr", "Slavko", "Ilic", "password123", "17", "4", "1985", "Company Z", "First Address Line", "Second Address Line", "Novi Sad", "Hawaii", "21000", "United States","This is Additional Info", "+38121555555", "+38163555555", "MyHomeAddressAlias"}};
    }

}
