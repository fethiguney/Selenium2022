package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_LoginTest {
    /*
        Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();

        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");

        driver.findElement(By.id("session_password")).sendKeys("Test1234!");

        driver.findElement(By.name("commit")).click();

        WebElement expectedUser=driver.findElement(By.className("navbar-text"));
        if (expectedUser.isDisplayed()){
            System.out.println("Expected user Test PASSED\n "
                    +"Actual text : "+expectedUser.getText());
        } else {
            System.out.println("Expected user test FAILED");
        }

        WebElement adresses=driver.findElement(By.linkText("Addresses"));
        if (adresses.isDisplayed()){
            System.out.println("Adresses test PASSED");
        } else {
            System.out.println("Adresses test FAILED");
        }

        WebElement signOut=driver.findElement(By.linkText("Sign out"));

        if (signOut.isDisplayed()) {
            System.out.println("Sign out test PASSED");
        } else {
            System.out.println("Sign out test FAILED");
        }





    }
}
