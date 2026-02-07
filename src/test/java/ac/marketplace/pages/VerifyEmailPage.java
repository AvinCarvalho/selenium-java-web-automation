package ac.testingplace.pages;

import org.openqa.selenium.By;

public class VerifyEmailPage extends CommonPage {
    By txt_otp_field = By.xpath("(//input[@type='text'])");
    By lnk_change_email = By.linkText("Change");
    By lbl_email = By.xpath("//a[text()='Change']/preceding-sibling::span");
    By lnk_resend_code = By.partialLinkText("Resend");
}
