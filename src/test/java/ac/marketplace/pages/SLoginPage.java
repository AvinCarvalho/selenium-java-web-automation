package ac.testingplace.pages;

import org.openqa.selenium.By;

import static ac.testingplace.helpers.UtilityManager.sleep;
public class TestLoginPage extends BasePage{
    public final By email_txtfield = By.id("login-admin_email");
    public final By password_txtfield  = By.id("login-admin_password");
    public final By signin_button = By.xpath("//span[text()='Sign In']");
    public final By Test_button = By.xpath("//div[text()='Test']");
    public void LogIn(String EmailId, String Password) throws StackOverflowError {
        enterText(SHORT_WAIT, email_txtfield, EmailId);
        enterText(SHORT_WAIT, password_txtfield, Password);
        clickOnTheElement(SHORT_WAIT,signin_button);
        clickOnTheElement(SHORT_WAIT , Test_button);
        sleep(3);

    }
}

