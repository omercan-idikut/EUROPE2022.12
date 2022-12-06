package com.unitedcoder.weeklyproject;

import com.unitedcoder.cubecartautomation.LoginUser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.Arrays;

public class CubCartDeletedProducts {
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

        ArrayList<String> removedList = new ArrayList<>();
        removedList.addAll(Arrays.asList("JavaBook.X", "AppleWatch.X", "Ipad.X"));


        for (int i = 0; i < removedList.size(); i++) {

            WebElement product1=driver.findElement(By.linkText("Products"));// id nav_products
            product1.click();
            WebElement searchProducts = driver.findElement(By.cssSelector("div[id=\"tab_sidebar\"]"));
            searchProducts.click();
            Thread.sleep(2000);

            WebElement textSerach = driver.findElement(By.cssSelector("input[id=\"product\"]"));
            textSerach.sendKeys(removedList.get(i));

            WebElement goLink = driver.findElement(By.xpath("//div[@id=\"sidebar_content\"]/div[2]/form/input[2]"));
            goLink.click();


            Thread.sleep(2000);
            WebElement checkBox=driver.findElement(By.xpath("//div[@class=\"custom-checkbox\"]/input"));
            checkBox.click();

            Select dropdown=new Select(driver.findElement(By.name("action")));
            dropdown.selectByVisibleText("Delete");

            WebElement sava = driver.findElement(By.xpath("//input[@value=\"Save\"]"));
            sava.click();



            WebElement succesMessage = driver.findElement(By.xpath("//div[@class=\"success\"]"));
            String message=succesMessage.getText();
            if (driver.getPageSource().contains(message)) {
                System.out.printf("%s  product Delete  passed\n", removedList.get(i));
            } else {
                System.out.printf("%s Product Delete failed\n", removedList.get(i));
            }
        }
        System.out.println("All products deleted test passed");
//
//            WebElement logout = driver.findElement(By.linkText("Log Out"));
//
////                driver.close();
////                driver.quit();

    }}

