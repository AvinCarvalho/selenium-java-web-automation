package ac.testingplace.pages;

import org.openqa.selenium.By;
public class SignupPage extends CommonPage {

   // private final By lbl_header = By.xpath("//div//h1");
    private final By txt_firstname = By.id("firstname");
    private final By txt_lastname = By.id("lastname");
    private final By txt_email = By.id("email");
    private final By txt_password = By.id("password");
    private final By btn_signup = By.id("signup");
    private final By lnk_terms = By.partialLinkText ("Terms and");

    public void clickOnSignupButton()  {
        clickOnTheElement(SHORT_WAIT, btn_signup);
    }
    public void enterFirstName(String valueToBeSend) {
        enterText(SHORT_WAIT, txt_firstname, valueToBeSend);
    }
    public void enterLastName(String valueToBeSend) {
        enterText(SHORT_WAIT, txt_lastname, valueToBeSend);
    }
    public void enterEmail(String valueToBeSend) {
        enterText(SHORT_WAIT, txt_email, valueToBeSend);
    }
    public void enterPassword(String valueToBeSend) {
        enterText(SHORT_WAIT, txt_password, valueToBeSend);
    }
    public void clickOnTerms () {
        clickOnTheElement(SHORT_WAIT, lnk_terms);
    }

    public void signup ( String firstname, String lastname, String email, String password) {
        enterFirstName(firstname);
        enterLastName(lastname);
        enterEmail(email);
        clickOnSignupButton();
    }

    public boolean signupElements () {
      return isElementDisplayed(SHORT_WAIT,page_header) &&
        isElementDisplayed(SHORT_WAIT, txt_firstname) &&
        isElementDisplayed(SHORT_WAIT, txt_lastname) &&
        isElementDisplayed(SHORT_WAIT, txt_email) &&
        isElementDisplayed(SHORT_WAIT, txt_password) &&
        isElementDisplayed(SHORT_WAIT,btn_signup);
    }
}