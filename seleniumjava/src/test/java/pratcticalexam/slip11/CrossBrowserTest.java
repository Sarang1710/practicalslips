package pratcticalexam.slip11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {

    @Test
    public void testGoogleInChrome() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("Title of the page: " + driver.getTitle());
        driver.quit();
    }

    @Test
    public void testFirefoxInFirefox() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://firefox.com/");
        System.out.println("Title of the page: " + driver.getTitle());
        driver.quit();
    }
}
