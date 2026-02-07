package ac.testingplace.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {
    private int count = 0;

    @Override
    public boolean retry (ITestResult iTestResult) {
        int maxTry = 1;
        if (!iTestResult.isSuccess() && count < maxTry) {
                count ++;
                iTestResult.setStatus(ITestResult.FAILURE);
                return true;
            }
        else {
            iTestResult.setStatus(ITestResult.SUCCESS);
            return false;
        }
    }
}