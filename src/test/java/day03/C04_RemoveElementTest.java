package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_RemoveElementTest {
    /*
    https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
     2- Add Element butonuna basin
    Delete butonu’nun gorunur oldugunu test edin
    Delete tusuna basin
    “Add/Remove Elements” yazisinin gorunur oldugunu test edin
     */


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        //Xpath'i text ile almak icin ornek
        //driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        //Xpath'i text ile almak icin ornek
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteList=driver.findElement(By.xpath("//*[@class='added-manually']"));
        if (deleteList.isDisplayed()) {
            System.out.println("Delete button is displayed test PASSED");
        } else {
            System.out.println("Delet button is not displayed test FAILED");
        }
        // Delete tusuna basin
       deleteList.click();

        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement=driver.findElement(By.xpath("//h3"));
        if (addRemoveElement.isDisplayed()) {
            System.out.println("Add/Remove Elements is displayed test PASSED");
        } else {
            System.out.println("Add/Remove Elements is not displayed test FAILED");
        }

        driver.close();

          /*
    1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna 10 kez basinız
    3- 10 kez Add element butonuna basıldığını test ediniz
    4 - Delete butonuna görünmeyene kadar basınız
    5- Delete butonunun görünmediğini test ediniz
    6- Sayfayı kapatınız
     */

        /*
        1-C01_TekrarTesti isimli bir class olusturun  2- https://www.amazon.com/ adresine gidin  3- Browseri tam sayfa yapin
        Sayfayi “refresh” yapin
        Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        Gift Cards sekmesine basin
        Birthday butonuna basin
        Best Seller bolumunden ilk urunu tiklayin  9- Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin
        10-Sayfayi kapatin
         */






    }
}
