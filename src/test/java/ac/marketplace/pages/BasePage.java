package ac.testingplace.pages;

import ac.testingplace.helpers.DriverManager;
import ac.testingplace.helpers.Log;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static ac.testingplace.helpers.UtilityManager.sleep;
public class BasePage {
    WebDriver driver;
    public static final Duration SHORT_WAIT = Duration.ofSeconds(5);
    public static final Duration MEDIUM_WAIT = Duration.ofSeconds(9);
    public static final Duration LONG_WAIT = Duration.ofSeconds(13);

    protected BasePage() {
        driver = DriverManager.getDriver();
    }

    protected void waitForThePageToLoad() {
        if (((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete")) {
            return;
        }
        for (int counter = 0; counter <= 10; counter++) {
            sleep(1);
            if (((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete")) {
                break;
            }
        }
    }

    protected void waitForTheElementToBeVisible(Duration timeUnits, By element) {
        waitForThePageToLoad();
        new WebDriverWait(driver, timeUnits).until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public WebElement findElement(Duration timeUnits, By element) {
        waitForThePageToLoad();
        if (isElementDisplayed(timeUnits, element))
            new WebDriverWait(driver, timeUnits).until(ExpectedConditions.elementToBeClickable(element));
        return driver.findElement(element);
    }

    public List<WebElement> findElements(Duration timeUnits, By element) {
        waitForThePageToLoad();
        if (isElementDisplayed(timeUnits, element)) {
            new WebDriverWait(driver, timeUnits).until(ExpectedConditions.elementToBeClickable(element));
            return driver.findElements(element);
        } else
            return null;
    }

    public WebElement findVisibleElement(Duration timeUnits, By element) {
        waitForThePageToLoad();
        if (isElementDisplayed(timeUnits, element)) {
            return driver.findElement(element);
        } else
            return null;
    }

    public boolean isElementDisplayed(Duration timeUnits, By element) {
        try {
            waitForTheElementToBeVisible(timeUnits, element);
            return true;
        } catch (Exception e) {
            Log.info(element + " is not displayed!");
            return false;
        }
    }

    public void clickOnTheElement(Duration timeUnits, By element) {
        if (isElementDisplayed(timeUnits, element))
            findElements(timeUnits, element).get(0).click();
    }

    public void enterText(Duration timeUnits, By element, String valueToBeSend) {
        if (isElementDisplayed(timeUnits, element))
            findElements(timeUnits, element).get(0).sendKeys(valueToBeSend);
    }

    public String getElementText(Duration timeUnits, By element) {
        if (isElementDisplayed(timeUnits, element))
            return findVisibleElement(timeUnits, element).getText();
        else
            return "";
    }

    public void selectByVisibleText(Duration timeUnits, By element, String value) {
        WebElement dropdown = findVisibleElement(timeUnits, element);
        if (dropdown != null) {
            Actions actions = new Actions(driver);
            actions.click(dropdown).pause(Duration.ofSeconds(2)).keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).
                    sendKeys(Keys.BACK_SPACE).pause(Duration.ofSeconds(1)).sendKeys(dropdown, value).
                    pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).click().build().perform();
        }
    }

    public void findElementClickAndEnterText(Duration timeUnits, By element, String valueToBeSend) {
        waitForThePageToLoad();
        WebElement targetElement = driver.findElement(element);
        new WebDriverWait(driver, timeUnits).until(ExpectedConditions.visibilityOf(targetElement));
        targetElement.click();
        targetElement.sendKeys(valueToBeSend);
    }

}








