package com.unitedcoder.week13project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class BaseClass {

    public static WebDriver driver;


    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
    }

    public static void login(String userName, String password){
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement login=driver.findElement(By.id("login"));
        login.click();
    }

    public static void implicitWait(int sec){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }

    public static void explicitWait(WebElement element, int timeOut){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void fluentWait(WebElement element){
        Wait<WebDriver> wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void sleep(int second){
        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logout(){
        WebElement logout=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logout.click();

    }
    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }

}