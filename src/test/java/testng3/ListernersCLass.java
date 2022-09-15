package testng3;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernersCLass implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Starting the execution with: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Printing the details of the test case: " + result.getName());
    }


    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("This test case is failed: " + result.getName());
    }


    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("This test case is skipped: " + result.getName());
    }

}
