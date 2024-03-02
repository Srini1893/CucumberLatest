package config;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {

	private static WebDriver driver;
	public static String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\java\\config\\chromedriver.exe";
	public static String tmpPath = System.getProperty("user.dir") + "\\tmp";
	
	private WebDriverManager() {
		// Private constructor to prevent instantiation
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<>();
			prefs.put("download.default_directory", tmpPath);
			options.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(options);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}