package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //define driver--chromedriver
        // System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");
        //define chrome driver object
        WebDriver chromeDriver = new ChromeDriver();
        //open amazon homepage
        //chromeDriver.get("https://www.amazon.com/");
        chromeDriver.navigate().to("https://www.amazon.com/");
        //set browser size
        chromeDriver.manage().window().maximize();
        WebElement searchBox = chromeDriver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Airpad" + Keys.ENTER);
        chromeDriver.close();
    }
}