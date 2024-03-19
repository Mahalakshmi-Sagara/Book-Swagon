package Listener;

import com.aventstack.extentreports.ExtentTest;
import com.bs.qa.base.TestBase;
import com.bs.qa.util.TestUtil;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners  extends TestBase implements ITestListener{
    TestUtil testUtil;

    public void onStart(ITestContext iTestContext) {
        System.out.println("Test Suite Started: " + iTestContext.getName());
    }


    public void onFinish(ITestContext iTestContext) {
        System.out.println("Test Suite Finished: " + iTestContext.getName());
    }


    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test Method Started: " + iTestResult.getName());
        extent.attachReporter(spark);
    }


    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test Method Passed: " + iTestResult.getName());
        ExtentTest extentTest = extent.createTest(iTestResult.getName());
        extentTest.pass("My Test is Success");
        extent.flush();
    }


    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test Method Failed: " + iTestResult.getName());
       testUtil= new TestUtil();
       String ft = iTestResult.getName();
        try {
            testUtil.failedTest(ft);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ExtentTest extentTest = extent.createTest(iTestResult.getName());
        extentTest.fail("My Test is Fail");
        extent.flush();
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test Method Skipped: " + iTestResult.getName());
        ExtentTest extentTest = extent.createTest(iTestResult.getName());
        extentTest.skip("My Test is Skipped");
        extent.flush();
    }

}
