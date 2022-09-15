package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class Class9 extends CommonMethods {

    @DataProvider
    public Object[][] data(){
        Object[][] loginData = new Object[4][2];
        loginData[0][0] = "admin";
        loginData[0][1] = "Hum@nhrm123";
        loginData[1][0] = "admin";
        loginData[1][1] = "Hum@nhrm123";
        loginData[2][0] = "admin";
        loginData[2][1] = "Hum@nhrm123";
        loginData[3][0] = "admin";
        loginData[3][1] = "Hum@nhrm123";
        return loginData;
    }

    @Test(dataProvider = "data")
    public void loginScenario(String username, String password){
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        WebElement loginField = driver.findElement(By.id("btnLogin"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginField.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
