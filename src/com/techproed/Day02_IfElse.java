package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        //javaya driverimizi tanittik
        System.setProperty("webdriver.chrome.driver",
                "/Users/mstf/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        String amozonTitle=driver.getTitle();//car
        //contain methodu, bir yazinin icerisinde bir kelime grubunun gecip gecmedigini kont.eder
        if(amozonTitle.contains("Books")) {
            System.out.println("baslikta books kelimesi var");
        }else {
            System.out.println("books kelimesini icermiyor");
        }

        driver.quit();
    }
}
