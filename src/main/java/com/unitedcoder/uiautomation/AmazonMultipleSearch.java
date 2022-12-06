package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonMultipleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(options);

      driver.get("https://www.amazon.com/");
      driver.manage().window().maximize();
        for (String KeyWords:args) {
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(KeyWords + Keys.ENTER);
            driver.navigate().back();
        }
        driver.close();
        driver.quit();

    }
}