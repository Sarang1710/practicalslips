package practicalexam.slip18;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	@Test
	public void download_test() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String,Object>();
		String filePath = System.getProperty("user.dir");
		chromePrefs.put("profile.default_content_settings.popups",0);
		chromePrefs.put("download.default_directory", filePath);
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.linkText("ZIP file")).click();
		Thread.sleep(100);
		driver.close();
		File file = new File("DownloadDemo-master.zip");
		if(file.exists()) System.out.println("File Downloaded");
		else System.out.println("File not downloaded");
	}
}
