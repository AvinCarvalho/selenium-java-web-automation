package ac.testingplace.tests;

import ac.testingplace.helpers.DriverFactory;
import ac.testingplace.helpers.DriverManager;
import ac.testingplace.helpers.Log;
import ac.testingplace.listeners.TestStatusListener;
import ac.testingplace.pages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import javax.swing.*;
import java.io.File;
import static ac.testingplace.configs.ConfigManager.getConfig;
import static ac.testingplace.helpers.DriverManager.driver;
import static ac.testingplace.helpers.DriverManager.getDriver;
import static ac.testingplace.reports.ExtentReportManager.SCREENSHOT_PATH;
@Listeners({TestStatusListener.class})
public class BaseTest {
    @BeforeSuite
    public void beforeSuite() {
    }
    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser"})
    public void gotToTheApplication (@Optional("chrome")String browser){
        WebDriver driver = new DriverFactory().createInstance(browser);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().get(getConfig().baseUrl());
        getConfig().EmailId();
        getConfig().PasswordField();
        String EmailId = getConfig().EmailId();
        String Password = getConfig().PasswordField();
        LoginPage loginPage = new LoginPage();
        loginPage.LogIn(EmailId, Password);
    }
    @AfterMethod(alwaysRun = true)
    public void screenCaptureAndTearDown(ITestResult result)  {
//        if (ITestResult.FAILURE == result.getStatus()
//        || ITestResult.SUCCESS == result.getStatus()) {
            try {
                File screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshot, new File(SCREENSHOT_PATH + result.getName() + ".png"));
            } catch (Exception e) {
                Log.error("Exception while taking screenshot " + e.getMessage());
            }
            // DriverManager.quit();
    }
}