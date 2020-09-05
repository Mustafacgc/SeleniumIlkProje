package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {
        //Java projemize chromedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

         driver.get("http://amazon.com");

         String amazonTitle = driver.getTitle(); // Car

        //contains methodu, bir yazinin icerisinde bir kelime grubunun gecip gecmedigini kontrol eder.
        if(amazonTitle.contains("Books")){
            System.out.println("Books kelimesi iceriyor");
        }else {
            System.out.println("Books kelimesini ICERMIYOR");
        }
        driver.quit();

        //if - else
        //for dongusu
        //foreach
        //nesne olusturma
        //methodlar

    }

}
