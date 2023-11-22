package pratcticalexam.slip11;

import org.openqa.selenium.By;
//Import the required packages
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTest {
 // Declare the WebDriver object
 WebDriver driver;

 // Define the URL to be tested
 String url = "https://www.saucedemo.com/";

 // Define the page title to be verified
 String pageTitle = "Swag Labs";

 // Define the logo element to be verified
 String logo = "login_logo";

 // Define the setup method to initialize the driver and launch the browser
 @BeforeTest
 public void setup() {
	 
     // Create a new instance of Chrome driver
     driver = new ChromeDriver();

     // Maximize the browser window
     driver.manage().window().maximize();

     // Navigate to the URL
     driver.get(url);
 }

 // Define the test method to verify the page title
 @Test
 public void verifyPageTitle() {
     // Get the actual page title
     String actualTitle = driver.getTitle();

     // Assert that the actual title matches the expected title
     Assert.assertEquals(actualTitle, pageTitle, "Page title does not match");
 }

 // Define the test method to verify the logo element
 @Test
 public void verifyLogo() {
     // Check if the logo element is displayed
     boolean logoDisplayed = driver.findElement(By.className(logo)).isDisplayed();

     // Assert that the logo element is displayed
     Assert.assertTrue(logoDisplayed, "Logo is not displayed");
 }

 // Define the teardown method to close the browser and quit the driver
 @AfterTest
 public void teardown() {
     // Close the browser
     driver.close();

     // Quit the driver
     driver.quit();
 }
}

