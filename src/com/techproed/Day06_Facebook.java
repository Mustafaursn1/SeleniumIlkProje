package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/mstf/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS );
        driver.manage().window().maximize();//tam ekran yapar
        driver.get("https://www.facebook.com/");
        /*
        1.adim email kutusuna testtechproed@gmail.com yzdiralim
         */
        WebElement emailBox=driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]"));
       emailBox.sendKeys("testtechproed@gmail.com");
       //password kutusuna Test1234 yazdirip giris yapiniz
        WebElement passWordBoox=driver.findElement(By.id("pass"));
        passWordBoox.sendKeys("Test1234");

      passWordBoox.submit();
          //Sayfada biraz beklemek icin  bu methodu kullaniyoruz.
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String url=driver.getCurrentUrl();
        System.out.println(url);

        if(url.equals("https://www.facebook.com/login/")) {
            System.out.println("Giris basarisiz");
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
