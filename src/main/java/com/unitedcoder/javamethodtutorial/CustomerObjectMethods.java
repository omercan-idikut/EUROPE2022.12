package com.unitedcoder.javamethodtutorial;

import com.unitedcoder.cubecartautomation.CustomerInfo;
import com.unitedcoder.cubecartautomation.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerObjectMethods {
    //login add customer delete customeer edit customer
    WebDriver driver;//null

    public CustomerObjectMethods() {
    }

    public CustomerObjectMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void logIn(LoginUser user){
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(user.getUserName());
        WebElement paswordFiled=driver.findElement(By.id("password"));
        paswordFiled.sendKeys(user.getPassword());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
    }
    public void addCustomer(CustomerInfo customerInfo){
        WebElement customerListLink=driver.findElement(By.linkText("Customer List"));
        customerListLink.click();
        WebElement addCustomerLink=driver.findElement(By.xpath("//a[contains(text(),\"Add Customer\")]"));
        addCustomerLink.click();
        WebElement titleField=driver.findElement(By.id("cust-title"));
        titleField.sendKeys(customerInfo.getTitle());
        WebElement firstNameField=driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys(customerInfo.getFirstName());
        WebElement lastNameField=driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys(customerInfo.getLastName());
        WebElement typeDropDown=driver.findElement(By.id("cust-type"));
        //Select select=new Select(typeDropDown);
        //select.selectByVisibleText(TypeDropDownVlaue.REGISTERED_CUSTOMER.getValue());
        WebElement emailField=driver.findElement(By.id("cust-email"));
        emailField.sendKeys(customerInfo.getEmail());
        WebElement saveButton=driver.findElement(By.name("save"));
        saveButton.click();
    }
    //vrify customer added
    public  boolean verifyCustomerAddedSuccessfully(){
        WebElement successMessage=driver.findElement(
                By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if (successMessage.isDisplayed()){
            System.out.println("Customer added Successfully!");
            return  true;
        }else {
            System.out.println("Failed to add customer!");
            return false;
        }
    }
    public void logOut(){
        WebElement logOutLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logOutLink.click();
        driver.close();
        driver.quit();
    }
}
