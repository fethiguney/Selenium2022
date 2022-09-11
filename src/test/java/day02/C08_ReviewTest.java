package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_ReviewTest {
     /*
    Yeni bir class olusturun (TekrarTesti)
2. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın
(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
3. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
URL'yi yazdırın.
4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
5. Youtube sayfasina geri donun
6. Sayfayi yenileyin
7. Amazon sayfasina donun
8. Sayfayi tamsayfa yapin
9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
doğru başlığı(Actual Title) yazdırın.
10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
URL'yi yazdırın
11.Sayfayi kapatin
     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");

        String actualTitle=driver.getTitle();
        String expectedWord="youtube";
        if (actualTitle.contains(expectedWord)) {
            System.out.println("Title contains \'youtube\' test PASSED");
        } else {
            System.out.println("Title does not contain \'youtube\' test FAILED"+"\n"
                                +"Actual title : "+actualTitle);
        }

        //3. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        String actualURL=driver.getCurrentUrl();
        if (actualURL.contains(expectedWord)) {
            System.out.println("Url contains  \'youtube\' test PASSED");
        } else {
            System.out.println("Url does not contain \'youtube\' test FAILED"+"\n"
                    +"Actual url : "+actualURL);
        }

        Thread.sleep(2000);

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(1000);

        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(1000);

        //7. Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(1000);

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        String actualTitle2=driver.getTitle();
        String expectedWord2="Amazon";
        if (actualTitle2.contains(expectedWord2)) {
            System.out.println("Title contains \'Amazon\' test PASSED");
        } else {
            System.out.println("Title does not contain \'Amazon\' test FAILED"+"\n"
                    +"Actual Title : "+actualTitle2);
        }
        Thread.sleep(1000);
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String actualURL2= driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        if (actualURL2.equals(expectedUrl)) {
            System.out.println("Current URL equals \'https://www.amazon.com/\' test PASSED");
        } else {
            System.out.println("Current URL does not equal \'https://www.amazon.com/\' test FAILED"+"\n"
                                 +"Actual URL :"+actualURL2);
        }

        //11.Sayfayi kapatin
        driver.close();


    }
}
