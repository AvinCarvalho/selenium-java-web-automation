package ac.testingplace.pages;

import org.openqa.selenium.By;

public class CommonPage extends BasePage {

    By btn_back = By.id("back");
    By page_header = By.xpath("//div//h1");

    public String pageHeader () {
        return getElementText(SHORT_WAIT, page_header);
    }
}
