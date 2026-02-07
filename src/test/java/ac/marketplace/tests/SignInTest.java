package ac.testingplace.tests;

import ac.testingplace.assertsionstrings.Registration;
import ac.testingplace.helpers.Log;
import ac.testingplace.pages.CommonPage;
import ac.testingplace.pages.SignInPage;
import ac.testingplace.testdata.dataproviders.SignInDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

    @BeforeTest(alwaysRun = true)
    public void signInPreTest() {
        Log.info("Lets start sign in cases!");
    }

    @Test(description = "Validate SignIn UI elements", groups = {"system", "acceptance"}, priority = 1, enabled=false)
    public void signInPageElements() {
        Assert.assertTrue(new SignInPage().signInElements(),
                "All the elements are not displayed");
    }

    @Test(description = "Validate SignIn without entering email and password", groups = {"system"}, priority = 2, enabled=false)
    public void signInWithoutCred() {
        new SignInPage().clickOnSignIn();
        Assert.assertTrue(new SignInPage().inlineErrorMessage(),
                "The error message is not shown");
    }

    @Test(description = "Validate SignIn using valid credentials", groups = {"sanity", "acceptance", "system"}, priority = 3,
            dataProviderClass = SignInDataProvider.class, dataProvider = "valid_user")
    public void validateSignIn(String email, String password) {
        new SignInPage().signIn(email, password);
        Assert.assertEquals(new CommonPage().pageHeader(), Registration.HOME_PAGE_HEADER,
                "Home page is not displayed");
    }

    @Test(description = "Validate SignIn using Invalid credentials", groups = {"sanity", "acceptance", "system"}, priority = 4,
            dataProviderClass = SignInDataProvider.class, dataProvider = "invalid_user")
    public void validateSignInWithInvalidCred(String email, String password) {
        new SignInPage().signIn(email, password);
        Assert.assertTrue(new SignInPage().errorMessageIsShown(),
                "The error message is not shown");
    }

    @Test(description = "Validate Forgot Password using valid credentials", groups = {"sanity", "acceptance", "system"}, priority = 5,
            dataProviderClass = SignInDataProvider.class, dataProvider = "valid_user_forgot_password")
    public void validateForgotPasswordWithValidEmail (String email) {
        new SignInPage().performResetPassword(email);
        Assert.assertEquals(new SignInPage().getEmailFromEmailSentPage(), email,
                "Incorrect email is shown");
    }
}