package config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    private static WebDriver driver;

    private WebDriverManager() {
        // Private constructor to prevent instantiation
    }

    public static WebDriver getDriver() {
        if (driver == null) {
        	
        	String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\java\\config\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            
            driver = new ChromeDriver();
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