package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_FindElements {
    public static void main(String[] args) {

        //javaya driverimizi tanittik
        System.setProperty("webdriver.chrome.driver",
                "/Users/mstf/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();//tam ekran yapar
        driver.get("http://a.testaddressbook.com/");

        //a tagName sahip tüm elementleri bulalim

        List<WebElement> listem=driver.findElements(By.tagName("a"));
        //System.out.println(listem); xeklinde hata verir cünkü elemanlar Strng degil !!!!
        // (aslinda problem olmamali üzerine düsün)

        for (WebElement w:listem )  {

            System.out.println(w.getText());
        }






    }


}
