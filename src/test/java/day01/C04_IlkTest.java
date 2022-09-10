package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        /*
        1-Amazon sayfasına gidiniz
        2-Baslıgın "Amazon "icerdigini test ediniz
        3-Url'nin amazon icerdigini test edin
        4-Sayfayı kapatın
         */

        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //Baslıgın "Amazon "icerdigini test ediniz
        if (driver.getTitle().contains("Amazon")) {
            System.out.println("Title Amazon icerir PASSED");
        } else {
            System.out.println("Title Amazon icermez FAILED");
        }
        //Url'nin amazon icerdigini test edin
        if ( driver.getCurrentUrl().contains("amazon")){
            System.out.println("URL amazon icerir PASSED");
        } else {
            System.out.println("URL amazon icermez FAILED");
        }

        driver.close();


    }
}
