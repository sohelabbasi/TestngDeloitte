package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonMethods {

   public static WebDriver driver;

   @BeforeMethod(alwaysRun = true)
    public static void openBrowserAndLaunchApplication(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }

   @AfterMethod(alwaysRun = true)
    public static void tearDown(){
       driver.quit();
   }

}
