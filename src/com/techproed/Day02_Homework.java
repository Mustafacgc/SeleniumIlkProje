package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://facebook.com");
        String facebookTitle = driver.getTitle();

        System.out.println(facebookTitle);
        String facebookUrl = driver.getCurrentUrl();
        if(facebookTitle.contains("Facebook")) {
            System.out.println("Dogru url");
        }else {
            System.out.println(facebookUrl);
        }
        driver.navigate().to("http://walmart.com");
        String walmartTitle = driver.getTitle();
        if(walmartTitle.contains("Walmart.com")) {
            System.out.println("Dogru Title");
        }else {
            System.out.println(walmartTitle);
        }
        driver.navigate().back();
        driver.navigate().refresh();

        driver.close();

    }
}
