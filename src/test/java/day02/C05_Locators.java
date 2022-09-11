package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

        //Amazonda Nutella aratın

        //id kullanarak
        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Nutella"+Keys.ENTER);



        //name kullanarak
      /* WebElement searchBox=driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("Nutella"+ Keys.ENTER);*/

        //link text kullanımı
      // driver.findElement(By.linkText("Become an Affiliate")).click();

        driver.close();



    }
}
