package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Homework {
    /*
    1.Yeni bir class olusturalim (Homework)
2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
yazdirin.
4.https://www.walmart.com/ sayfasina gidin.
5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
6. Tekrar "facebook" sayfasina donun
7. Sayfayi yenileyin
8. Sayfayi tam sayfa (maximize) yapin
9.Browser'i kapatin
     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.ChromeDriver kullanarak, facebook sayfasina gidin
        driver.get("https://tr-tr.facebook.com");

        Thread.sleep(2000);

        //sayfa basliginin (title) "facebook" oldugunu dogrulayin (verify)
        String actualTitle=driver.getTitle();
        String expectedWord="facebook";
        if (actualTitle.contains(expectedWord)) {
            System.out.println("Title test PASSED");
        } else {
            System.out.println("Actual title : \'"+actualTitle+"\' Title test FAILED");
        }
        //3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin,
        // icermiyorsa "actual" URL'i yazdirin.
        String actualUrl=driver.getCurrentUrl();
        String expectedWord2="facebook";
        if(actualUrl.contains(expectedWord2)) {
            System.out.println("URL test PASSED");
        } else {
            System.out.println("Current URL : "+actualUrl+"\n"+"URL test FAILED");
        }


        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String actualTitle2= driver.getTitle();
        String expectedWord3="Walmart.com";
        if (actualTitle2.contains(expectedWord3)){
            System.out.println("Walmart Title contains \'Walmart.com\' test PASSED");
        } else {
            System.out.println("Walmart Title does not contains \'Walmart.com\' test FAILED");
        }
        Thread.sleep(2000);

        //6. Tekrar "facebook" sayfasina donun
        driver.navigate().back();
        Thread.sleep(2000);

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //Browseri kapatin
        driver.close();


    }




}
