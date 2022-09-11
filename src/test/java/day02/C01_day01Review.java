package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_day01Review {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        System.out.println("Sayfa basligi : "+driver.getTitle());
        String actualTitle=driver.getTitle();
        String expectedTitle="Amazon";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title test PASSED");
        } else {
              System.out.println("Title test FAILED");
        }

        System.out.println("Sayfa URL : "+driver.getCurrentUrl());
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="amazon";
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL test PASSED");
        } else {
            System.out.println("URL test FAILED");
        }

        System.out.println("Handle degeri : "+driver.getWindowHandle());

        String actualPageSource=driver.getPageSource();
        String expectedWordInPS="Gateway";
        if (actualPageSource.contains(expectedWordInPS)){
            System.out.println("Page Source Test PASSED");
        } else {
            System.out.println("Page Source Test FAILED");
        }

        driver.close();



    }
}
