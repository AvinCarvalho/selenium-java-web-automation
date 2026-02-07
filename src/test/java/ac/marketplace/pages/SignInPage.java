package ac.testingplace.pages;

import org.openqa.selenium.By;

import static ac.testingplace.helpers.UtilityManager.sleep;

public class SignInPage extends CommonPage {
    private final By lnk_signup = By.id("signup");
    private final By txt_email = By.id("email");
    private final By txt_password = By.id("password");
    private final By lnk_forgot_password = By.id("forgotpassword");
    private final By btn_sign_in = By.id("signin");
    private final By lbl_error_message = By.xpath("//div[contains(@class,'alert_container')]//p");
    private final By lbl_inline_error_email = By.xpath("//label[contains(@class,'forms_error')]");
    private final By btn_reset_password = By.xpath("//button[normalize-space()='Reset Password']");
    private final By lbl_email_in_email_sent_page = By.xpath("//a[contains(text(),'Change')]/preceding-sibling::span");
    public void navigateToSignUpPage ()  {
        clickOnTheElement(SHORT_WAIT, lnk_signup);
    }

    public void clickOnSignIn() {
        clickOnTheElement(SHORT_WAIT, btn_sign_in);
    }
    public void performResetPassword (String email) {
        clickOnTheElement(SHORT_WAIT, lnk_forgot_password);
        sleep(1);
        enterText(SHORT_WAIT, txt_email, email);
        clickOnTheElement(SHORT_WAIT, btn_reset_password);
    }

    public String getEmailFromEmailSentPage() {
        return getElementText(SHORT_WAIT, lbl_email_in_email_sent_page);
    }

    public boolean errorMessageIsShown() {
        return isElementDisplayed(SHORT_WAIT,lbl_error_message);
    }

    public boolean inlineErrorMessage() {
        return isElementDisplayed(SHORT_WAIT, lbl_inline_error_email);
    }

    public boolean signInElements() {
        return isElementDisplayed(SHORT_WAIT,page_header) &&
                isElementDisplayed(SHORT_WAIT, txt_email) &&
                isElementDisplayed(SHORT_WAIT, txt_password) &&
                isElementDisplayed(SHORT_WAIT, lnk_forgot_password) &&
                isElementDisplayed(SHORT_WAIT,btn_sign_in);
    }
    public void signIn (String email, String password) {
        enterText(SHORT_WAIT, txt_email, email);
        enterText(SHORT_WAIT, txt_password, password);
        clickOnTheElement(SHORT_WAIT, btn_sign_in);
        sleep(1);
    }
}