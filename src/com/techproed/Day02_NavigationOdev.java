package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    //1 - ilk once google.com'a gidiniz.
    //2 - oradan youtube.com'a gidiniz.
    //3 - google.com'a back methodu ile geri donunuz.
    //4 - youtube.com'a geri gidiniz(forward methodu ile).
    //5 - youtube.com'u yenileyiniz(refresh methodu ile).
    //6 - driver'i kapatiniz(quit ile).

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://google.com");
        webDriver.get("http://youtube.com");// .navigate().to de kullanilabilirdi.
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();

    }

}
