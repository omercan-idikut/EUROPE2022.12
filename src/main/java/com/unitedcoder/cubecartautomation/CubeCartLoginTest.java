package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartLoginTest {
    public static void main(String[] args) throws InterruptedException {

        LoginUser loginUser=new LoginUser();
        String[] credentials={"testautomation1","automation123!"};
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.setHeadless(true);
        ChromeDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        WebElement userNameField=driver.findElement(By.id("username"));
        loginUser.setUserName(credentials[0]);
        userNameField.sendKeys(loginUser.getUserName());
        WebElement paswordFiled=driver.findElement(By.id("password"));
        loginUser.setPassword(credentials[1]);
        paswordFiled.sendKeys(loginUser.getPassword());
//        WebElement loginButton=driver.findElement(By.id("login"));
//        loginButton.click();
        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);
        WebElement logoutLink=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        WebElement dashBoard=driver.findElement(By.xpath("//*[@id=\"dashboard\"]/h3"));
        if(logoutLink.isDisplayed()){
            System.out.println("Login Test Passed");
        }
        if(dashBoard.getText().equalsIgnoreCase("dashboarb")){
            System.out.println("Login Test Passed!!");
        }
        else {
            System.out.println("Login Test Failed bcs of Dashboard logo");

        }
        driver.close();//close current driver/browser
        driver.quit();//close all driver instances

    }
}
