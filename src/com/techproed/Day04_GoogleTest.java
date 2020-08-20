package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/mstf/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();//tam ekran yapar
        driver.get("http://google.com");
        WebElement googleSearcBox=driver.findElement(By.name("q"));
        googleSearcBox.sendKeys("city bike");

        googleSearcBox.submit(); //enter tusuna basar
        WebElement sonucSayisi=driver.findElement(By.id("gsr"));
        System.out.println(sonucSayisi.getText());

        WebElement buyBox= driver.findElement(By.partialLinkText("Shopping"));
        buyBox.click();




    }
}
