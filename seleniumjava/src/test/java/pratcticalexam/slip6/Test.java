package pratcticalexam.slip6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	@org.testng.annotations.Test
	public void slip6test() {

        // Create a new WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Get the URL
        String url = "https://www.saucedemo.com/";
        driver.get(url);

        // Verify page title
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Page title is correct: " + expectedTitle);
        } else {
            System.out.println("Page title is incorrect: " + actualTitle);
        }

        // Verify logo
        boolean isLogoDisplayed = driver.findElement(By.className("login_logo")).isDisplayed();
        if (isLogoDisplayed) {
            System.out.println("Logo is displayed");
        } else {
            System.out.println("Logo is not displayed");
        }

        // Close the browser
        driver.quit();
	}
}
