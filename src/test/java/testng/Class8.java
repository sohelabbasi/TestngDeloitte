package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class Class8 extends CommonMethods {

    //soft assertion - it allows you to execute your complete code and gives you
    //consolidated report of assertions in the end
    //hard assertion - it stops execution when encounters any error in program

    @Test
    public void verifyLogin(){
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));


        SoftAssert soft = new SoftAssert();
        String actual = "Human Management Sys";
        String expected = driver.getTitle();

        //first assertion
        soft.assertEquals(actual, expected);

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

        //second assertion
        soft.assertEquals(actualUrl, expectedUrl);

        soft.assertTrue(usernameField.isDisplayed());
        soft.assertTrue(passwordField.isDisplayed());
        WebElement loginField = driver.findElement(By.id("btnLogin"));
        soft.assertTrue(loginField.isDisplayed());

        System.out.println("I am executing after all the assertions");

        //this should be the last statement of your test case
        soft.assertAll();
    }

}
