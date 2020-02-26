package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class JsAlerts {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(JsAlerts.class);
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/cicea/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();
        String msg = "";

        //Go to URL
        driver.get("http://the-internet.herokuapp.com/");
        //Clicks on exercise link
        driver.findElement(By.cssSelector("#content > ul > li:nth-child(29) > a")).click();

        //Clicks on button 1
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
        Thread.sleep(2000);
        //New alert object
        Alert alert = driver.switchTo().alert();
        //Clicks on Alert OK button
        alert.accept();
        //Gets result msg
        msg=driver.findElement(By.cssSelector("#result")).getText();
        //Compares msgs
        Assert.assertEquals(msg,"You successfuly clicked an alert");
        logger.info("Test 1 passed");

        //Clicks on button 2
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
        Thread.sleep(2000);
        //Clicks on alert Cancel button
        alert.dismiss();
        //Gets result msg
        msg=driver.findElement(By.cssSelector("#result")).getText();
        //Compares msgs
        Assert.assertEquals(msg,"You clicked: Cancel");
        logger.info("Test 2 passed");

        //Clicks on button 2
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
        Thread.sleep(2000);
        //Clicks on alert OK button
        alert.accept();
        //Gets result msg
        msg=driver.findElement(By.cssSelector("#result")).getText();
        //Compares msgs
        Assert.assertEquals(msg,"You clicked: Ok");
        logger.info("Test 3 passed");

        //Clicks on button 3
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
        Thread.sleep(2000);
        //Clicks on alert Cancel button
        alert.dismiss();
        //Gets result msg
        msg=driver.findElement(By.cssSelector("#result")).getText();
        //Compares msgs
        Assert.assertEquals(msg,"You entered: null");
        logger.info("Test 4 passed");

        //Clicks on button 3
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
        Thread.sleep(2000);
        //Sends string
        alert.sendKeys("Hello world!");
        //Clicks on alert OK button
        alert.accept();
        //Gets result msg
        msg=driver.findElement(By.cssSelector("#result")).getText();
        //Compares msgs
        Assert.assertEquals(msg,"You entered: Hello world!");
        logger.info("Test 5 passed");

        Thread.sleep(2000);
        driver.quit();
    }


}
