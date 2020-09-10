package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        //1.Adim
        //email kutusuna techproed@gmail.com

        // <input type="text" class="inputtext _55r1 _6luy" name="email" id="email"
        // data-testid="royal_email" placeholder="Email address or phone number"
        // autofocus="1" aria-label="Email address or phone number">
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        //2.Adim
        // sifre kutusuna Test1234 yazdiralim

        //<input type="password" class="inputtext _55r1 _6luy" name="pass" id="pass"
        // data-testid="royal_pass" placeholder="Password" aria-label="Password">

        WebElement sifreKutusu = driver.findElement(By.xpath("//*[@type='password']"));
        sifreKutusu.sendKeys("Test1234");


        //3.Adim
        //login butonunu bulalim.

        //<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"
        // name="login" data-testid="royal_login_button" type="submit" id="u_0_b">Log In</button>

        //WebElement loginButonu = driver.findElement(By.cssSelector("#u_0_b"));
        WebElement loginButonu = driver.findElement(By.xpath("//button"));
        loginButonu.click();


        //Burada java 3000 milisaniye(3 saniye) bekleyecek.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        //https://www.facebook.com/login/

        String url = driver.getCurrentUrl();
        System.out.println(url);

        if(url.contains("https://www.facebook.com/login/")) {
            System.out.println("Giris Basarisiz");
        }else {
            System.out.println("Giris Basarili");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}
