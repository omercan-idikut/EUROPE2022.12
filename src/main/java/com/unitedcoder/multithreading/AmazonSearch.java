package com.unitedcoder.multithreading;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonSearch extends Thread{

    private String keyWords;
    public AmazonSearch(String keyWords){

        this.keyWords = keyWords;
    }
    public void run(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions Options = new ChromeOptions();
        Options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(Options);
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(keyWords+ Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("//span[contains(text(),\""+keyWords+"\")]"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(result.isDisplayed()) {
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed!");
        }
        driver.close();

    }


}