package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println("Sayfanin konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin olculari : "+driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(80,60));

        driver.manage().window().setSize(new Dimension(800, 600));

        System.out.println("Sayfanin yeni konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin yeni olculari : "+driver.manage().window().getSize());

        driver.close();




    }
}
