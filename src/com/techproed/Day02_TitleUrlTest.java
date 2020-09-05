package com.techproed;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    //1 - youtube.com'a gidelim.
    //2 - title(sayfa basligi), video kelimesini iceriyor mu bakalim.
    //3 - driveri kapatalim.

    public static void main(String[] args) {
        //Java projemize chromedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\PC\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();

        if (youtubeTitle.contains("Video")) {
            System.out.println("Var : " + youtubeTitle);
        }else {
            System.out.println("Yok : " + youtubeTitle);
        }

        driver.quit();

    }
}
