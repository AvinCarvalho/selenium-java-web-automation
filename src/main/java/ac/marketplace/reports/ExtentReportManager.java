package ac.testingplace.reports;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.File;
import java.net.InetAddress;
import java.util.Objects;

import static ac.testingplace.configs.ConfigManager.getConfig;
import static ac.testingplace.helpers.DriverManager.getDriverInfo;
import static ac.testingplace.helpers.UtilityManager.getCurrentDateTime;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ExtentReportManager {

    private static ExtentReports extentReports;
    private static final String EXTENT_REPORT_PATH =
            System.getProperty("user.dir") + File.separator + "test_reports_web";
    public static final String SCREENSHOT_PATH = EXTENT_REPORT_PATH + File.separator + "screenshots" + File.separator;

    private static final ExtentSparkReporter sparkReporter =
            new ExtentSparkReporter(getExtentReportPath());

    public static void initExtentReport() {
        try {
            if (Objects.isNull(extentReports)) {
                extentReports = new ExtentReports();
                sparkReporter.viewConfigurer().viewOrder().
                        as(new ViewName[]{ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY, ViewName.DEVICE});
                sparkReporter.config().setDocumentTitle("Automation Report");
                sparkReporter.config().setReportName("testingplace Web Testing Report");
                sparkReporter.config().setTimelineEnabled(true);
                sparkReporter.config().setTimeStampFormat("MMM dd, yyyy hh:mm:ss");
                sparkReporter.config().setTheme(Theme.STANDARD);
                sparkReporter.config().setEncoding("utf-8");
                extentReports.attachReporter(sparkReporter);
                extentReports.setAnalysisStrategy(AnalysisStrategy.TEST);
                extentReports.setSystemInfo("Host", InetAddress.getLocalHost().getHostAddress());
                extentReports.setSystemInfo("Browser Info", getConfig().browser());
                extentReports.setSystemInfo("App URL", getConfig().baseUrl());
                extentReports.setSystemInfo("User Name", System.getProperty("user.name"));
                extentReports.setReportUsesManualConfiguration(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createTest(String testCaseName) {
        ExtentManager.setExtentTest(extentReports.createTest(testCaseName));
    }

    public static void flushExtentReport() {
        if (Objects.nonNull(extentReports)) {
            extentReports.flush();
        }
        ExtentManager.unload();
    }

    public static void pass(String message, String category) {
        ExtentManager.getExtentTest(category).pass(MarkupHelper.createLabel(message, ExtentColor.GREEN));
    }

    public static void fail(String message, String category, Throwable t) {
        ExtentManager.getExtentTest(category).fail(MarkupHelper.createLabel(message, ExtentColor.RED)).fail(t);
    }

    public static void skip(String message, String category) {
        ExtentManager.getExtentTest(category).log(Status.SKIP, message);
    }

    public static void info(Markup markup) {
        ExtentManager.getExtentTest().log(Status.INFO, markup);
    }

    public static void info(String message, String category) {
        ExtentManager.getExtentTest(category).log(Status.INFO, message);
    }

    public static String getExtentReportPath () {
        if (getConfig().newReport().equalsIgnoreCase("no")) {
            return EXTENT_REPORT_PATH + File.separator + "web_reports.html";
        } else {
            return EXTENT_REPORT_PATH + File.separator + getCurrentDateTime() + File.separator + "web_reports.html";
        }
    }
}