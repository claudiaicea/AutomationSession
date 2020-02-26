package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Auth {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/cicea/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/basic_auth");
        Thread.sleep(2000);
        // Switching to Alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(2000);
        driver.quit();
    }

}
