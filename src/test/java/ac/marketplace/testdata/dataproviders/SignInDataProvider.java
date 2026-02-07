package ac.testingplace.testdata.dataproviders;

import org.testng.annotations.DataProvider;

public class SignInDataProvider {
    @DataProvider(name = "valid_user")
    public static Object[][] registeredUser() {
        return new String[][]{
                {"sk_karinje@sharklasers.com", "ac$22"}
        };
    }

    @DataProvider(name = "invalid_user")
    public static Object[][] invalidUser() {
        return new String[][]{
                {"sk_karinje@sharklasers.com", "ac$209"},
                {"sk@sharklasers.com", "ac$22"}
        };
    }

    @DataProvider(name = "valid_user_forgot_password")
    public static Object[][] registeredUserForgotPassword () {
        return new String[][]{
                {"sk_karinje@sharklasers.com"}
        };
    }
}
