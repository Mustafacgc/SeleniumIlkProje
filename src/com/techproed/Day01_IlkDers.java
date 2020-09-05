package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        // Java projemize, chomedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        //selenium ile ilgili ilk kodumuz.
        //webDriver nesnesi olusturarar, chrome driveri kullanabilir hale getirdik.
        WebDriver webDriver = new ChromeDriver();

        // driver'imiza google.com'a gitmesini soyledik.
        webDriver.get("https://www.google.com.tr/");

        //driverimizda acik olan pencereyi kapatir.
        //webDriver.close();

        //driverimi komple kapatiyor.
        //webDriver.quit();


    }
}
