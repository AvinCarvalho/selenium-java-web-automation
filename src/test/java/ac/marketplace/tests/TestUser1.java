package ac.testingplace.tests;

import ac.testingplace.pages.TestLoginPage;
import ac.testingplace.testdata.dataproviders.TestLoginData;
import org.testng.Assert;
import org.testng.annotations.Test;

import static ac.testingplace.assertsionstrings.Registration.*;
import static ac.testingplace.helpers.DriverManager.driver;

public class TestLoginTest extends BaseTest {
    @Test(description = "Validation of testingapp Test Login with Valid Credentials", dataProviderClass = TestLoginData.class,
            dataProvider = "Valid_User",groups = {"sanity","acceptance","system"})
    public void LoginInPage(String EmailId, String Password) {
        new TestLoginPage().LogIn(EmailId, Password);
        Assert.assertEquals(driver.get().getTitle(), PAGE_TITLE, "Title is matching");
    }

    @Test(enabled = false,description = "Validation of testingapp Test Login with Invalid Credential", dataProviderClass = TestLoginData.class,
            dataProvider = "Invalid_User",groups = {"sanity","acceptance","system"})
    public void LoginInPageWithInvalidCredential(String EmailId, String Password) {
        new TestLoginPage().LogIn(EmailId, Password);
       Assert.assertNotSame(driver.get().getCurrentUrl(),Test_URL,"URL is not matching");
    }

    @Test(enabled = false,description = "Validation of testingapp Test Login with less dino password", dataProviderClass = TestLoginData.class,
            dataProvider = "Password_With_LessThan8Characters",groups = {"sanity","acceptance","system"})
    public void PasswordWithLessValues(String EmailId, String Password) {
        new TestLoginPage().LogIn(EmailId, Password);
        Assert.assertNotSame(driver.get().getCurrentUrl(),Test_URL,"URL is not matching");
    }

    @Test(enabled = false,description = "Validation of testingapp Test Login with Invalid email", dataProviderClass = TestLoginData.class,
            dataProvider = "Invalid_Email",groups = {"sanity","acceptance","system"})
    public void InvalidEmail(String EmailId, String Password) {
        new TestLoginPage().LogIn(EmailId, Password);
        Assert.assertNotSame(driver.get().getCurrentUrl(),Test_URL,"URL is not matching");
    }

    @Test(enabled = false,description = "Validation of testingapp Test Login with Blank Fields", dataProviderClass = TestLoginData.class,
            dataProvider = "Blank_Fields",groups = {"sanity","acceptance","system"})
    public void BlankFields(String EmailId, String Password) {
        new TestLoginPage().LogIn(EmailId, Password);
        Assert.assertNotSame(driver.get().getCurrentUrl(),Test_URL,"URL is not matching");
    }

    @Test(enabled = false,description = "Validation of testingapp Test Login with Blank EmailField", dataProviderClass = TestLoginData.class,
            dataProvider = "Blank_EmailField",groups = {"sanity","acceptance","system"})
    public void BlankEmailField(String EmailId, String Password) {
        new TestLoginPage().LogIn(EmailId, Password);
        Assert.assertNotSame(driver.get().getCurrentUrl(),Test_URL,"URL is not matching");
    }

    @Test(enabled = false,description = "Validation of testingapp Test Login with Blank PasswordField", dataProviderClass = TestLoginData.class,
            dataProvider = "Blank_Password",groups = {"sanity","acceptance","system"})
    public void BlankPassword(String EmailId, String Password) {
        new TestLoginPage().LogIn(EmailId, Password);
        Assert.assertNotSame(driver.get().getCurrentUrl(),Test_URL,"URL is not matching");
    }
}




