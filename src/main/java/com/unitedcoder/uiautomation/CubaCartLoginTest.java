package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubaCartLoginTest {
    public static void main(String[] args) throws InterruptedException {
        String username = "testautomation1";
        String password = "automation123!";
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        WebElement userNameFiled = driver.findElement(By.id("username"));
        userNameFiled.sendKeys(username);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement logoutLink = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        WebElement dashBoard = driver.findElement(By.xpath("//*[@id=\"dashboard\"]/h3"));
        // logoutLink.click();
        //  if (logoutLink.isDisplayed()){
        //      System.out.println("Login Test Passed");
        // }
        if (dashBoard.getText().equalsIgnoreCase("customer added successfully")) {
            System.out.println("Login Test Passed");
        } else {
            System.out.println("Login Test Failed");
        }
        if (driver.getPageSource().equalsIgnoreCase("customer added successfully")) {
            System.out.println("added customer test past");
        } else {
            System.out.println("customer added failed");
        }
    }
}