package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void beforealgo(){
        System.setProperty("webdriver.chrome.driver", "/Users/alopez/dev/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");
    }

    @AfterMethod
    public void cerrareldriver(){
        driver.quit();
    }

}
