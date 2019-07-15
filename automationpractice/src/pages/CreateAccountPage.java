/**
 * Page Object Model class for Create New Account page.
 * This is the page where new user needs to enter his data in order to create new account
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

    WebDriver driver;
    By rdoGenderMr = By.id("id_gender1");
    By rdoGenderMrs = By.id("id_gender2");
    By txtCustomerFirstName = By.id("customer_firstname");
    By txtCustomerLastName = By.id("customer_lastname");
    By txtEmail = By.id("email");
    By txtPassword = By.id("passwd");
    By dtpDay = By.id("days");
    By dtpMonth = By.id("months");
    By dtpYear = By.id("years");
    By chkNewsletter = By.id("newsletter");
    By chkOptIn = By.id("optin");
    By txtAddrFirstName = By.id("firstname");
    By txtAddrLastName = By.id("lastname");
    By txtCompany = By.id("company");
    By txtAddressLine1 = By.id("address1");
    By txtAddressLine2 = By.id("address2");
    By txtCity = By.id("city");
    By lstState = By.id("id_state");
    By txtPostCode = By.id("postcode");
    By lstCountry = By.id("id_country");
    By txtAdditionalInfo = By.id("other");
    By txtHomePhone = By.id("phone");
    By txtMobilePhone = By.id("phone_mobile");
    By txtAddressAlias = By.id("alias");
    By btnRegisterButton = By.id("submitAccount");

    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
    }


    /**
     * Method to set gender.
     * Accepts male or female as input
     * @param gender
     */
    public void setGender(String gender){

        if(gender.equals("male")){
            driver.findElement(rdoGenderMr).click();
        }
        else if (gender.equals("female")){
            driver.findElement(rdoGenderMrs).click();
        }
        else {
            //Gender not selected, print out log
        }

    }

    /**
     * Method to enter Customer's First Name
     * @param firstName
     */
    public void setCustomerFirstName(String firstName){
        driver.findElement(txtCustomerFirstName).sendKeys(firstName);
    }

    /**
     * Method to enter Customer's Last Name
     * @param lastName
     */
    public void setCustomerLastName (String lastName){
        driver.findElement(txtCustomerLastName).sendKeys(lastName);
    }

    /**
     * Method to enter email address into the email field
     * @param email
     */
    public void setEmail(String email){
        driver.findElement(txtEmail).sendKeys(email);
    }

    /**
     * Method to set password
     * @param pass
     */
    public void setPassword(String pass){
        driver.findElement(txtPassword).sendKeys(pass);
    }

    /**
     * Method to select just the day of the birth
     * @param day
     */
    public void setDayOfBirth(String day){
        Select dayPicker = new Select(driver.findElement(dtpDay));
        dayPicker.selectByValue(day);
    }

    /**
     * Method to select just the month of the birth
     * @param month
     */
    public void setMonthOfBirth(String month){
        Select monthPicker = new Select(driver.findElement(dtpMonth));
        monthPicker.selectByValue(month);
    }

    /**
     * Method to select just the year of the birth
     * @param year
     */
    public void setYearOfBirth(String year){
        Select yearPicker = new Select(driver.findElement(dtpYear));
        yearPicker.selectByValue(year);
    }

    /**
     * Method to set the Date of Birth all at one by providing three parameters
     * @param day - day of birth
     * @param month - month of birth
     * @param year - year of birth
     */
    public void setDateOfBirth(String day, String month, String year){
        setDayOfBirth(day);
        setMonthOfBirth(month);
        setYearOfBirth(year);
    }

    /**
     * Method to check the Subscribe for the Newsletter checkbox
     */
    public void checkNewsletter(){
        driver.findElement(chkNewsletter).click();
    }

    /**
     * Method to check the OptIn checkbox
     */
    public void checkOptIn(){
        driver.findElement(chkOptIn).click();
    }

    /**
     * Method to set the First Name in the Address section.
     * Filled out by default, can be changed if it differs from the name of the Customer
     * @param firstName
     */
    public void setAddrFirstName(String firstName){
        driver.findElement(txtAddrFirstName).sendKeys(firstName);
    }

    /**
     * Method to set the Last Name in the Address section.
     * Filled out by default, can be changed if it differs from the last name of the Customer
     * @param lastName
     */
    public void setAddrLastName(String lastName){
        driver.findElement(txtAddrLastName).sendKeys(lastName);
    }

    /**
     * Method to set the Company name
     * @param company
     */
    public void setCompany(String company){
        driver.findElement(txtCompany).sendKeys(company);
    }

    /**
     * Method to set the first Address Line
     * @param address
     */
    public void setAddressLine1(String address){
        driver.findElement(txtAddressLine1).sendKeys(address);
    }

    /**
     * Method to set the second Address Line if needed (optional)
     * @param address
     */
    public void setAddressLine2(String address){
        driver.findElement(txtAddressLine2).sendKeys(address);
    }

    /**
     * Method to set City
     * @param city
     */
    public void setCity(String city){
        driver.findElement(txtCity).sendKeys(city);
    }

    /**
     * Method to set State
     * @param state
     */
    public void setState(String state){
        Select selectState = new Select(driver.findElement(lstState));
        selectState.selectByVisibleText(state);
    }

    /**
     * Method to set Zip/Postal code
     * @param postCode
     */
    public void setPostCode(String postCode){
        driver.findElement(txtPostCode).sendKeys(postCode);
    }

    /**
     * Method to set country
     * @param country
     */
    public void setCountry(String country){
        Select selectCountry = new Select(driver.findElement(lstCountry));
        selectCountry.selectByVisibleText(country);
    }

    /**
     * Method to enter additional info to the corresponding field
     * @param additionalInfo
     */
    public void setAdditionalInfo(String additionalInfo){
        driver.findElement(txtAdditionalInfo).sendKeys(additionalInfo);
    }

    /**
     * Method to set Home Phone number
     * @param homePhone
     */
    public void setHomePhone(String homePhone){
        driver.findElement(txtHomePhone).sendKeys(homePhone);
    }

    /**
     * Method to set Mobile Phone number
     * @param mobilePhone
     */
    public void setMobilePhone(String mobilePhone){
        driver.findElement(txtMobilePhone).sendKeys(mobilePhone);
    }

    /**
     * Method to set Address Alias
     * @param addressAlias
     */
    public void setAddressAlias(String addressAlias){
        driver.findElement(txtAddressAlias).sendKeys(addressAlias);
    }

    /**
     * Clicks on a Register Button
     */
    public void clickRegisterButton(){
        driver.findElement(btnRegisterButton).click();
    }






}
