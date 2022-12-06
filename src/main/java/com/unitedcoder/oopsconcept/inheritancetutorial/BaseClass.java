package com.unitedcoder.oopsconcept.inheritancetutorial;

import com.unitedcoder.exceltutorial.UiUtility;
import com.unitedcoder.homeworkweek13.ConfigLoginClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseClass {
     protected static WebDriver driver;
     static UiUtility uiUtility;
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(options);
        //uiUtility=new UiUtility(driver);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
    }
    public static void implicitWait(int second){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
    }
    //public static void explicitWait(WebElement element,int timeOut){
      //  WebDriverWait wait=new WebDriverWait(driver,timeOut);
        //wait.until(ExpectedConditions.visibilityOf(element));
    //}
    public static void logIn(String userName,String password){
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement paswordFiled=driver.findElement(By.id("password"));
        paswordFiled.sendKeys(password);
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
        //uiUtility.takeScreenShot(userName+".jpg");
    }
    public static void loginWithConfig(){
        String configFile="config.properties";
        String url= ConfigLoginClass.readFromConfigProperties(configFile,"qaUrl");
        String userName=ConfigLoginClass.readFromConfigProperties(configFile,"userName");
        String password=ConfigLoginClass.readFromConfigProperties(configFile,"password");
        driver.get(url);
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement login=driver.findElement(By.id("login"));
        login.click();

    }

    public static void sleep(int second){
        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void logOut(){
        WebElement logOutLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logOutLink.click();
    }
    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }

    }

