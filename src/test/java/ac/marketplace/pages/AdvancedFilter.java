package ac.testingplace.pages;

import org.openqa.selenium.By;
public class AdvancedFilter extends BasePage{
    public final By ddl_hiring_manager = By.xpath("(//div[@class='ant-select-selection-overflow'])[1]");
    public final By ddl_role = By.xpath("//label[normalize-space()='Role']//parent::div//following-sibling::div");
    public final By ddl_speciality = By.xpath("//label[normalize-space()='Specialty']//parent::div//following-sibling::div");
    public final By txt_years_experience_1 = By.xpath("//input[@id='HWFilterTypeYearsOfExperience_0']");
    public final By txt_years_experience_2 = By.xpath("//input[@id='HWFilterTypeYearsOfExperience_1']");
    public final By ddl_current_past_company = By.xpath("(//div[@class='ant-select-selection-overflow'])[4]");
    public final By ddl_degree_qualification = By.xpath("(//div[@class='ant-select-selection-overflow'])[5]");
    public final By ddl_license_type = By.xpath("(//div[@class='ant-select-selection-overflow'])[6]");
    public final By ddl_license_state = By.xpath("(//div[@class='ant-select-selection-overflow'])[7]");
    public final By btn_compact_license = By.xpath("//span[text()='Any']");
    public final By ddl_certifications = By.xpath("(//div[@class='ant-select-selection-overflow'])[8]");
    public final By ddl_AI_match_score = By.xpath("//input[@id='AI_match_score']");
    public final By ddl_candidate_location = By.xpath("(//div[@class='ant-select-selection-overflow'])[9]");
    public final By ddl_date = By.xpath("//input[@id='HWFilterTypeAvailableToStart']");
    public final By ddl_start_date = By.xpath("//div[@class='ant-picker-footer']");
    public final By btn_candidate = By.xpath("//span[text()='Candidates']");
    public final By btn_submitted = By.xpath("//h5[text()='Submitted']");
    public final By btn_shortlist = By.xpath("//h5[text()='Shortlist']");
    public final By btn_interview = By.xpath("//h5[text()='Interview']");
    public final By btn_rejected = By.xpath("//h5[text()='Rejected']");
    public final By btn_offer = By.xpath("//h5[text()='Offer']");
    public final By btn_filled = By.xpath("//h5[text()='Filled']");
    public final By ddl_Filters = By.xpath("//span[text()='Filters']");
    public final By btn_apply = By.xpath("//span[text()='Apply']");
    public final By btn_clear = By.xpath("//span[text()='Clear']");
    public final By search_txtField = By.xpath("(//input[starts-with(@id,'rc_select')])[1]");
    public final By search_btn = By.xpath("//span[@class='ant-input-group-addon']");
    public void clickButton(String buttonType) {
        switch (buttonType) {
            case "Submitted":
                clickOnTheElement(SHORT_WAIT, btn_submitted);
                break;
            case "Shortlist":
                clickOnTheElement(SHORT_WAIT, btn_shortlist);
                break;
            case "Interview":
                clickOnTheElement(SHORT_WAIT, btn_interview);
                break;
            case "Rejected":
                clickOnTheElement(SHORT_WAIT, btn_rejected);
                break;
            case "Offer":
                clickOnTheElement(SHORT_WAIT, btn_offer);
                break;
            case "Filled":
                clickOnTheElement(SHORT_WAIT,btn_filled);
        }
    }
    public  void CandidateTab(){
        clickOnTheElement(MEDIUM_WAIT,btn_candidate);
    }
    public  void Filter(){clickOnTheElement(MEDIUM_WAIT, ddl_Filters);}
    public  void ClearBtn() {clickOnTheElement(MEDIUM_WAIT, btn_clear);}
    public void ApplyBtn() {
        clickOnTheElement(MEDIUM_WAIT, btn_apply);
    }

    public void SearchTxtFieldUsingSubmittedTabCandidateName(){enterText(MEDIUM_WAIT,search_txtField,FilterDataReader.getTestData("SubmittedTabCandidateName"));}
    public void SearchTxtFieldUsingShortlistTabCandidateName(){enterText(MEDIUM_WAIT,search_txtField,FilterDataReader.getTestData("ShortlistTabCandidateName"));}
    public void SearchTxtFieldUsingInterviewTabCandidateName(){enterText(MEDIUM_WAIT,search_txtField,FilterDataReader.getTestData("InterviewTabCandidateName"));}
    public void SearchTxtFieldUsingRejectedTabCandidateName(){enterText(MEDIUM_WAIT,search_txtField,FilterDataReader.getTestData("RejectedTabCandidateName"));}
    public void SearchTxtFieldUsingOfferTabCandidateName(){enterText(MEDIUM_WAIT,search_txtField,FilterDataReader.getTestData("OfferTabCandidateName"));}
    public void SearchTxtFieldUsingFilledTabCandidateName(){enterText(MEDIUM_WAIT,search_txtField,FilterDataReader.getTestData("FilledTabCandidateName"));}

    public void SearchTxtFieldUsingLowerCase(){enterText(MEDIUM_WAIT,search_txtField,FilterDataReader.getTestData("lowercaseTextDesignation"));}
    public void SearchTxtFieldUsingUpperCase(){enterText(MEDIUM_WAIT,search_txtField,FilterDataReader.getTestData("UpperCaseTextDesignation"));}
    public void SearchTxtFieldUsingDesignation(){enterText(MEDIUM_WAIT,search_txtField,FilterDataReader.getTestData("Designation"));}
    public void SearchTxtFieldUsingRandomLetters(){enterText(MEDIUM_WAIT,search_txtField,FilterDataReader.getTestData("RandomSearch"));}
    public void SearchBtn(){clickOnTheElement(MEDIUM_WAIT,search_btn);}
    
}
