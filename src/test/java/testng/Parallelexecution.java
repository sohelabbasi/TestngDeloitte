package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class Parallelexecution extends CommonMethods {

    @Test(groups = "regression")
    public void loginScenario() {
        System.out.println("Method will be called from common methods class");
    }

    @Test(groups = "regression")
    public void loginScenario2() {
    }

    @Test(groups = "regression")
    public void loginScenario3() {
    }
}
