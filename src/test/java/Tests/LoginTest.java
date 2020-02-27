package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test(priority = 1)
    public void loginsuccess() {

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        Assert.assertTrue(driver.findElement(By.className("success")).isDisplayed());


    }

    @Test(priority = 5)
    public void loginfail(){

        driver.findElement(By.id("username")).sendKeys("panchito");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        Assert.assertFalse(driver.findElement(By.className("success")).isDisplayed());

    }

}
