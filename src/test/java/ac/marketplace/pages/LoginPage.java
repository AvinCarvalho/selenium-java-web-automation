package ac.testingplace.pages;
import ac.testingplace.helpers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import java.io.FileReader;
import java.util.Properties;

import static ac.testingplace.helpers.UtilityManager.sleep;
public class LoginPage extends BasePage {
    public final By email_txtfield = By.id("login-admin_email");
    public final By password_txtfield = By.id("login-admin_password");
    public final By signin_button = By.xpath("//button[@type='submit']");
    public final By Test_button = By.xpath("//div[text()='Test']");
   // public final By Test_button = By.xpath("//div[text()='Test']");
    public void LogIn(String EmailId, String Password) throws StackOverflowError {
        enterText(MEDIUM_WAIT, email_txtfield, EmailId);
        enterText(MEDIUM_WAIT, password_txtfield, Password);
        clickOnTheElement(LONG_WAIT, signin_button);
        clickOnTheElement(LONG_WAIT, Test_button);
      //  clickOnTheElement(LONG_WAIT,Test_button);
        sleep(4);
    }
 /*   public FileReader fr;
    public Properties prop = new Properties();
    public void setup() throws Throwable {
        if (driver == null) {
            System.out.println(System.getProperty("user.dir"));
            fr = new FileReader(System.getProperty("user.dir") + "src/test/java/ac/testingplace/UtilityFiles/config.properties");
            prop.load(fr);
        }
    } */
}