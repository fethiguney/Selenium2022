package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethodlari {

    /*
    Amazon sayfasina gidiniz
    Arama kutusunu locate ediniz
    Arama kutusunun tagName'nin input oldugunu test edin
    Arama kutusunun name attribute'nun degerinin "field-keywords" oldugunu test edin
    sayfayi kapatin
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //  Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");

        // Arama kutusunu locate ediniz
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

        //Arama kutusunun tagName'nin input oldugunu test edin
        String expectedTagName="input";
        String actualTagName=searchBox.getTagName();
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("Tag name test PASSED");
        } else {
            System.out.println("Tag name test FAILED");
        }

        //Arama kutusunun name attribute'nun degerinin "field-keywords" oldugunu test edin
        String expectedAttribute="field-keywords";
        String actualAttribute= searchBox.getAttribute("name");
        if (actualAttribute.equals(expectedAttribute)) {
            System.out.println("Attribute test PASSED");
        } else {
            System.out.println("Attribute test FAILED");
        }


        //Arama kutusunun konumunu yazdiriniz
        System.out.println("Arama kutusunun konumu : "+searchBox.getLocation());

        driver.close();




    }


}
