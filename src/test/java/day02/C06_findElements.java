package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C06_findElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //Amazon sayfasındaki tag lari link(a) olanların sayisini yazdirin
        List<WebElement> tag=driver.findElements(By.tagName("a"));
        System.out.println("Amazon sayfasindaki a tag sayisi : "+tag.size());









    }
}
