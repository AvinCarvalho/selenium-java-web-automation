package ac.testingplace.pages;

import org.openqa.selenium.By;
public class CandidateStagePage extends BasePage {
    public static By TotalItems() {
        return (By.xpath("//span[contains(text(), 'Total') and contains(text(), 'items'"));
    }
    public static By RegisteredNurseXPath() {
        return (By.xpath("//div[normalize-space()='Registered Nurse']"));
    }
    public static By AcuteCareXpath() {
        return (By.xpath("//span[@class='ant-tag css-yp8pcc']"));
    }
    public static By LamborghiniFerruccio() {
        return (By.xpath("//a[contains(text(),'Lamborghini')]']"));
    }
    public static By RogersSteve() {
        return (By.xpath("//a[contains(text(),'Rogers')]"));
    }
    public static By FerrariEnzo() {
        return (By.xpath("//a[contains(text(),'Ferrari')]"));
    }
    public static By MartinLionel() {
        return (By.xpath("//a[contains(text(),'Martin')]"));
    }
    public static By DatsunAikawa() {
        return (By.xpath("//a[contains(text(),'Datsun')]"));
    }
    public static By BugattiEttores() {
        return (By.xpath("//a[contains(text(),'Bugatti')]"));
    }
    public static By AstonStroll() {
        return (By.xpath("//a[contains(text(),'Aston')]"));
    }
    public static By noProfile() {
        return (By.xpath("div[class='ant-empty-description'] span[class='ant-typography css-1rbuwr']"));
    }
}
 /* public static By TotalItems() {
         WebElement TotalData = (WebElement) By.xpath("//span[contains(text(), 'Total') and contains(text(), 'items')]");
         TotalData.getText();
         String expectedText = FilterDataReader.getTestData("CandidateCount");
         String actualText = getTotalItemsText();

         if(expectedText.equals(actualText)) {
             return getTotalItemsElement();
         } else {

             return null;
         }
     }*/




