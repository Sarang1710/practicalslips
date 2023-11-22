package pratcticalexam.slip5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DataProvider {

	@org.testng.annotations.DataProvider(name = "searchData")
	public Object[][] searchData(){
		Object[][] searchObjects = new Object[3][2];
		searchObjects[0][0] = "India";
		searchObjects[0][1] = "Quitab Minar";
		searchObjects[1][0] = "Agra";
		searchObjects[1][1] = "Taj Mahal";
		searchObjects[2][0] = "Hyderabad";
		searchObjects[2][1] = "Charminar";
		return searchObjects;
	}
	
	@Test(dataProvider = "searchData")
	public void googleSearch(String country,String monumnet) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchElement = driver.findElement(By.name("q"));
		searchElement.sendKeys(country+" "+ monumnet);
		driver.findElement(By.className("gNO89b")).submit();
		
		
	}
}
