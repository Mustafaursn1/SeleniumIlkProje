package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/mstf/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS );
        driver.manage().window().maximize();//tam ekran yapar
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailBox= driver.findElement(By.xpath("//input[@type=\"email\"]"));
        emailBox.sendKeys("testtechproed@gmail.com");

        WebElement passWordBox= driver.findElement(By.xpath("//input[@type=\"password\"]"));
        passWordBox.sendKeys("Test1234!");
        passWordBox.submit();//enter tusunun yaptigi isi yapar


        WebElement welcomeYazisi=driver.findElement(By.tagName("h1")); //!!!xpath kullaniminda atribute
        // kullanmaya gerek yok ise sadece tagName yazarak da bukabiliriz
        System.out.println(welcomeYazisi.getText());

        ////*[@type="email"] "*" tagName ne olursa olsun bulur!!!!!!ciddi bir kolaylik.
        //*[.='Sign in'] ICERDIGI YAZI "Sign in" olan tüm webelementleri bulur.
        /*   //*[contains(text(),'ign')] ---->icerisinde 'ign'olan tüm elemntleri bulur

         */




    }
}
