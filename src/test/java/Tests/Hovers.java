package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class Hovers {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Hovers.class);
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/cicea/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Opens URL
        driver.get("http://the-internet.herokuapp.com/");
        //Clicks on exercise link
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(25) > a")).click();
        //Creates a builder object to use Actions (moveToElement)
        Actions builder = new Actions(driver);
        Thread.sleep(2000);


        //Hover element 1
        WebElement element1 = driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > img"));
        builder.moveToElement(element1).perform();
        //Clicks on link 1
        driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > div > a")).click();
        //Gets new url
        String url1 = driver.getCurrentUrl();
        //Compares Urls
        Assert.assertEquals(url1, "http://the-internet.herokuapp.com/users/1");
        logger.info("Test 1 passed");
        //Back to the main hover exercises page
        driver.navigate().back();

        //Hover element 2
        WebElement element2 = driver.findElement(By.cssSelector("#content > div > div:nth-child(4) > img"));
        builder.moveToElement(element2).perform();
        //Clicks on link 2
        driver.findElement(By.cssSelector("#content > div > div:nth-child(4) > div > a")).click();
        //Gets new url
        String url2 = driver.getCurrentUrl();
        //Compares urls
        Assert.assertEquals(url2, "http://the-internet.herokuapp.com/users/2");
        logger.info("Test 2 passed");
        //Back to the main hover exercises page
        driver.navigate().back();

        //Hover element 3
        WebElement element3 = driver.findElement(By.cssSelector("#content > div > div:nth-child(5) > img"));
        builder.moveToElement(element3).perform();
        //Clicks on link 3
        driver.findElement(By.cssSelector("#content > div > div:nth-child(5) > div > a")).click();
        //Gets new url
        String url3 = driver.getCurrentUrl();
        //Compare urls
        Assert.assertEquals(url3, "http://the-internet.herokuapp.com/users/3");
        logger.info("Test 3 passed");

        //Closes webdriver
        driver.quit();

    }


}
