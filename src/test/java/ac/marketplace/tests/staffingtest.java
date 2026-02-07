package ac.testingplace.tests;
import ac.testingplace.pages.TestLoginPage;
import ac.testingplace.pages.RequestPage;
import ac.testingplace.testdata.dataproviders.TestLoginData;
import org.testng.annotations.Test;
import javax.management.relation.Role;
public class RequestTest extends BaseTest {
    @Test(description = "Add  Request with all the Mandatory Fields")
    public void Add__Request() {
       RequestPage requestpage = new RequestPage();
       requestpage.EnterData("Registered Nurse", "Registered", "Specialty", "Type", "Description", "Facility", "Department");
       //requestpage.Data(20240311, 5, "ManagerName", 50.0f, "Day", 5);
       //requestpage.Approvers("ApproversName");
    }}
















   // @Test(description = "Create  Request ", dataProvider = "AgencyDataProvider",dataProviderClass = JsonDataProvider.class)
   // public void EnterData(String RequestTitle, String Role, String Specialty, String RequestType,
                       //   String RequestDescription, String Facility, String Department)
    //{
     //    new RequestPage().EnterData(RequestTitle,Role,Specialty,RequestType,RequestDescription,
     //                                     Facility,Department);
//          Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(),ADD__REQUEST,"URL is Matching");

    //}
