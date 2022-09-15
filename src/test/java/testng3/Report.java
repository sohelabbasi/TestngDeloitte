package testng3;

import org.testng.annotations.Test;

public class Report{
    @Test(groups = "regression")
    public void generatingReport(){
        System.out.println("I am able to generate the report");
    }
}
