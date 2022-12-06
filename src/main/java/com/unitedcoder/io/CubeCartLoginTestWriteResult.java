package com.unitedcoder.io;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class CubeCartLoginTestWriteResult {
    public static void main(String[] args) throws InterruptedException {

        String username="testautomation1";
        String password="automation123!";
        WebDriverManager.chromedriver().setup();

        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        ChromeDriver driver=new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement paswordFiled=driver.findElement(By.id("password"));
        paswordFiled.sendKeys(password);
//        WebElement loginButton=driver.findElement(By.id("login"));
//        loginButton.click();
        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);
        WebElement logoutLink=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        WebElement dashBoard=driver.findElement(By.xpath("//*[@id=\"dashboard\"]/h3"));

        String testResult="";
        if(logoutLink.isDisplayed()){
            //System.out.println("Login Test Passed");
            testResult="Login Test Passed";
        }
        if(dashBoard.getText().equalsIgnoreCase("dashboard")){
            System.out.println("Login Test Passed!!");
            testResult=testResult+"\n"+" dashboard displayed";
        }
        else {
            System.out.println("Login Test Failed bcs of Dashboard logo");
            testResult="Login Test Failed";
        }
        FileUtility fileUtility=new FileUtility();
        fileUtility.writeToFile("doc","cubecart-test"+FileWriteDemo1.getCurrentDateTime()
                ,".txt",testResult);
        driver.quit();//close all driver instances

    }
}
