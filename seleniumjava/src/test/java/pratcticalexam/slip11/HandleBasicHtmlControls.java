package pratcticalexam.slip11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleBasicHtmlControls {
	
	@Test
    public  void handleBasicHtmlControls() throws Exception {
        // Set the path to the Chrome driver

        // Create a new WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Get the URL
        String url = "https://www.hyrtutorials.com/p/basic-controls.html";
        driver.get(url);

        // Handle radio buttons
        WebElement femaleRadioButton = driver.findElement(By.id("femalerb"));
        femaleRadioButton.click();
        Thread.sleep(3000);

        // Handle checkboxes
        WebElement englishCheckbox = driver.findElement(By.id("englishchbx"));
        englishCheckbox.click();
        Thread.sleep(3000);

        WebElement hindiCheckbox = driver.findElement(By.id("hindichbx"));
        hindiCheckbox.click(); // check
        Thread.sleep(3000);

        if (hindiCheckbox.isSelected()) {
            hindiCheckbox.click(); // uncheck
        }
        Thread.sleep(3000);

        // Handle buttons
        WebElement registerButton = driver.findElement(By.id("registerbtn"));
        registerButton.click();
        Thread.sleep(3000);

        // Handle links
        WebElement link = driver.findElement(By.linkText("Click here to navigate to the home page"));
        link.click();
        Thread.sleep(3000);

        // Close the browser
        driver.quit();
    }
}
