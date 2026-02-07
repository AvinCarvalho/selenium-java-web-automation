package ac.testingplace.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import static ac.testingplace.configs.ConfigManager.getConfig;
import static ac.testingplace.helpers.BrowserConstants.START_MAXIMIZED;
import static java.lang.Boolean.TRUE;

public enum BrowserFactory {
    CHROME {
        @Override
        public WebDriver createDriver() {
            return new ChromeDriver(getOptions());
        }
        @Override
        public ChromeOptions getOptions() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments(START_MAXIMIZED);
           // chromeOptions.setHeadless(getConfig().headless());
          //  options.addArguments("--headless=new");
          //  chromeOptions.setHeadless(true);
            return chromeOptions;
        }
    },
    FIREFOX {
        @Override
        public WebDriver createDriver() {
            return new FirefoxDriver(getOptions());
        }

        @Override
        public FirefoxOptions getOptions() {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments(START_MAXIMIZED);
           // firefoxOptions.setHeadless(getConfig().headless());
          //  options.addArguments("--headless=new");
            return firefoxOptions;
        }
    },
    EDGE {
        @Override
        public WebDriver createDriver() {
            return new EdgeDriver(getOptions());
        }

        @Override
        public EdgeOptions getOptions() {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments(START_MAXIMIZED);
           // edgeOptions.setHeadless(getConfig().headless());
            return edgeOptions;
        }
    },
    SAFARI {
        @Override
        public WebDriver createDriver() {
            return new SafariDriver(getOptions());
        }
        @Override
        public SafariOptions getOptions() {
            SafariOptions safariOptions = new SafariOptions();
            safariOptions.setAutomaticInspection(false);
            if (TRUE.equals(getConfig().headless()))
                Log.info("Headless is not supported!");
            return safariOptions;
        }
    };
    public abstract WebDriver createDriver();
    public abstract AbstractDriverOptions<?> getOptions();
}