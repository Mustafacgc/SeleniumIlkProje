package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



public class Day05_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        //cssSelector kullanirken, class value kullaniyorsak .value
        //                          id value kullaniyorsak #value
        WebElement emailKutusu = driver.findElement(By.cssSelector("#session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //"tagName[attribute name='value']"
        WebElement sifreKutusu = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        sifreKutusu.sendKeys("Test1234!");
        sifreKutusu.submit();

        //id, name, tagName, className, LinkText, partialLinkText, xpath, cssSelector


    }
}
