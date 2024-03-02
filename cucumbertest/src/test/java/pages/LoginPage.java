package pages;

import org.openqa.selenium.WebDriver;
import config.ConfigReader;

public class LoginPage{

public WebDriver driver ;
public ConfigReader configReader;	
private PageObjectElements elem;
	
    public LoginPage(WebDriver driver) {
		this.driver = driver;
		configReader = new ConfigReader();
		elem = new PageObjectElements(driver);
    }
    
    public void login(){
    	driver.get(configReader.getUrl());
    	elem.usernameInput.sendKeys(configReader.getUsername());
    	elem.passwordInput.sendKeys(configReader.getPassword());
    	elem.loginButton.click();
    }
}
