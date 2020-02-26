package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LoginTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cicea/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        Assert.assertTrue(driver.findElement(By.className("success")).isDisplayed());

        driver.quit();

    }


}
