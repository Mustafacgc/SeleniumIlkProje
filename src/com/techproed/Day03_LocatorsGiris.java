package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Day03_LocatorsGiris {

    public static void main(String[] args) {
        // Java projemize chromedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //ilk webelementimizi buluyoruz.
        // "Mustafa" -> String
        // Web sayfasindaki tum elemanlar -> WebElement

        //webelementimizi id kullanarak bulduk.
        WebElement signInLinki = driver.findElement(By.id("sign-in"));

        //webelementimize tikladik.
        signInLinki.click();

        //email kutusunu bulalim.
        WebElement emailKutusu = driver.findElement(By.id("session_email"));

        //emailKutusu'nun icerisine yazi gonderiyoruz.
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //sifreKutusu'nu buluyoruz.
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));

        //sifreKutusu'nun icerisine yazi gonderiyoruz.
        sifreKutusu.sendKeys("Test1234!");

        //sign in butonunu buluyoruz.// name="commit"
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

        String baslik = driver.getTitle();

        if(baslik.equals("Address Book")) {
            System.out.println("Giris Basarili");
        }else {
            System.out.println("Giris basarisiz");
        }


    }

}
