package instance;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Create_new_incident {

    private WebDriverProvider webDriverProvider;


    @Before
    public void beforeTest() {
        webDriverProvider = new WebDriverProvider();
        webDriverProvider.openBrowser();
    }


    @After
    public void afterEachTest() {
        webDriverProvider.driver.quit();
    }


    @Given("^Go to home page$")
    public void go_to_home_page() throws Throwable {
        webDriverProvider.driver.findElement(By.xpath("//*[@id=\"]")).click();
    }



    @When("^Login with username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void login_with_username_as_and_password_as(String arg1, String arg2) throws Throwable {
        webDriverProvider.driver.findElement(By.name("email")).sendKeys("a");
    }


    @When("^Verify \"([^\"]*)\" to confirm that login is successful$")
    public void verify_to_confirm_that_login_is_successful(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^Navigate 'to Create Incident' page$")
    public void navigate_to_Create_Incident_page() throws Throwable {
        webDriverProvider.driver.findElement(By.id("search_field")).sendKeys("tester");
        webDriverProvider.driver.findElement(By.cssSelector(".search-button")).click();
        Thread.sleep(5000);
    }

    @When("^Complete mandatory fields by entering \"([^\"]*)\" into Caller field and \"([^\"]*)\" into Short Description field$")
    public void complete_mandatory_fields_by_entering_into_Caller_field_and_into_Short_Description_field(String arg1, String arg2) throws Throwable {
        String package_title = webDriverProvider.driver.findElement(By.cssSelector(".package-title ")).getText();
        Assert.assertEquals("test", package_title);
    }

    @When("^Add \"([^\"]*)\" in Description field$")
    public void add_in_Description_field(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^Submit Incident$")
    public void submit_Incident() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^Confirm that incident has been successfully created with \"([^\"]*)\"$")
    public void confirm_that_incident_has_been_successfully_created_with(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^Click User menu$")
    public void click_User_menu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^Click \"([^\"]*)\" to sign out$")
    public void click_to_sign_out(String arg1) throws Throwable {
        String package_title = webDriverProvider.driver.findElement(By.cssSelector(".package-title ")).getText();
        Assert.assertEquals("test", package_title);
    }

    @Then("^Verify that user has succesfully logged out \"([^\"]*)\"$")
    public void verify_that_user_has_succesfully_logged_out(String arg1) throws Throwable {
        String package_title = webDriverProvider.driver.findElement(By.cssSelector(".package-title ")).getText();
        Assert.assertEquals("test", package_title);
    }
}
