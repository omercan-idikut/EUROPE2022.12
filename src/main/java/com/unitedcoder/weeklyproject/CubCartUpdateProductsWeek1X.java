package com.unitedcoder.weeklyproject;

import com.unitedcoder.cubecartautomation.LoginUser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.ArrayList;
import java.util.Arrays;

public class CubCartUpdateProductsWeek1X {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");

        LoginUser user = new LoginUser();
        user.setUserName("testautomation1");
        user.setPassword("automation123!");

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys(user.getUserName());

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(user.getPassword());

        WebElement logIn = driver.findElement(By.id("login"));
        logIn.click();
        Thread.sleep(1000);

        ArrayList<String> addProductName = new ArrayList<>();
        addProductName.addAll(Arrays.asList("JavaBook.X", "AppleWatch.X", "Ipad.X"));

        ArrayList<String> StockLevel = new ArrayList<>();
        StockLevel.addAll(Arrays.asList("A34", "Q23", "T56"));

        ArrayList<String> EANcode = new ArrayList<>();
        EANcode.addAll(Arrays.asList("A999", "B555", "C888"));

        ArrayList<String>  pricing=new ArrayList<>();
        pricing.addAll(Arrays.asList("120","250","450"));
//        for (String serach : addProductName) {
        for (int i = 0; i < addProductName.size(); i++) {
            driver.findElement(By.linkText("Products")).click();//product

            WebElement searchProducts = driver.findElement(By.cssSelector("div[id=\"tab_sidebar\"]"));
            searchProducts.click();
            Thread.sleep(3000);
            WebElement textSerach = driver.findElement(By.cssSelector("input[id=\"product\"]"));
            textSerach.sendKeys(addProductName.get(i));

            WebElement goLink = driver.findElement(By.xpath("//div[@id=\"sidebar_content\"]/div[2]/form/input[2]"));
            goLink.click();


            Thread.sleep(1000);
            WebElement Edit = driver.findElement(By.cssSelector(".fa.fa-pencil-square-o"));
            Edit.click();

            WebElement stockLever = driver.findElement(By.id("stock_level"));//add pruduct info
            stockLever.clear();
            stockLever.sendKeys(StockLevel.get(i));

            WebElement stockWarning = driver.findElement(By.xpath("//input[@id='stock_warning']"));
            stockWarning.clear();
            Thread.sleep(1000);
            stockWarning.sendKeys(EANcode.get(i));



            WebElement sava=driver.findElement(By.xpath("//input[@value=\"Save\"]"));
            sava.click();


            WebElement message = driver.findElement(By.cssSelector("div.success"));

            if (message.isDisplayed()) {
                System.out.printf("%s Update product passed\n", addProductName.get(i));
            } else {
                System.out.printf("%s Product update failed\n", addProductName.get(i));
            }
        }
        System.out.println("All products update test passed");
//
//            WebElement logout = driver.findElement(By.linkText("Log Out"));
//
////                driver.close();
////                driver.quit();

    }}
