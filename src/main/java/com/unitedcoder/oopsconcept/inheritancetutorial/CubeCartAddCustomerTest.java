package com.unitedcoder.oopsconcept.inheritancetutorial;

import com.unitedcoder.cubecartautomation.CustomerInfo;
import com.unitedcoder.cubecartautomation.TypeDropDownVlaue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CubeCartAddCustomerTest extends BaseClass{
    public static void main(String[] args) {
        openBrowser();
        logIn("testautomation1","automation123!");
        CustomerInfo customerInfo=new CustomerInfo("Aynigar"+System.currentTimeMillis(),
                "Alim"+System.currentTimeMillis(),"Mrs",
                "Aynigar"+System.currentTimeMillis()+"@gmail.com");
        addCustomerTest(customerInfo);
        logOut();
        closeBrowser();
    }
    public static boolean addCustomerTest(CustomerInfo customerInfo){
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
        Select select=new Select(typeDropDown);
        select.selectByVisibleText(TypeDropDownVlaue.REGISTERED_CUSTOMER.getValue());
        WebElement emailField=driver.findElement(By.id("cust-email"));
        emailField.sendKeys(customerInfo.getEmail());
        WebElement saveButton=driver.findElement(By.name("save"));
        saveButton.click();
        WebElement successMessage=driver.findElement(
                By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if (successMessage.isDisplayed()){
            System.out.println("Customer added Successfully!");
            return true;
        }else {
            System.out.println("Failed to add customer!");
            return false;
        }
    }
}
