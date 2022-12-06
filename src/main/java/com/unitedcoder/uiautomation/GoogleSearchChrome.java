package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchChrome {
        public static void main(String[] args) {

            //se tup a chrome driver
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.navigate().to("https://www.google.com/");
            //set browser size
            driver.manage().window().maximize();

            WebElement searchBox=driver.findElement(By.name("q"));

            searchBox.sendKeys("United Coder LLC"+ Keys.ENTER);
            WebElement resultStatusElement=driver.findElement(By.id("result-stats"));
            System.out.println("Result displayed: " + resultStatusElement.isDisplayed());
            driver.quit();
        }
    }