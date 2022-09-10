package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodları {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.youtube.com");

        System.out.println("Pencere konumu : "+driver.manage().window().getPosition());
        //Acılan browserin konumunu verir

        System.out.println("Pencere olculeri : "+driver.manage().window().getSize());
        //Acılan browserin olculerini verir

        driver.manage().window().minimize();
        //Pencereyi simge durumuna getirir

        Thread.sleep(3000);

        driver.manage().window().maximize();

        System.out.println("Yeni pencere konumu : "+driver.manage().window().getPosition());

        System.out.println("Yeni pencere olculeri : "+driver.manage().window().getSize());

        driver.manage().window().fullscreen();

        System.out.println("Fullscreen pencere konumu : "+driver.manage().window().getPosition());

        System.out.println("Fullscreen pencere olculeri : "+driver.manage().window().getSize());




    }
}
