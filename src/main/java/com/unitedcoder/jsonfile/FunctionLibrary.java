package com.unitedcoder.jsonfile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FunctionLibrary {

    static WebDriver driver;
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
    }
    public static void logIn(LoginUser user){
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(user.getName());
        WebElement passwordFiled=driver.findElement(By.id("password"));
        passwordFiled.sendKeys(user.getPassword());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
    }
    public static  void logOut(){
        WebElement logOutLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logOutLink.click();
    }
    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }
    public static void sleep(int sec){
        try {
            Thread.sleep(1000*sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void explicitWait(WebElement element,int timeOut){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static boolean addCustomer(Customer customer){
        WebElement customeListLink=driver.findElement(By.linkText("Customer List"));
        explicitWait(customeListLink,3);
        customeListLink.click();
        WebElement addCustomerLink=driver.findElement(By.xpath("//a[contains(text(),\"Add Customer\")]"));
        explicitWait(addCustomerLink,3);
        addCustomerLink.click();
        WebElement firstNameField=driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys(customer.getFirstname()+getCurrentTimeStamp());
        WebElement lastNameField=driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys(customer.getLastname()+getCurrentTimeStamp());
        WebElement emailField=driver.findElement(By.id("cust-email"));
        emailField.sendKeys("Test"+getCurrentTimeStamp()+customer.getEmail());
        WebElement saveButton=driver.findElement(By.name("save"));
        saveButton.click();
        WebElement successMessage=driver.findElement(
                By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if(successMessage.isDisplayed()){
            System.out.println("Customer added Successfully!");
            return true;
        }else {
            System.out.println("Failed to add customer!!");
            return false;
        }

    }

    public static boolean addProduct(Product product){
        WebElement productsLink = driver.findElement(By.id("nav_products"));
        explicitWait(productsLink,3);
        productsLink.click();
        WebElement addProductLink = driver.findElement(By.linkText("Add Product"));
        explicitWait(addProductLink,3);
        addProductLink.click();
        WebElement productNameInputField=driver.findElement(By.id("name"));
        productNameInputField.sendKeys(product.getProductName()+getCurrentTimeStamp());
        WebElement productCodeInputField=driver.findElement(By.id("product_code"));
        productCodeInputField.sendKeys(product.getProductCode()+getCurrentTimeStamp());
        Select productFactorySelect=new Select(driver.findElement(By.id("manufacturer")));
        productFactorySelect.selectByVisibleText(product.getProductManufacturer());
        WebElement categoryTab=driver.findElement(By.id("tab_category"));
        categoryTab.click();
        //WebElement productCategory=driver.findElement(By.xpath("(//*[text()="+product.getProductCategory()+"])[2]/preceding-sibling::td"));
        WebElement productCategory=driver.findElement(By.xpath(String.format("(//*[text()='%s'])[2]/preceding-sibling::td",product.getProductCategory())));
        productCategory.click();
        WebElement saveButton=driver.findElement(By.cssSelector("input[value='Save']"));
        saveButton.click();
        WebElement confirmationMessage=driver.findElement(By.cssSelector("div.success"));
        System.out.println("Confirmation message for add product: "+confirmationMessage.getText());
        if(confirmationMessage.isDisplayed())
            return true;
        else
            return false;
    }

    public static String getCurrentTimeStamp(){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        return now.format(formatter);
    }
}