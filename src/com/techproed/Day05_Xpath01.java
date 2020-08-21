package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        //Absolute xpath-->bu xpath cok kullanilmaz
        //Relative xpath -->kullanacagimiz xpath türü
        ///tagName[@attribute='value']; => önemli!

        //(//input[@class='form-control'])[1] ayni özellikte ve isimde bir atribüte varsa bu sekilde bulabiliriz
        // [1] ilk atribütü bulur 2. 3. etc.
        ////input[@class='form-control' and  @placeholder='Email'] ayni anda or ya da and ile 2 tane arama yapabiliriz

        //javaya driverimizi tanittik
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








    }
}
