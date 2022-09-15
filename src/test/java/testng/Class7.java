package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class Class7 extends CommonMethods {

    @Test
    public void verifyLoginFields(){
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        WebElement loginField = driver.findElement(By.id("btnLogin"));
        //hard assertion
        Assert.assertTrue(usernameField.isDisplayed());
        Assert.assertTrue(passwordField.isDisplayed());
        Assert.assertTrue(loginField.isDisplayed());
        String actual = "Human Management System";
        String expected = driver.getTitle();
        Assert.assertEquals(actual, expected);
    }
}
