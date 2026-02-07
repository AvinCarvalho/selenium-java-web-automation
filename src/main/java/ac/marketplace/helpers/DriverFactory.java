package ac.testingplace.helpers;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

import static ac.testingplace.configs.ConfigManager.getConfig;
import static java.lang.String.format;

public class DriverFactory {
    public WebDriver createInstance(String browser) {
        Target target = Target.valueOf(getConfig().target().toUpperCase());
        WebDriver webdriver = null;
        switch (target) {
            case LOCAL:
                webdriver = BrowserFactory.valueOf(browser.toUpperCase()).createDriver();
                break;
            case REMOTE:
                webdriver = createRemoteInstance(BrowserFactory.valueOf(browser.toUpperCase()).getOptions());
                break;
            default:
                Log.info("No driver found for the browser");
        }
        return webdriver;
    }

    private RemoteWebDriver createRemoteInstance(MutableCapabilities capability) {
        RemoteWebDriver remoteWebDriver = null;
        try {
            String gridURL = format("http:remote_url", getConfig().gridUrl(), getConfig().gridPort());
            remoteWebDriver = new RemoteWebDriver(new URL(gridURL), capability);
        } catch (java.net.MalformedURLException e) {
            Log.error("Grid URL is invalid or Grid is not available");
            Log.error(format("Browser: %s", capability.getBrowserName()));
        } catch (IllegalArgumentException e) {
            Log.error(format("Browser %s is not valid or recognized", capability.getBrowserName()));
        }
        return remoteWebDriver;
    }

    enum Target {
        LOCAL, REMOTE
    }
}