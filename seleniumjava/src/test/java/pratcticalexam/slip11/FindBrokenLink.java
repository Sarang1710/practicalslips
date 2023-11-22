package pratcticalexam.slip11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


import org.testng.annotations.Test;

public class FindBrokenLink {

	@Test
	public void findBrokenLink(){


		        // Create a new WebDriver instance
		        WebDriver driver = new ChromeDriver();

		        // Get the URL
		        String url = "http://www.deadlinkcity.com/";
		        driver.get(url);

		        // Find all links on the page
		        List<WebElement> links = driver.findElements(By.tagName("a"));

		        // Check each link for brokenness
		        for (WebElement link : links) {
		            String href = link.getAttribute("href");
		            if (href != null && !href.isEmpty()) {
		                if (!isValidURL(href)) {
		                    System.out.println("Broken link: " + href);
		                }
		            }
		        }

		        // Close the browser
		        driver.quit();
		    }

		    private static boolean isValidURL(String urlString) {
		        try {
		            URL url = new URL(urlString);
		            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		            connection.setRequestMethod("GET");
		            connection.connect();
		            int responseCode = connection.getResponseCode();
		            if (responseCode == 404) {
		                return false;
		            } else {
		                return true;
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		            return false;
		        }
		    }

	}
