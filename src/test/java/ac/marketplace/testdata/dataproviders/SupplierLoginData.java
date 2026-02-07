package ac.testingplace.testdata.dataproviders;

import org.testng.annotations.DataProvider;

public class TestLoginData {
    @DataProvider(name = "Valid_User")
    public static Object[][] TestUser() {
        return new Object[][]{
                {"dexter@merepost.com", "AC!23456"}
        };
    }
    @DataProvider(name = "Invalid_User")
    public static Object[][] InvalidUser() {
        return new Object[][]{
                {"mahi@mail.com", "mahi@12"}
        };
    }
    @DataProvider(name = "Password_with_LessThan8Characters")
    public static Object[][] PasswordWithLessValues() {
        return new Object[][]{
                {"dexter@merepost.com", "Qa!4"}
        };
    }
    @DataProvider(name = "Invalid_Email")
    public static Object[][] InvalidEmail() {
        return new Object[][]{
                {"dexter@gmail.com", "AC!23456"}
        };
    }
    @DataProvider(name = "Blank_Fields")
    public static Object[][] BlankFields() {
        return new Object[][]{
                {"", ""}
        };
    }
    @DataProvider(name = "Blank_EmailField")
    public static Object[][] BlankEmailField() {
        return new Object[][]{
                {"", "AC!23456"}
        };
    }
    @DataProvider(name = "Blank_Password")
    public static Object[][] BlankPassword() {
        return new Object[][]{
                {"dexter@merepost.com", ""}
        };
    }
    }
