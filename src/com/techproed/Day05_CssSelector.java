package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/mstf/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS );
        driver.manage().window().maximize();//tam ekran yapar
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailBox= driver.findElement(By.cssSelector(".form-control"));
        emailBox.sendKeys("testtechproed@gmail.com");

        WebElement passWordsBox= driver.findElement(By.cssSelector("input[placeholder='Password']"));

        passWordsBox.sendKeys("Test1234!");
        passWordsBox.submit();


    }



}
