package com.techproed;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/mstf/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("http://youtube.com");
        String titleYoutube= driver.getTitle();
        if(titleYoutube.contains("Video")) {
            System.out.println("Video keleimesi var");
        }else {
            System.out.println("video kelimesi yok");
        }
        driver.quit();
    }
}
