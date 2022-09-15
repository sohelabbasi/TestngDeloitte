package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class Class6 extends CommonMethods {

    @Test(groups = "regression")
    public void loginScenario(){
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        WebElement loginField = driver.findElement(By.id("btnLogin"));
        usernameField.sendKeys("admin");
        passwordField.sendKeys("Hum@nhrm123");
        loginField.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test(groups = "regression")
    public void loginScenario2(){
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        WebElement loginField = driver.findElement(By.id("btnLogin"));
        usernameField.sendKeys("admin");
        passwordField.sendKeys("Hum@nhrm123");
        loginField.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test(groups = "regression")
    public void loginScenario3(){
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        WebElement loginField = driver.findElement(By.id("btnLogin"));
        usernameField.sendKeys("admin");
        passwordField.sendKeys("Hum@nhrm123");
        loginField.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test(groups = "regression")
    public void loginScenario4(){
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        WebElement loginField = driver.findElement(By.id("btnLogin"));
        usernameField.sendKeys("admin");
        passwordField.sendKeys("Hum@nhrm123");
        loginField.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test(groups = "regression")
    public void loginScenario5(){
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        WebElement loginField = driver.findElement(By.id("btnLogin"));
        usernameField.sendKeys("admin");
        passwordField.sendKeys("Hum@nhrm123");
        loginField.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test( groups = "regression", enabled = false)
    public void verifyDashboard(){
        WebElement welcomeText = driver.findElement(By.cssSelector("a#welcome"));
        if(welcomeText.isDisplayed()){
            System.out.println("Test case passed");
        }else{
            System.out.println("Test case failed");
        }
    }

}
