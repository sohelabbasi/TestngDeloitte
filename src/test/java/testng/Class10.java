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

public class Class10 extends CommonMethods {
    @Test
    public void verifyLoginFields() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement usernameField = driver.findElement(By.id("txtUsername"));

        //hard assertion
        Assert.assertTrue(usernameField.isDisplayed());
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        WebElement loginField = driver.findElement(By.id("btnLogin"));
    }
}
