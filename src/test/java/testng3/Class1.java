
package testng3;

import org.testng.annotations.Test;

public class Class1 {

    @Test(groups = "smoke")
    public void cmyFirstTest(){
        System.out.println("This is my first test");
    }

    @Test(groups = "regression")
    public void bsecondTest(){
        System.out.println("My second test case");
    }

    @Test(groups = "smoke")
    public void anotherTest(){
        System.out.println("My another test");
    }


    @Test(groups = "smoke")
    public void dmyFirstTest(){
        System.out.println("This is my first test");
    }

}
