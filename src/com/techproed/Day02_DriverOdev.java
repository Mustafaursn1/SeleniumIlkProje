package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {
        /*
        1.google.com'a gidelim
        2.sayfanin title'ni alalim ve ekrana yazdiralim
        3.daha sonra youtube.com'a gidelim
        4.sayfanin title'ni  ve url'sini alalim ekrana yazdiralim
        5.google.com'a geri gelelim ve sayfanin url'sini alip ekrana yazdiralim
        6.driver'imizi kapatalim

         */

        System.setProperty("webdriver.chrome.driver","/Users/mstf/Documents/selenium libraries/" +
                "drivers.chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");

        String titleGoogle=driver.getTitle();
        System.out.println(titleGoogle);

        driver.navigate().to("http://youtube.com");
        String titleYoutube=driver.getTitle();
        System.out.println(titleYoutube);
        String urlYoutube = driver.getCurrentUrl();
        System.out.println(titleYoutube);
        System.out.println(urlYoutube);
// 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
        driver.navigate().back();
        String urlGoogle = driver.getCurrentUrl();
        System.out.println(urlGoogle);
// 6 - driver'ımızı kapatalım.
        driver.quit();


    }
}
