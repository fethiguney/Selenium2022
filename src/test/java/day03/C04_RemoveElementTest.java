package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_RemoveElementTest {
    /*
    https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin  2- Add Element butonuna basin
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

        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        List<WebElement> deleteList=driver.findElements(By.className("added-manually"));
        deleteList.get(0).click();



    }
}
