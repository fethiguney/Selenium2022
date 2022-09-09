import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");

        driver.navigate().to("https://techproeducation.com");

        Thread.sleep(3000);
        //Tekrar amazon sayfasına donelim
        driver.navigate().back();
        //Tekrar tecproed sayfsanı gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        //Tecproed sayfasını yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        driver.close();




    }
}
