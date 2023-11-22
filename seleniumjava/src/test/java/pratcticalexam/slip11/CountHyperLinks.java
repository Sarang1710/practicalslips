package pratcticalexam.slip11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CountHyperLinks {
	
	@Test
    public  void countHyperLink() {
        // Set the path to the Chrome driver

        // Create a new WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Get the URL
        String url = "https://www.calculator.net/";
        driver.get(url);

        // Find all hyperlinks on the page
        List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

        // Count the hyperlinks
        int hyperlinkCount = hyperlinks.size();

        // Print the hyperlink count
        System.out.println("Number of hyperlinks: " + hyperlinkCount);

        // Print each hyperlink
        for (WebElement hyperlink : hyperlinks) {
            String hyperlinkText = hyperlink.getText();
            String hyperlinkURL = hyperlink.getAttribute("href");
            System.out.println("Hyperlink: " + hyperlinkText + " (" + hyperlinkURL + ")");
        }

        // Close the browser
        driver.quit();
    }
}
