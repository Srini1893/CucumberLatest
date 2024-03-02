package step_defenitions.tests;

import org.openqa.selenium.WebDriver;

import config.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {

	public WebDriver driver ;
	
	@Before
    public void setup() {
		driver   = WebDriverManager.getDriver();
    }

    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() {
        driver.get("https://www.google.com");
        
       
    }

    @When("^I enter my username and password$")
    public void i_enter_my_username_and_password() {
        // Implementation to enter username and password
        System.out.println("Entering username and password");
    }

    @When("^I click the login button$")
    public void i_click_the_login_button() {
        // Implementation to click the login button
        System.out.println("Clicking the login button");
    }

    @Then("^I should be logged into the system$")
    public void i_should_be_logged_into_the_system() {
        // Implementation to verify successful login
        System.out.println("Successfully logged into the system");
    }
    
    @After
    public void teardown() {
        WebDriverManager.quitDriver();
    }
}
