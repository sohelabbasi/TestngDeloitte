package testng;

import org.testng.annotations.Test;
import utils.CommonMethods;

public class Class5 extends CommonMethods {

    @Test(priority = 1, enabled = true)
    public void loginTest(){
        System.out.println("I am login test");
    }

    @Test(priority = 2, enabled = true)
    public void suspendedTest(){
        System.out.println("I am suspended test");
    }
}
