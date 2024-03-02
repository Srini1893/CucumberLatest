package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectElements {

	 public PageObjectElements(WebDriver driver) {
			PageFactory.initElements(driver, this);			
	    }
	 
	    @FindBy(id = "user-name")
	    public WebElement usernameInput;

	    @FindBy(id = "password")
	    public WebElement passwordInput;

	    @FindBy(id = "login-button")
	    public WebElement loginButton;
	    
	    
}
