package practicalexam.slip13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyWebPageElements {
	
	@Test
    public  void verifyWebPageElements() {
        // Set the path to the Chrome driver

        // Create a new WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Get the URL
        String url = "https://testautomationpractice.blogspot.com/";
        driver.get(url);

        // Verify title of the webpage
        String expectedTitle = "Automation Testing Practice";//Automation Testing Practice
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Page title is correct: " + expectedTitle);
        } else {
            System.out.println("Page title is incorrect: " + actualTitle);
        }

        // Verify the presence of the Wikipedia icon on the webpage
        WebElement wikipediaIcon = driver.findElement(By.className("wikipedia-icon"));//*[@id="Wikipedia1_wikipedia-search-form"]/div/span[1]/a/img
        if (wikipediaIcon.isDisplayed()) {
            System.out.println("Wikipedia icon is displayed");
        } else {
            System.out.println("Wikipedia icon is not displayed");
        }

        // Verify the presence of the Wikipedia search button on the webpage
        WebElement wikipediaSearchButton = driver.findElement(By.className("wikipedia-search-button"));
        if (wikipediaSearchButton.isDisplayed()) {
            System.out.println("Wikipedia search button is displayed");
        } else {
            System.out.println("Wikipedia search button is not displayed");
        }

        // Close the browser
        driver.quit();
    }
}
