package ac.testingplace.pages;
public class CandidatePageShortlistTabFilter extends AdvancedFilter{
    public void shortlistActions(AdvancedFilter advancedfilter){
        advancedfilter.CandidateTab();
        clickButton("Shortlist");
        advancedfilter.Filter();
        advancedfilter.ClearBtn();
        waitForThePageToLoad();
        advancedfilter.Filter();
    }
    public void shortlistApplyAction(AdvancedFilter advancedfilter){
        advancedfilter.ApplyBtn();
    }
    public void shortlistTabActionsInCandidatePage() {
        AdvancedFilter advancedfilter = new AdvancedFilter();
        shortlistActions(advancedfilter);
    }
    public void shortlistTabApplyActionInCandidatePage(){
        AdvancedFilter advancedfilter = new AdvancedFilter();
        shortlistApplyAction(advancedfilter);
    }
    public void shortlistSearch(AdvancedFilter advancedfilter){
        advancedfilter.CandidateTab();
        clickButton("Shortlist");
        SearchBtn();
    }

    public void shortlistTabSearchInCandidatePage() {
        AdvancedFilter advancedfilter = new AdvancedFilter();
        shortlistSearch(advancedfilter);
    }
        public void shortlistTab_HiringManager_Role(){
            shortlistTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT, ddl_hiring_manager, FilterDataReader.getTestData("hiring_manager"));
            selectByVisibleText(LONG_WAIT, ddl_role, FilterDataReader.getTestData("role"));
            shortlistTabApplyActionInCandidatePage();
        }
        public void shortlistTab_Speciality(){
          shortlistTabActionsInCandidatePage();
          selectByVisibleText(LONG_WAIT,ddl_speciality,FilterDataReader.getTestData("speciality"));
          shortlistTabApplyActionInCandidatePage();        }
        public void shortlistTab_YearsOfExp(){
            shortlistTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,txt_years_experience_1,FilterDataReader.getTestData("years_experience_1"));
            selectByVisibleText(LONG_WAIT,txt_years_experience_2,FilterDataReader.getTestData("years_experience_2"));
            shortlistTabApplyActionInCandidatePage();        }
        public void shortlistTab_CurrentCompany_Degree(){
           shortlistTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_current_past_company,FilterDataReader.getTestData("current_past_company"));
            selectByVisibleText(LONG_WAIT,ddl_degree_qualification,FilterDataReader.getTestData("degree_qualification"));
            shortlistTabApplyActionInCandidatePage();
        }
        public void shortlistTab_License(){
            shortlistTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_license_type,FilterDataReader.getTestData("license_type"));
            selectByVisibleText(LONG_WAIT,ddl_license_state,FilterDataReader.getTestData("license_state"));
            clickOnTheElement(LONG_WAIT,btn_compact_license);
            shortlistTabApplyActionInCandidatePage();
        }
        public void shortlistTab_Certifications(){
            shortlistTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_certifications,FilterDataReader.getTestData("certifications"));
            shortlistTabApplyActionInCandidatePage();
        }
        public void shortlistTab_AiScore_Location(){
            shortlistTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_AI_match_score,FilterDataReader.getTestData("AI_match_score"));
            selectByVisibleText(LONG_WAIT,ddl_candidate_location,FilterDataReader.getTestData("candidate_location"));
            shortlistTabApplyActionInCandidatePage();
        }
        public void shortlistTab_Date(){
           shortlistTabActionsInCandidatePage();
            clickOnTheElement(LONG_WAIT,ddl_date);
            clickOnTheElement(LONG_WAIT,ddl_start_date);
            shortlistTabApplyActionInCandidatePage();
        }
        public void shortlistTab_AllFilters(){
            shortlistTabActionsInCandidatePage();
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
            shortlistTabApplyActionInCandidatePage();
        }
        public void shortlistTab_AllFilters_Clear(){
            shortlistTabActionsInCandidatePage();
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
    public void shortlistTab_SearchWithCandidateName(){
        shortlistTabSearchInCandidatePage();
        SearchTxtFieldUsingShortlistTabCandidateName();
        SearchBtn();
    }
    public void shortlistTab_SearchWithLowerCaseLetters(){
        shortlistTabSearchInCandidatePage();
        SearchTxtFieldUsingLowerCase();
        SearchBtn();
    }
    public void shortlistTab_SearchWithUpperCaseLetters(){
        shortlistTabSearchInCandidatePage();
        SearchTxtFieldUsingUpperCase();
        SearchBtn();
    }
    public void shortlistTab_SearchWithDesignation(){
        shortlistTabSearchInCandidatePage();
        SearchTxtFieldUsingDesignation();
        SearchBtn();
    }
    public void shortlistTab_SearchWithRandomText(){
        shortlistTabSearchInCandidatePage();
        SearchTxtFieldUsingRandomLetters();
        SearchBtn();
    }
    }


