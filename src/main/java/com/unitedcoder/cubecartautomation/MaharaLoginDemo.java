package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaharaLoginDemo {
    public static void main(String[] args) {
        LoginUser loginUser=new LoginUser();
        String[] credentials={"student", "MaharaDemo"};
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://demo.mahara.org");
        WebElement userNameField=driver.findElement(By.id("login_login_username"));
        loginUser.setUserName(credentials[0]);
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordField=driver.findElement(By.id("login_login_password"));
        loginUser.setPassword(credentials[1]);
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton=driver.findElement(By.id("login_submit"));
        loginButton.click();

        WebElement accountmenu=driver.findElement(By.cssSelector(".collapsed:nth-child(2)"));
        accountmenu.click();

        WebElement logoutButton=driver.findElement(By.cssSelector(".icon-sign-out-alt"));
        if(logoutButton.isDisplayed()){
            System.out.println("Login Test Passed");
        }
        else {
            System.out.println("Login Failed");
        }
    }
}
