package src.test.instance;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;



@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty",
                "html:target/report.html",
                "html:target/cucumber-html-report",
                },
        features = "src/test/resources/features/"
)


public class runTest {

}

