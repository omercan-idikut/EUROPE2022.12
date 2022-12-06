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

public class CubCartAddproductsWeek1XXXX {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");

        LoginUser user = new LoginUser("testautomation1", "automation123!");

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys(user.getUserName());

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(user.getPassword());

        WebElement logIn = driver.findElement(By.id("login"));
        logIn.click();
        Thread.sleep(1000);
        WebElement product = driver.findElement(By.linkText("Products"));// id nav_products
        product.click();


        WebElement addProduct = driver.findElement(By.xpath("//*[text()='Add Product']")); //linktext
        addProduct.click();

        ArrayList<String> productName = new ArrayList<>();
        productName.addAll(Arrays.asList("JavaBook.X", "AppleWatch.X", "Ipad.X"));
        ArrayList<String> productCode = new ArrayList<>();

        productCode.addAll(Arrays.asList("A123", "B456", "C789"));
        WebElement conditionDropDouw = driver.findElement(By.id("condition"));

        ArrayList<String> productWeight = new ArrayList<>();
        productWeight.addAll(Arrays.asList("200", "100", "100"));

        ArrayList<String> StockLevel = new ArrayList<>();
        StockLevel.addAll(Arrays.asList("888", "666", "999"));

        ArrayList<String> uppCode = new ArrayList<>();
        uppCode.addAll(Arrays.asList("0000", "1111", "2222"));


        for (int i = 0; i < productName.size(); i++) {

            driver.findElement(By.xpath("//*[text()='Add Product']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("name")).sendKeys(productName.get(i));

            Thread.sleep(2000);
            //conditon
            WebElement condition = driver.findElement(By.id("condition"));
            condition.click();
            conditionDropdown(condition, "refurbished");

            driver.findElement(By.id("product_code")).sendKeys(productCode.get(i));
            driver.findElement(By.id("product_weight")).sendKeys(productWeight.get(i));
            driver.findElement(By.id("stock_level")).sendKeys(StockLevel.get(i));
            driver.findElement(By.id("upc")).sendKeys(uppCode.get(i));

            //Google Category
            WebElement googleCategory = driver.findElement(By.xpath("//*[@id=\"google_category\"]//parent::span"));
            googleCategory.click();
            Thread.sleep(2000);
            WebElement option=driver.findElement(By.xpath("//*[@class=\"chosen-results\"]/li[5]"));
            option.click();


            WebElement sava = driver.findElement(By.xpath("//input[@value=\"Save\"]"));
            sava.click();

            WebElement message = driver.findElement(By.cssSelector("div.success"));

            if (message.isDisplayed()) {
                System.out.printf("%s Add products passed\n", productName.get(i));
            } else {
                System.out.printf("%s Products Add failed\n", productName.get(i));
            }

        }
        System.out.println("All Add products test passed");



//            WebElement logout = driver.findElement(By.linkText("Log Out"));
//
//            driver.close();
//            driver.quit();
//
    }


    public static  void conditionDropdown(WebElement webElement,String value){
        Select s=new Select(webElement);
        s.selectByValue(value);

    }
}

