package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com", "https://www.westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");


        for(String eachURL : urls) {
            driver.get(eachURL);
            String currentUrl = driver.getCurrentUrl();
            System.out.println("currentUrl = " + currentUrl);
            String currentTitle = driver.getTitle();
            System.out.println(currentTitle.toLowerCase().replaceAll(" ", ""));
            if(currentTitle.contains(currentUrl)) {
                System.out.println(currentUrl + " : PASS");
            } else{
                System.out.println(currentUrl + " : FAIL");
            }

        }
    }
}
