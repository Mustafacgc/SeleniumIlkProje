package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    //driver'imizi ekrani kaplayacak sekilde kullanalim.
    //1 - Ilk once google.com'a gidelim.
    //2 - Sayfanin title'ini alalim ve ekrana yazdiralim.
    //3 - daha sonra youtube.com'a gidelim.
    //4 - sayfanin title'ini ve url'ini alalim ve ekrana yazdralim.
    //5 - google.com'a geri gidelim ve sayfanin url'ini alip ekrana yazdiralim.
    //6 - driver'imizi kapatalim.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");
        String titleGoogle = driver.getTitle();
        System.out.println(titleGoogle);

        driver.get("http://youtube.com");
        String titleYoutube = driver.getTitle();
        String urlYoutube = driver.getCurrentUrl();
        System.out.println(titleYoutube);
        System.out.println(urlYoutube);

        driver.navigate().back();
        String urlGoogle = driver.getCurrentUrl();
        System.out.println(urlGoogle);

        driver.quit();

    }


}
