package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get(urls.get(0));
        String title = driver.getTitle();
        boolean isSame = true;
       for(String eachURL : urls){
           driver.get(eachURL);
           if(!title.equals(driver.getTitle())){
               isSame = false;
           }
        }
        System.out.println("isSame = " + isSame);
        driver.get(urls.get(0));
        String currentUrl = driver.getCurrentUrl();
        boolean isSame2 = true;

        for(String eachURL : urls) {
            driver.get(eachURL);
            driver.getCurrentUrl();
            if(!currentUrl.equals(driver.getCurrentUrl())){
                isSame = false;
            }
        }
        System.out.println("isSame2 = " + isSame2);

        driver.quit();
    }
}
