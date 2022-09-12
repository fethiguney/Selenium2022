package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarTest {
    /*
       1. Bir class oluşturun : AmazonSearchTest
       2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
       a. web sayfasına gidin. https://www. amazon.com/
       b. Search(ara) “city bike”
       c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
       e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike"+ Keys.ENTER);

        // Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> searcResults=driver.findElements(By.className("sg-col-inner"));
        System.out.println(searcResults.get(0).getText());

        //Sadece sonuc sayisini yazdiralim
        String sonucYazisi=searcResults.get(0).getText();
        String [] sonucSayisi=sonucYazisi.split(" ");
        System.out.println("City bike arama sonuc sayisi : "+sonucSayisi[2]);

        //Lambda kullanarak sonuc sayisini yazdiralim
        Arrays.stream(sonucYazisi.
                split(" ")).
                limit(3).
                skip(2).
                forEach(System.out :: println);

        // Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> ilkResim=driver.findElements(By.className("s-image"));
        WebElement ilkResimWebElement=ilkResim.get(0);
        ilkResimWebElement.click();

        driver.close();


    }
}
