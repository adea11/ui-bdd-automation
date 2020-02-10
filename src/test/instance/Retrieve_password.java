package src.test.instance;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Retrieve_password {
//    WebDriverProvider myDriver  = new WebDriverProvider();
    private PreRequisite preRequisite;


    @Before
    public void initiate (){
        preRequisite = new PreRequisite();
        preRequisite.openBrowser();
    }

    @After
    public void closeBrowser() {
        preRequisite.driver.quit();
    }

    @Given("^I navigate to url home page$")
    public void i_navigate_to_url_home_page() {
        preRequisite.driver.get("http://the-internet.herokuapp.com/forgot_password");
    }

    @When("^I input an invalid password$")
    public void i_input_an_invalid_password() {
        preRequisite.driver.findElement(By.id("email")).sendKeys("test@test.test");
    }

    @When("^I click Retrieve Password button$")
    public void i_click_Retrive_Password_button() {
      preRequisite.driver.findElement(By.id("form_submit")).click();
    }

    @Then("^Retrieval email should be sent$")
    public void retrieval_email_should_be_sent() throws Throwable {
        String retrievalEmail = preRequisite.driver.findElement(By.xpath("//*[@id=\'content\']")).getText();
        Assert.assertTrue(retrievalEmail.contains("Your e-mail's been sent!"));
        Thread.sleep(2000);
    }
}
