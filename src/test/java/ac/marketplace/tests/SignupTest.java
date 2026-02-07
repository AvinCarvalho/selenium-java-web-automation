package ac.testingplace.tests;

import ac.testingplace.assertsionstrings.Registration;
import ac.testingplace.helpers.Log;
import ac.testingplace.pages.SignInPage;
import ac.testingplace.pages.SignupPage;
import ac.testingplace.pages.VerifyEmailPage;
import ac.testingplace.testdata.dataproviders.SignupDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignupTest extends BaseTest {

    @BeforeTest(alwaysRun = true)
    public void goToSignupPage() {
        new SignInPage().navigateToSignUpPage();
        Log.info("Lets start signup in cases!");
    }
    @Test(description = "Validate Signup UI elements", groups = {"system", "acceptance"}, priority = 1)
    public void uiSignupElements() {
        Assert.assertTrue(new SignupPage().signupElements(),
                "All the elements are not displayed");
    }

    @Test(description = "Validate Signup using valid details", groups = {"sanity"}, priority = 2,
            dataProviderClass = SignupDataProvider.class, dataProvider = "email_users")
    public void validateSignup(String firstName, String lastName, String email, String password) {
        new SignupPage().signup(firstName, lastName, email, password);
        Assert.assertEquals(new VerifyEmailPage().pageHeader(), Registration.VERIFY_EMAIL_PAGE_HEADER,
                "Verify email page is not displayed");
    }

    @Test(description = "Validate Signup using already registered account details", groups = {"sanity"}, priority = 2,
            dataProviderClass = SignupDataProvider.class, dataProvider = "already_registered_user")
    public void validateSignupWithAlreadyRegisteredUser(String firstName, String lastName, String email, String password) {
        new SignupPage().signup(firstName, lastName, email, password);
        Assert.assertEquals(new VerifyEmailPage().pageHeader(), Registration.VERIFY_EMAIL_PAGE_HEADER,
                "Verify email page is not displayed");
    }
}