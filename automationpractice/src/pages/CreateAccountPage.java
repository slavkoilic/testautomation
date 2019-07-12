package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
    }

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

    public void setCustomerFirstName(String firstName){
        driver.findElement(txtCustomerFirstName).sendKeys(firstName);
    }

    public void setCustomerLastName (String lastName){
        driver.findElement(txtCustomerLastName).sendKeys(lastName);
    }

    public void setEmail(String email){
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void setPassword(String pass){
        driver.findElement(txtPassword).sendKeys(pass);
    }

    public void setDayOfBirth(String day){
        Select dayPicker = new Select(driver.findElement(dtpDay));
        dayPicker.selectByValue(day);
    }

    public void setMonthOfBirth(String month){
        Select monthPicker = new Select(driver.findElement(dtpMonth));
        monthPicker.selectByValue(month);
    }

    public void setYearOfBirth(String year){
        Select yearPicker = new Select(driver.findElement(dtpYear));
        yearPicker.selectByValue(year);
    }

    public void setDateOfBirth(String day, String month, String year){
        setDayOfBirth(day);
        setMonthOfBirth(month);
        setYearOfBirth(year);
    }

    public void checkNewsletter(){
        driver.findElement(chkNewsletter).click();
    }

    public void checkOptIn(){
        driver.findElement(chkOptIn).click();
    }

    public void setAddrFirstName(String firstName){
        driver.findElement(txtAddrFirstName).sendKeys(firstName);
    }

    public void setAddrLastName(String lastName){
        driver.findElement(txtAddrLastName).sendKeys(lastName);
    }

    public void setCompany(String company){
        driver.findElement(txtCompany).sendKeys(company);
    }

    public void setAddressLine1(String address){
        driver.findElement(txtAddressLine1).sendKeys(address);
    }

    public void setAddressLine2(String address){
        driver.findElement(txtAddressLine2).sendKeys(address);
    }

    public void setCity(String city){
        driver.findElement(txtCity).sendKeys(city);
    }

    public void setState(String state){
        Select selectState = new Select(driver.findElement(lstState));
        selectState.selectByVisibleText(state);
    }

    public void setPostCode(String postCode){
        driver.findElement(txtPostCode).sendKeys(postCode);
    }

    public void setCountry(String country){
        Select selectCountry = new Select(driver.findElement(lstCountry));
        selectCountry.selectByVisibleText(country);
    }

    public void setAdditionalInfo(String additionalInfo){
        driver.findElement(txtAdditionalInfo).sendKeys(additionalInfo);
    }

    public void setHomePhone(String homePhone){
        driver.findElement(txtHomePhone).sendKeys(homePhone);
    }

    public void setMobilePhone(String mobilePhone){
        driver.findElement(txtMobilePhone).sendKeys(mobilePhone);
    }

    public void setAddressAlias(String addressAlias){
        driver.findElement(txtAddressAlias).sendKeys(addressAlias);
    }

    public void clickRegisterButton(){
        driver.findElement(btnRegisterButton).click();
    }






}
