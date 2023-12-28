package StepDefination;

import Login.TestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.sql.DriverManager;

public class Steps {

    @Before
    public void setUp() {
        // Set up your WebDriver and navigate to the base URL
        WebDriver driver = TestSetup.getDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @After
    public void tearDown() {
        // Close the WebDriver after the test
        TestSetup.tearDown();
    }
    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The user on login page");
    }
    @When("the users enter valid credential")
    public void the_users_enter_valid_credential() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Entered username and password");
    }
    @When("hits submit")
    public void hits_submit() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click on submit button");
    }
    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should logged in");
    }
}
