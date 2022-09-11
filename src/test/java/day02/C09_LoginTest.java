package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_LoginTest {
     /*
    Classwork : LoginTest
1. Bir class oluşturun: LoginTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a. http://a.testaddressbook.com adresine gidiniz.
b. Sign in butonuna basin
c. email textbox,password textbox, and signin button elementlerini locate
d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
i. Username :
testtechproed@gmail.com
ii. Password : Test1234!
e. Expected user id nin
testtechproed@gmail.com oldugunu dogrulayin(verify).
f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
3. Sayfada kac tane link oldugunu bulun.
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        WebElement signButton=driver.findElement(By.id("sign-in"));
        signButton.click();

        //c. email textbox(id="session_email"),password textbox(id="session_password"),
        // and signin button(class="btn btn-primary") elementlerini locate

        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        WebElement signInButton=driver.findElement(By.className("btn btn-primary"));

        /*
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
         */

        /*emailTextBox.sendKeys("testtechproed@gmail.com");
        emailTextBox.click();*/

        passwordTextBox.sendKeys("Test1234!");
        signButton.click();

        //e. Expected user id nin
        //testtechproed@gmail.com oldugunu dogrulayin(verify).

        String expectedUserId="testtechproed@gmail.com";
        WebElement currentUserText=driver.findElement(By.className("navbar-text"));
        if (currentUserText.equals(expectedUserId)) {
            System.out.println("Expected user id \'testtechproed@gmail.com\' Test PASSED");
        } else {
            System.out.println("Expected user id does not \'testtechproed@gmail.com\' Test FAILED");
        }

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).



    }
}
