package com.unitedcoder.testresulthomework;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SectionToMain {
    public static void main(String[] args) {
        /*-------------1.Webdriver initialize Section---------------*/
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        /*-------------Json files recording Section---------------*/
        MainDemoAssignmentJasonTestResult testResult = new MainDemoAssignmentJasonTestResult();
        String startTime = MainDemoTestHelper.getToday() + " " + MainDemoTestHelper.getCurrentTime();
        testResult.setTestStartTime(startTime);
        testResult.setTestExcutedBy(MainDemoTestHelper.getCurrentUer());
        List<MainDemoAssignmentTestResultJsonObject> testResultJsonObjects = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        /*-------------2.Login Section---------------*/
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        MainDemoLoginUser user = new MainDemoLoginUser("testautomation1", "automation123!");
        driver.findElement(By.id("username")).sendKeys(user.getName()); //input username
        driver.findElement(By.id("password")).sendKeys(user.getPassword());//input password
        driver.findElement(By.id("login")).click();//click login button

        /*-------------Json files recording Section---------------*/
        MainDemoAssignmentTestResultJsonObject loginInnerObject = new MainDemoAssignmentTestResultJsonObject();
        loginInnerObject.setTestModule("Login");
        loginInnerObject.setTestName("Login");
        loginInnerObject.setTestDate(MainDemoTestHelper.getToday());
        loginInnerObject.setTestTime(MainDemoTestHelper.getCurrentTime());
        loginInnerObject.setTestStatus(true);




        /*-------------3.Add Customer Section---------------*/
        MainDemoCustomerObject customer = new MainDemoCustomerObject(true, "Manager", "kyo", "Boo", "Registered Customer",
                "tester@gmail.com", "+90212111222333", "+90555111222333", "No");

        driver.findElement(By.linkText("Customer List")).click();//right side menu
        driver.findElement(By.xpath("//a[contains(text(),\"Add Customer\")]")).click();//click add tab
        if (customer.getStatus() == true)
            driver.findElement(By.cssSelector("img[title=\"Enable\"]")).click(); // if is true ,click on status box

        driver.findElement(By.id("cust-title")).sendKeys(customer.getTitle());//title
        driver.findElement(By.id("cust-firstname")).sendKeys(customer.getFirstName());//firstname
        driver.findElement(By.id("cust-lastname")).sendKeys(customer.getLastName());//lastname

        WebElement typeDropDown = driver.findElement(By.id("cust-type"));//type
        Select select = new Select(typeDropDown);
        select.selectByVisibleText(String.format("%s", customer.getType()));

        driver.findElement(By.id("cust-email")).sendKeys(customer.getEmail());//email
        driver.findElement(By.id("cust-phone")).sendKeys(customer.getPhone());//phone
        driver.findElement(By.id("cust-mobile")).sendKeys(customer.getCellPhone());//cellphone

        WebElement subscribedStatus = driver.findElement(By.id("subscription_status"));//sub status
        Select selectSubscribedStatus = new Select(subscribedStatus);
        selectSubscribedStatus.selectByVisibleText(String.format("%s", customer.getSubscribedToNewsletter()));

        driver.findElement(By.name("save")).click(); //save

        /*-------------Json files recording Section---------------*/
        MainDemoAssignmentTestResultJsonObject addCustomerInnerObject = new MainDemoAssignmentTestResultJsonObject();
        addCustomerInnerObject.setTestModule("Inventory Module");
        addCustomerInnerObject.setTestName("Add Customer");
        addCustomerInnerObject.setTestDate(MainDemoTestHelper.getToday());
        addCustomerInnerObject.setTestTime(MainDemoTestHelper.getCurrentTime());


        WebElement successMessage = driver.findElement( //verify
                By.xpath("//*[contains(text(),'Customer successfully added.')]"));

        if (successMessage.isDisplayed()) {
            System.out.println("Customer added Successfully");
            addCustomerInnerObject.setTestStatus(true);
        }else {
            System.out.println("Failed!");
            addCustomerInnerObject.setTestStatus(false);
        }

        /*-------------4.Delete Section---------------*/
        driver.findElement(By.id("search-placeholder")).click();//click search area on page

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.id("customer_id")).sendKeys(customer.getFirstName());
        driver.findElement(By.xpath("(//input[@class=\"go_search\"])[1]")).click();

//        System.out.println(driver.findElement(By.xpath("//td[text()=\"tester@gmail.com\"]")).getText());
//        System.out.println(customer.getEmail());
//        System.out.println(driver.findElement(By.xpath("//td[text()=\"tester@gmail.com\"]")).isDisplayed());

        MainDemoAssignmentTestResultJsonObject delCustomerInnerObject = new MainDemoAssignmentTestResultJsonObject();

        if(driver.findElement(By.xpath("//td[text()=\"tester@gmail.com\"]")).isDisplayed())
        {

            driver.findElement(By.xpath("(//i[@title=\"Delete\"])[1]")).click();
            String windowHandle = driver.getWindowHandle();
            driver.switchTo().alert().accept();

            driver.switchTo().window(windowHandle);

            /*-------------Json files recording Section---------------*/

            delCustomerInnerObject.setTestModule("Inventory Module");
            delCustomerInnerObject.setTestName("Delete Customer");
            delCustomerInnerObject.setTestDate(MainDemoTestHelper.getToday());
            delCustomerInnerObject.setTestTime(MainDemoTestHelper.getCurrentTime());


            WebElement deletedSuccessMessage = driver.findElement( //verify
                    By.xpath("//div[text()=\"Customer successfully deleted.\"]"));

            if (deletedSuccessMessage.isDisplayed()) {
                System.out.println("Customer Deleted Successfully");
                delCustomerInnerObject.setTestStatus(true);
            }else {
                System.out.println("Failed!");
                delCustomerInnerObject.setTestStatus(false);
            }
        }
        else System.out.println("Deleted Faild!");



        /*-------------5.LogOut Section---------------*/

        driver.findElement(By.cssSelector(".fa.fa-sign-out")).click();

        /*-------------Json files recording Section---------------*/
        MainDemoAssignmentTestResultJsonObject logOutInnerObject = new MainDemoAssignmentTestResultJsonObject();
        logOutInnerObject.setTestModule("LogOut");
        logOutInnerObject.setTestName("LogOut");
        logOutInnerObject.setTestDate(MainDemoTestHelper.getToday());
        logOutInnerObject.setTestTime(MainDemoTestHelper.getCurrentTime());
        logOutInnerObject.setTestStatus(true);



        /*-------------Json files writing to file Section---------------*/

        testResultJsonObjects.add(loginInnerObject);
        testResultJsonObjects.add(addCustomerInnerObject);
        testResultJsonObjects.add(delCustomerInnerObject);
        testResultJsonObjects.add(logOutInnerObject);

        testResult.setTestEndTime(MainDemoTestHelper.getToday() + " " + MainDemoTestHelper.getCurrentTime());
        testResult.setTestResultJsonObjectList(testResultJsonObjects);

        try {
            objectMapper.writeValue(new File("jsonfile//MainDemo-test-result.json"),testResult);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.close();
        driver.quit();
    }
}

