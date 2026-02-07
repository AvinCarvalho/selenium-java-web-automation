package ac.testingplace.pages;

public class CandidatePageSubmittedTabFilter extends AdvancedFilter {
    public void submittedActions(AdvancedFilter advancedfilter){
        advancedfilter.CandidateTab();
        clickButton("Submitted");
        advancedfilter.Filter();
        advancedfilter.ClearBtn();
        waitForThePageToLoad();
        advancedfilter.Filter();
    }
    public void submittedApplyAction(AdvancedFilter advancedfilter){
        advancedfilter.ApplyBtn();
    }
    public void submittedTabActionsInCandidatePage() {
        AdvancedFilter advancedfilter = new AdvancedFilter();
        submittedActions(advancedfilter);
    }
    public void submittedTabApplyActionInCandidatePage() {
        AdvancedFilter advancedfilter = new AdvancedFilter();
        submittedApplyAction(advancedfilter);
    }

    public void submittedSearch(AdvancedFilter advancedfilter){
        advancedfilter.CandidateTab();
        clickButton("Submitted");
        SearchBtn();
    }

    public void submittedTabSearchInCandidatePage() {
        AdvancedFilter advancedfilter = new AdvancedFilter();
        submittedSearch(advancedfilter);
    }
    public void submittedTab_HiringManager_Role(){
        submittedTabActionsInCandidatePage();
        selectByVisibleText(LONG_WAIT, ddl_hiring_manager, FilterDataReader.getTestData("hiring_manager"));
        selectByVisibleText(LONG_WAIT, ddl_role, FilterDataReader.getTestData("role"));
        submittedTabApplyActionInCandidatePage();
    }
    public void submittedTab_Speciality(){
        submittedTabActionsInCandidatePage();
        selectByVisibleText(LONG_WAIT,ddl_speciality,FilterDataReader.getTestData("speciality"));
        submittedTabApplyActionInCandidatePage();
    }
    public void submittedTab_YearsOfExp(){
        submittedTabActionsInCandidatePage();
        selectByVisibleText(LONG_WAIT,txt_years_experience_1,FilterDataReader.getTestData("years_experience_1"));
        selectByVisibleText(LONG_WAIT,txt_years_experience_2,FilterDataReader.getTestData("years_experience_2"));
        submittedTabApplyActionInCandidatePage();
    }
    public void submittedTab_CurrentCompany_Degree(){
        submittedTabActionsInCandidatePage();
        selectByVisibleText(LONG_WAIT,ddl_current_past_company,FilterDataReader.getTestData("current_past_company"));
        selectByVisibleText(LONG_WAIT,ddl_degree_qualification,FilterDataReader.getTestData("degree_qualification"));
        submittedTabApplyActionInCandidatePage();
    }
    public void submittedTab_License(){
        submittedTabActionsInCandidatePage();
        selectByVisibleText(LONG_WAIT,ddl_license_type,FilterDataReader.getTestData("license_type"));
        selectByVisibleText(LONG_WAIT,ddl_license_state,FilterDataReader.getTestData("license_state"));
        clickOnTheElement(LONG_WAIT,btn_compact_license);
        submittedTabApplyActionInCandidatePage();
    }
    public void submittedTab_Certifications(){
        submittedTabActionsInCandidatePage();
        selectByVisibleText(LONG_WAIT,ddl_certifications,FilterDataReader.getTestData("certifications"));
        submittedTabApplyActionInCandidatePage();
    }
    public void submittedTab_AiScore_Location(){
        submittedTabActionsInCandidatePage();
        selectByVisibleText(LONG_WAIT,ddl_AI_match_score,FilterDataReader.getTestData("AI_match_score"));
        selectByVisibleText(LONG_WAIT,ddl_candidate_location,FilterDataReader.getTestData("candidate_location"));
        submittedTabApplyActionInCandidatePage();
    }
    public void submittedTab_Date(){
        submittedTabActionsInCandidatePage();
        clickOnTheElement(LONG_WAIT,ddl_date);
        clickOnTheElement(LONG_WAIT,ddl_start_date);
        submittedTabApplyActionInCandidatePage();
    }
    public void submittedTab_AllFilters(){
        submittedTabActionsInCandidatePage();
        selectByVisibleText(LONG_WAIT, ddl_hiring_manager, FilterDataReader.getTestData("hiring_manager"));
        selectByVisibleText(LONG_WAIT, ddl_role, FilterDataReader.getTestData("role"));
        selectByVisibleText(LONG_WAIT,ddl_speciality,FilterDataReader.getTestData("speciality"));
        selectByVisibleText(LONG_WAIT,txt_years_experience_1,FilterDataReader.getTestData("years_experience_1"));
        selectByVisibleText(LONG_WAIT,txt_years_experience_2,FilterDataReader.getTestData("years_experience_2"));
        selectByVisibleText(LONG_WAIT,ddl_current_past_company,FilterDataReader.getTestData("current_past_company"));
        selectByVisibleText(LONG_WAIT,ddl_degree_qualification,FilterDataReader.getTestData("degree_qualification"));
        selectByVisibleText(LONG_WAIT,ddl_license_type,FilterDataReader.getTestData("license_type"));
        selectByVisibleText(LONG_WAIT,ddl_license_state,FilterDataReader.getTestData("license_state"));
        clickOnTheElement(LONG_WAIT,btn_compact_license);
        selectByVisibleText(LONG_WAIT,ddl_certifications,FilterDataReader.getTestData("certifications"));
        selectByVisibleText(LONG_WAIT,ddl_AI_match_score,FilterDataReader.getTestData("AI_match_score"));
        selectByVisibleText(LONG_WAIT,ddl_candidate_location,FilterDataReader.getTestData("candidate_location"));
        clickOnTheElement(LONG_WAIT,ddl_date);
       clickOnTheElement(LONG_WAIT,ddl_start_date);
        submittedTabApplyActionInCandidatePage();
    }
    public void submittedTab_AllFilters_Clear(){
        submittedTabActionsInCandidatePage();
        selectByVisibleText(LONG_WAIT, ddl_hiring_manager, FilterDataReader.getTestData("hiring_manager"));
        selectByVisibleText(LONG_WAIT, ddl_role, FilterDataReader.getTestData("role"));
        selectByVisibleText(LONG_WAIT,ddl_speciality,FilterDataReader.getTestData("speciality"));
        selectByVisibleText(LONG_WAIT,txt_years_experience_1,FilterDataReader.getTestData("years_experience_1"));
        selectByVisibleText(LONG_WAIT,txt_years_experience_2,FilterDataReader.getTestData("years_experience_2"));
        selectByVisibleText(LONG_WAIT,ddl_current_past_company,FilterDataReader.getTestData("current_past_company"));
        selectByVisibleText(LONG_WAIT,ddl_degree_qualification,FilterDataReader.getTestData("degree_qualification"));
        selectByVisibleText(LONG_WAIT,ddl_license_type,FilterDataReader.getTestData("license_type"));
        selectByVisibleText(LONG_WAIT,ddl_license_state,FilterDataReader.getTestData("license_state"));
        clickOnTheElement(LONG_WAIT,btn_compact_license);
        selectByVisibleText(LONG_WAIT,ddl_certifications,FilterDataReader.getTestData("certifications"));
        selectByVisibleText(LONG_WAIT,ddl_AI_match_score,FilterDataReader.getTestData("AI_match_score"));
        selectByVisibleText(LONG_WAIT,ddl_candidate_location,FilterDataReader.getTestData("candidate_location"));
        clickOnTheElement(LONG_WAIT,ddl_date);
        clickOnTheElement(LONG_WAIT,ddl_start_date);
        clickOnTheElement(MEDIUM_WAIT,btn_clear);

    }
    public void submittedTab_SearchWithCandidateName(){
        submittedTabSearchInCandidatePage();
        SearchTxtFieldUsingSubmittedTabCandidateName();
        SearchBtn();
    }
    public void submittedTab_SearchWithLowerCaseLetters(){
        submittedTabSearchInCandidatePage();
        SearchTxtFieldUsingLowerCase();
        SearchBtn();
    }
    public void submittedTab_SearchWithUpperCaseLetters(){
        submittedTabSearchInCandidatePage();
        SearchTxtFieldUsingUpperCase();
        SearchBtn();
    }
    public void submittedTab_SearchWithDesignation(){
        submittedTabSearchInCandidatePage();
        SearchTxtFieldUsingDesignation();
        SearchBtn();
    }
    public void submittedTab_SearchWithRandomText(){
        submittedTabSearchInCandidatePage();
        SearchTxtFieldUsingRandomLetters();
        SearchBtn();
    }
}
