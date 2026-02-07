package ac.testingplace.pages;

import org.openqa.selenium.By;
import static ac.testingplace.helpers.UtilityManager.sleep;


public class TestLoginPage extends BasePage {
    public final By email_txtfield = By.id("login-admin_email");
    public final By password_txtfield = By.id("login-admin_password");
    public final By signin_button = By.xpath("//button[@type='submit']");
    public final By Test_button = By.xpath("//div[text()='Test']");

    public void LogIn(String EmailId, String Password) throws StackOverflowError{
        enterText(MEDIUM_WAIT, email_txtfield, EmailId);
        enterText(MEDIUM_WAIT, password_txtfield, Password);
        clickOnTheElement(LONG_WAIT, signin_button);
        clickOnTheElement(LONG_WAIT, Test_button);
        sleep(4);

    }
}

