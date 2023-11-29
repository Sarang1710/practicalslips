package practicalexam.slip11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class countRadioButtons {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
    }

    @Test
    public void countRadioButtonsTest() {
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
        int radioButtonCount = radioButtons.size();
        System.out.println("Number of radio buttons: " + radioButtonCount);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
