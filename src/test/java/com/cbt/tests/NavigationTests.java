package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver driver1 = BrowserFactory.getDriver("chrome");
        WebDriver driver1 = BrowserFactory.getDriver("firefox");
       // WebDriver driver1 = BrowserFactory.getDriver("edge");
        driver1.get("https://google.com");
        String gTitle = driver1.getTitle();
        Thread.sleep(2000);
        driver1.get("https://etsy.com");
        String eTitle = driver1.getTitle();

        Thread.sleep(2000);

        driver1.navigate().back();
        StringUtility.verifyEquals(driver1.getTitle(), gTitle);

        Thread.sleep(2000);
        driver1.navigate().forward();
        StringUtility.verifyEquals(driver1.getTitle(), eTitle);

        Thread.sleep(2000);
        driver1.quit();




    }
}
