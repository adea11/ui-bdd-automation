package src.test.instance;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class PreRequisite {
    WebDriver driver;


    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/ade.ajayi/Downloads/chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.get("http://the-internet.herokuapp.com/forgot_password");
    }
}
