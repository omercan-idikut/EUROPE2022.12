package com.unitedcoder.uiautomation;

import com.google.common.base.Stopwatch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWebSiteTest {
    public static void main(String[] args) throws InterruptedException {
        Map<String, String> websites = new HashMap<>();
        websites.put("Google", "https://www.google.com");
        websites.put("YouTube", "https://www.youtube.com");
        websites.put("Amazon", "https://www.amazon.com");
        WebDriverManager.chromiumdriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(options);
        Set<String> keys = websites.keySet();
        for (String k : keys) {
            StopWatch watch = new StopWatch();
            watch.start();
            driver.get(websites.get(k));
            if (driver.getTitle().contains(k)) {
                System.out.println(k + "Opened Succesfully,Test Pass");
                watch.stop();
                System.out.println(k + "Opened within" + watch.getTime(TimeUnit.MILLISECONDS));
            }
        }
        driver.close();
        driver.quit();
    }
}