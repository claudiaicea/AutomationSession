package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class Inputs {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Inputs.class);
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/cicea/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Opens URL
        driver.get("http://the-internet.herokuapp.com/");
        //Clicks on exercise link
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(27) > a")).click();
        //Finds textbox and sends string
        driver.findElement(By.cssSelector("#content > div > div > div > input[type=number]")).sendKeys("asdfg");
        //Checks if textbox accepted string value
        Assert.assertEquals(driver.findElement(By.cssSelector("#content > div > div > div > input[type=number]")).getAttribute("value"), "");
        logger.info("Test 1 passed");
        //Send numeric value
        driver.findElement(By.cssSelector("#content > div > div > div > input[type=number]")).sendKeys("1234");
        //Checks if the textbox accepted a numeric value
        Assert.assertEquals(driver.findElement(By.cssSelector("#content > div > div > div > input[type=number]")).getAttribute("value"), "1234");
        logger.info("Test 2 passed");
        Thread.sleep(2000);
        driver.quit();
    }
}
