package pratcticalexam.pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class SauceDemoLoginWithPageFactory {
	
	@Test
    public  void pageFactory() {
        // Set the path to the Chrome driver

        // Create a new WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Get the URL
        String url = "https://www.saucedemo.com/";
        driver.get(url);

        // Initialize Page Factory elements
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        // Login to SauceDemo
        loginPage.login("standard_user", "secret_sauce");

        // Verify successful login
        ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
        if (productsPage.isProductsPageDisplayed()) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        // Close the browser
        driver.quit();
    }
}
