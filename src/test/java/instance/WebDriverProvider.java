package instance;

import java.util.concurrent.TimeUnit;
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
        format={"pretty", "html:target/report.html"},
        features = {"classpath:MyCarCheck.feature"}
)


public class WebDriverProvider {



    WebDriver driver;

    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\SeleniumBrowsers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://test");
    }

}

