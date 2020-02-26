package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;


public class Checkboxes {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Checkboxes.class);
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/cicea/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Opens URL
        driver.get("http://the-internet.herokuapp.com/");
        //Clicks on checkboxes exercises link
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(6) > a")).click();
        Thread.sleep(2000);
        //Finds checkbox 1 (value = null) and clicks it (value = true)
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).click();
        Thread.sleep(1000);
        //Finds checkbox 2  (value=true) and clicks it (value=null)
        driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).click();
        Thread.sleep(1000);
        //Checks if checkbox 1 is true
        Assert.assertTrue(Boolean.parseBoolean(driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).getAttribute("checked")));
        logger.info("Checkboxes test1 passed");
        //Checks if checkbox 1 is Null
        Assert.assertNull(driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)")).getAttribute("checked"));
        logger.info("Checkboxes test2 passed");
        //Closes webdriver
        driver.quit();

    }


}
