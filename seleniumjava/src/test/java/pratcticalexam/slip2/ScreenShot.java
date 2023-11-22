package pratcticalexam.slip2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	@Test
	public void captureScreenShot() throws IOException {
		WebDriver driver;
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get("https://garwarecollege.mespune.in");
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\sagar\\eclipse-workspace\\pratcticalexam\\Pictures\\ss.png");
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
	}
}
