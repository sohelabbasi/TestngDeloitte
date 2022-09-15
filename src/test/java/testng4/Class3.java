package testng4;

import org.testng.annotations.*;

public class Class3 {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I am after suite");
    }

   @BeforeTest
   public void beforeTest(){
       System.out.println("I am before test");
   }

   @AfterTest
   public void afterTest(){
       System.out.println("I am after test");
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

    @Test
    public void myTest(){
        System.out.println("This is the test for check pre and post condition");
    }
}
