package testng3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class2 {


    @BeforeMethod
    public void preConditionBeforeMethod(){
        System.out.println("I am before method");
    }

    @AfterMethod
    public void postConditionAfterMethod(){
        System.out.println("I am after method");
    }

    @Test(groups = "smoke")
    public void myFirstTest(){
        System.out.println("Here we are checking pre and post condition");
    }

    @Test(groups = "regression")
    public void mySecondTest(){
        System.out.println("This is my second test");
    }
}
