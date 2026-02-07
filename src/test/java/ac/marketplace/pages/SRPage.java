package ac.testingplace.pages;


import org.openqa.selenium.By;

public class RequestPage extends BasePage {
    public final By Add__Request_Btn = By.xpath("//span[text()='Add  Request']");
    public final By _Request_Title = By.xpath("//input[@id='position_details_title']");
    public final By Staff_Role = By.xpath("//input[@id='position_details_role_id']");
    public final By Staff_Specialty = By.xpath("//input[@id='position_details_specialty_id']");
    public final By _Request_Type = By.xpath("//input[@id='position_details__request_type_id']");
    public final By _Request_Description = By.xpath("//div[@data-placeholder='Enter Description']");
    public final By Staff_Facility = By.xpath("//input[@id='facility_details_facility_id']");
    public final By Staff_Department = By.xpath("//input[@id='facility_details_department_id']");
    public final By Next = By.xpath("//span[text()='Next']");
    public final By Start_Date = By.xpath("//input[@id='other_details_start_date_display']");
    public final By No_0f_Positions = By.xpath("//input[@id='other_details_number_of_positions']");
    public final By Hiring_Manager = By.xpath("//input[@id='other_details_hiring_manager_id']");
    public final By Bill_Rate = By.xpath("//input[@id='other_details_bill_rate']");
    public final By Staff_Shift = By.xpath("//span[text()='Day']");
    public final By Shifts_Per_Week = By.xpath(" //input[@id='shift_details_shifts_per_week']");
    public final By Hours_Per_Shift = By.xpath(" //input[@id='shift_details_hours_per_shift']");
    public final By Shift_Timings = By.xpath(" //input[@id='shift_details_shift_timings_id']");
    public final By Next_Button = By.xpath(" //span[text()='Next']");
    public final By Timesheet_Approvers = By.xpath("//input[@id='distribution_timesheet_approver']");
    public final By Add_Button = By.xpath("");////*[@id="distribution"]/div[3]/div[1]/div/div[2]/button
    public final By Submit_Request = By.xpath("//span[text()='Submit Request']");

    public void EnterData(String RequestTitle, String Role, String Specialty,String RequestType,
                          String RequestDescription, String Facility, String Department){
                 clickOnTheElement(SHORT_WAIT,Add__Request_Btn);
                 enterText(SHORT_WAIT,_Request_Title,RequestTitle);
                 enterText(SHORT_WAIT,Staff_Role,Role);
                 enterText(SHORT_WAIT,Staff_Specialty,Specialty);
                 enterText(SHORT_WAIT,_Request_Type,RequestType);
                 enterText(SHORT_WAIT,_Request_Description,RequestDescription);
                 enterText(SHORT_WAIT,Staff_Facility,Facility);
                 enterText(SHORT_WAIT,Staff_Department,Department);
                 clickOnTheElement(SHORT_WAIT,Next);
    }
    public void Data(Integer StartDate,Integer NoOfPosition,String HiringManager,Float BillRate,String Shift,
                     Integer ShiftPerWeek, Integer HoursPerShift, Integer ShiftTimings){
              enterText(SHORT_WAIT,Start_Date, String.valueOf(StartDate));
              enterText(SHORT_WAIT,No_0f_Positions, String.valueOf(NoOfPosition));
              enterText(SHORT_WAIT,Hiring_Manager,HiringManager);
              enterText(SHORT_WAIT,Bill_Rate, String.valueOf(BillRate));
              enterText(SHORT_WAIT,Staff_Shift,Shift);
              enterText(SHORT_WAIT,Shifts_Per_Week, String.valueOf(ShiftPerWeek));
              enterText(SHORT_WAIT,Hours_Per_Shift, String.valueOf(HoursPerShift));
              enterText(SHORT_WAIT,Shift_Timings, String.valueOf(ShiftTimings));
              clickOnTheElement(SHORT_WAIT,Next_Button);
    }
    public void Approvers(String TimesheetApprovers){
             enterText(SHORT_WAIT,Timesheet_Approvers,TimesheetApprovers);
             clickOnTheElement(SHORT_WAIT,Add_Button);
             clickOnTheElement(SHORT_WAIT,Submit_Request);
    }


}
