package ac.testingplace.pages;

public class CandidatePageRejectedTabFilter extends AdvancedFilter{
    public void rejectedActions(AdvancedFilter advancedfilter){
        advancedfilter.CandidateTab();
        clickButton("Rejected");
        advancedfilter.Filter();
        advancedfilter.ClearBtn();
        waitForThePageToLoad();
        advancedfilter.Filter();
    }
    public void rejectedApplyAction(AdvancedFilter candidatesPageFilter){
        candidatesPageFilter.ApplyBtn();
    }
    public void rejectedTabActionsInCandidatePage() {
        AdvancedFilter advancedfilter = new AdvancedFilter();
        rejectedActions(advancedfilter);
    }
    public void rejectedTabApplyActionInCandidatePage(){
        AdvancedFilter advancedfilter = new AdvancedFilter();
        rejectedApplyAction(advancedfilter);
    }
        public void rejectedTab_HiringManager_Role(){
            rejectedTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT, ddl_hiring_manager, FilterDataReader.getTestData("hiring_manager"));
            selectByVisibleText(LONG_WAIT, ddl_role, FilterDataReader.getTestData("role"));
            rejectedTabApplyActionInCandidatePage();
    }
        public void rejectedTab_Speciality(){
            rejectedTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_speciality,FilterDataReader.getTestData("speciality"));
            rejectedTabApplyActionInCandidatePage();
        }
        public void rejectedTab_YearsOfExp(){
            rejectedTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,txt_years_experience_1,FilterDataReader.getTestData("years_experience_1"));
            selectByVisibleText(LONG_WAIT,txt_years_experience_2,FilterDataReader.getTestData("years_experience_2"));
            rejectedTabApplyActionInCandidatePage();
        }
        public void rejectedTab_CurrentCompany_Degree(){
            rejectedTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_current_past_company,FilterDataReader.getTestData("current_past_company"));
            selectByVisibleText(LONG_WAIT,ddl_degree_qualification,FilterDataReader.getTestData("degree_qualification"));
            rejectedTabApplyActionInCandidatePage();
        }
        public void rejectedTab_License(){
            rejectedTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_license_type,FilterDataReader.getTestData("license_type"));
            selectByVisibleText(LONG_WAIT,ddl_license_state,FilterDataReader.getTestData("license_state"));
            clickOnTheElement(LONG_WAIT,btn_compact_license);
           rejectedTabApplyActionInCandidatePage();
        }
        public void rejectedTab_Certifications(){
            rejectedTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_certifications,FilterDataReader.getTestData("certifications"));
            rejectedTabApplyActionInCandidatePage();
        }
        public void rejectedTab_AiScore_Location(){
           rejectedTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_AI_match_score,FilterDataReader.getTestData("AI_match_score"));
            selectByVisibleText(LONG_WAIT,ddl_candidate_location,FilterDataReader.getTestData("candidate_location"));
            rejectedTabApplyActionInCandidatePage();
        }
        public void rejectedTab_Date(){
            rejectedTabActionsInCandidatePage();
            clickOnTheElement(LONG_WAIT,ddl_date);
            clickOnTheElement(LONG_WAIT,ddl_start_date);
            rejectedTabApplyActionInCandidatePage();
        }
        public void rejectedTab_AllFilters(){
            rejectedTabActionsInCandidatePage();
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
            rejectedTabApplyActionInCandidatePage();
        }
        public void rejectedTab_AllFilters_Clear(){
            rejectedTabActionsInCandidatePage();
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
    }


