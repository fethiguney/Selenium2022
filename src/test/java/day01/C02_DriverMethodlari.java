package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Amazon sayfasına gidin kaynak kodların içinde
        //"Gateway" kelimesinin oldugunu test edin

        driver.get("https://www.amazon.com");
        String istenenKelime="Gateway";
        if (driver.getPageSource().contains(istenenKelime)) {
            System.out.println("Kaynak kodu testi PASSED");
        } else {
            System.out.println("Kaynak kodu testi FAILED");
        }

        driver.close();
        //driver.quit birden fazla sayfa varsa hepsini kapatır

    }
}
