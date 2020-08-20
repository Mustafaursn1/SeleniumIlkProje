import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class
Day03_LocatorsGiris {

    public static void main(String[] args) {
        //javaya driverimizi tanittik
        System.setProperty("webdriver.chrome.driver",
                "/Users/mstf/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS );

        driver.manage().window().maximize();

//<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
driver.get("http://a.testaddressbook.com");

//ILK WEBElemetimizi bukuyoruz
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();

        //email kutusunu bulalım.
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        //sifre kutusunun icine yazi gönderiyoruz
        WebElement sifreKutusu = driver.findElement(By.id("session_password" ));
        sifreKutusu.sendKeys("Test1234!");
       // signInLink ini buluyoruz
        WebElement girisButonu=driver.findElement(By.name("commit"));
        girisButonu.click();
      String baslik= driver.getTitle();
 if(baslik.equals("Address Book")) {
     System.out.println("giris basarili");


 }else{
     System.out.println("basarisiz giris");
 }

    }
}