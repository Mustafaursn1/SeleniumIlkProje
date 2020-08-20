package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsGiris {
    public static void main(String[] args) {
        //javaya driverimizi tanittik
        System.setProperty("webdriver.chrome.driver",
                "/Users/mstf/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS );
        driver.manage().window().maximize();//tam ekran yapar
        driver.get("http://a.testaddressbook.com/");

        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();

//class'kullanarak email kutsunu buluyoru
         WebElement emailKutusu=driver.findElement(By.className("form-control"));
         emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu=driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");

        WebElement girisButonu=driver.findElement(By.name("commit"));
        girisButonu.click();

    }
}
