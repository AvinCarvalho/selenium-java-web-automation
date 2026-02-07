package ac.testingplace.listeners;

import ac.testingplace.helpers.Log;
import ac.testingplace.reports.ExtentReportManager;
import org.testng.*;

import java.io.File;
import java.util.Arrays;

import static ac.testingplace.reports.ExtentManager.getExtentTest;

public class TestStatusListener implements ITestListener, ISuiteListener {

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Override
    public void onStart(ISuite suite) {
        Log.info(suite.getName() + " Testsuite execution is started");
        ExtentReportManager.initExtentReport();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Log.info(getTestMethodName(iTestResult) + " Testcase execution is starting.");
        ExtentReportManager.createTest(iTestResult.getMethod().getDescription());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Log.info(getTestMethodName(iTestResult) + " Testcase is Passed");
        ExtentReportManager.pass(iTestResult.getMethod().getMethodName() + " Testcase is Passed",
                Arrays.toString(iTestResult.getMethod().getGroups()));
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Log.info(getTestMethodName(iTestResult) + " Testcase is Failed");
        ExtentReportManager.fail(iTestResult.getMethod().getMethodName() + " Testcase is Failed",
                Arrays.toString(iTestResult.getMethod().getGroups()), iTestResult.getThrowable());
        try {
            getExtentTest().addScreenCaptureFromPath("screenshots" + File.separator + iTestResult.getMethod().getMethodName() + ".png");
        } catch (Exception e) {
            getExtentTest().fail((iTestResult.getThrowable()) + "ScreenCapture Failed");
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Log.info(getTestMethodName(iTestResult) + " Testcase is Skipped");
        ExtentReportManager.skip(iTestResult.getMethod().getMethodName() + " Testcase is Skipped",
                Arrays.toString(iTestResult.getMethod().getGroups()));
    }

    @Override
    public void onFinish(ISuite suite) {
        Log.info(suite.getName() + " Test suite execution is completed");
        ExtentReportManager.flushExtentReport();
    }
}