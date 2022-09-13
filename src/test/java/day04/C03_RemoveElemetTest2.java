package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_RemoveElemetTest2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna 10 kez basinız
        WebElement addElementButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        int expectedClick = 10;
        for (int i = 0; i < expectedClick; i++) {
            addElementButton.click();
        }
        //10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//*[@class='added-manually']"));
        int actualClick = deleteButtons.size();
        if (actualClick == expectedClick) {
            System.out.println("Add element was clicked ten times Test PASSED");
        } else {
            System.out.println("Add element was not clicked ten times Test FAILED\n"
                    + "Gercek tiklama : " + actualClick);
        }

        // Delete butonuna görünmeyene kadar basınız
        for (int i = 0; i < expectedClick; i++) {
            deleteButtons.get(i).click();
        }

        Thread.sleep(2000);

        //Delete butonunun görünmediğini test ediniz
        WebElement delete = driver.findElement(By.id("elements"));

        if (delete.isDisplayed()) {
            System.out.println("Delete button is displayed Test FAILED");
        } else {
            System.out.println("Delete button is not displayed Test PASSED");
        }

        driver.close();

    }
}
