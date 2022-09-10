package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06 {
    /*Yeni bir package olusturalim : day01
    Yeni bir class olusturalim : C03_GetMethods
    Amazon sayfasina gidelim. https://www.amazon.com/
    Sayfa basligini(title) yazdirin
    Sayfa basliginin “Amazon” icerdigini test edin
    Sayfa adresini(url) yazdirin
    Sayfa url’inin “amazon” icerdigini test edin.
    Sayfa handle degerini yazdirin
    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin*/

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.amazon.com");


        //Sayfa basligini(title) yazdirin
        //Sayfa basliginin “Amazon” icerdigini test edin
        System.out.println("Sayfa basligi (Title) : "+driver.getTitle());
        String istenenKelime="Amazon";

        if (driver.getTitle().contains(istenenKelime)) {
            System.out.println("Title contains Amazon PASSED");
        } else {
            System.out.println("Title does not contain Amazon FAILED");
        }

        //Sayfa adresini(url) yazdirin
        // Sayfa url’inin “amazon” icerdigini test edin.
        String arananKelime="amazon";
        System.out.println("Sayfa adresi (url) : "+driver.getCurrentUrl());
        if (driver.getCurrentUrl().contains(arananKelime)) {
            System.out.println("URL contains amazon PASSED");
        } else {
            System.out.println("URL does not contain amazon FAILED");
        }

        //Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        if (driver.getPageSource().contains("Gateway")) {
            System.out.println("Page source contains Gateway PASSED");
        } else {
            System.out.println("Page source does not contains Gateway FAILED");
        }







    }


}
