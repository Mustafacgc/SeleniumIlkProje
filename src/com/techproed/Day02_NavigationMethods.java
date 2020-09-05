package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {
        // Java projemize chomedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        //driver'in tum ekrani kaplamasini sagliyor.
        webDriver.manage().window().maximize();

        //driver'a google.com'a gitmrsini soyledik.
        webDriver.get("http://google.com");

        //get komutu ile ayni islemi yapar.
        webDriver.navigate().to("http://amazon.com");

        //navigate().back() methodu bir onceki sayfaya geri donmeye yarar.
        webDriver.navigate().back();

        //navigate().forward() methodu geri geldigimiz sayfaya gitmemizi sagliyor.
        //ornek : google -> azamazona gittik -> amazondan google'a geri geldik.
        //eger forward yaparsak amazona geri gideriz.
        webDriver.navigate().forward();

        //navigate().refresh() methodu sayfayi yenilemeye yariyor.
        webDriver.navigate().refresh();





    }
}
