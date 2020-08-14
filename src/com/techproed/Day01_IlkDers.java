package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        /*
        java projemize chromedriver'i tanittik
         */
       System.setProperty("webdriver.chrome.driver",
               "/Users/mstf/Documents/selenium libraries/drivers/chromedriver");
        //selenium ile ilgili ilk kodumuz

       WebDriver webDriver=new ChromeDriver();


        webDriver.get("http://www.google.com");

         webDriver.close();
         //webDriver.quit();

    }

}
