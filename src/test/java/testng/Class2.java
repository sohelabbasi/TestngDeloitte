package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethods;

public class Class2 extends CommonMethods {


    @BeforeMethod
    public void preConditionBeforeMethod(){
        System.out.println("I am before method");
    }

    @AfterMethod
    public void postConditionAfterMethod(){
        System.out.println("I am after method");
    }

    @Test
    public void myFirstTest(){
        System.out.println("Here we are checking pre and post condition");
    }

    @Test
    public void mySecondTest(){
        System.out.println("This is my second test");
    }
}
