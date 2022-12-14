package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

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

         /*
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
         */

        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");


        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");

       WebElement signInButton=driver.findElement(By.name("commit"));
       signInButton.click();

            //e. Expected user id nin
        //testtechproed@gmail.com oldugunu dogrulayin(verify).

        String expectedUserId="testtechproed@gmail.com";
        WebElement currentUserText=driver.findElement(By.className("navbar-text"));
        System.out.println(currentUserText.getText());

        if (currentUserText.getText().equals(expectedUserId)) {
            System.out.println("Expected user id \'testtechproed@gmail.com\' Test PASSED");
        } else {
            System.out.println("Expected user id does not \'testtechproed@gmail.com\' Test FAILED");
        }

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressButton=driver.findElement(By.linkText("Addresses"));
        boolean resultAdress=adressButton.isDisplayed();
        if (resultAdress==true) {
            System.out.println("\'Addresses\' text is displayed");
        } else {
            System.out.println("\'Addresses\' text is not displayed");
        }

        List<WebElement> linkNumbers=driver.findElements(By.tagName("a"));
        System.out.println("Number of links on the page : "+linkNumbers.size());



    driver.close();

    }
}
