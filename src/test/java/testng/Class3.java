package testng;

import org.testng.annotations.*;
import utils.CommonMethods;

public class Class3 extends CommonMethods {


    @Test
    public void myTest(){
        System.out.println("This is my actual test");
    }

    @Test
    public void secondTest(){
        System.out.println("This is my second test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }
}
