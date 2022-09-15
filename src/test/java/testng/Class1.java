
package testng;

import org.testng.annotations.Test;
import utils.CommonMethods;

public class Class1 extends CommonMethods {

    @Test
    public void cmyFirstTest(){
        System.out.println("This is my first test");
    }

    @Test
    public void bsecondTest(){
        System.out.println("My second test case");
    }

    @Test
    public void anotherTest(){
        System.out.println("My another test");
    }


    @Test
    public void dmyFirstTest(){
        System.out.println("This is my first test");
    }

}
