package com.unitedcoder.cubecartautomation;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CubeCartAddCustomerTest {
    public static void main(String[] args) throws InterruptedException {

        LoginUser loginUser=new LoginUser();
        String[] credentials={"testautomation1","automation123!"};
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        WebElement userNameField=driver.findElement(By.id("username"));
        loginUser.setUserName(credentials[0]);
        userNameField.sendKeys(loginUser.getUserName());
        WebElement paswordFiled=driver.findElement(By.id("password"));
        loginUser.setPassword(credentials[1]);
        paswordFiled.sendKeys(loginUser.getPassword());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
        CustomerInfo customerInfo=new CustomerInfo("Aynigar"+System.currentTimeMillis(),
                "Alim"+System.currentTimeMillis(),"Mrs",
                "Aynigar"+System.currentTimeMillis()+"@gmail.com");
        WebElement customeListLink=driver.findElement(By.linkText("Customer List"));
        customeListLink.click();
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
        //select.selectByValue("2");
        WebElement emailField=driver.findElement(By.id("cust-email"));
        emailField.sendKeys(customerInfo.getEmail());
        WebElement saveButton=driver.findElement(By.name("save"));
        saveButton.click();
        WebElement successMessage=driver.findElement(
                By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if(successMessage.isDisplayed()){
            System.out.println("Customer added Successfully!");
        }else {
            System.out.println("Failed to add customer!!");
        }
        WebElement logOutLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logOutLink.click();
        driver.close();
        driver.quit();


    }
}