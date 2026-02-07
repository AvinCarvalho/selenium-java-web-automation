package ac.testingplace.pages;

public class CandidatePageFilledTabFilter extends AdvancedFilter {
    public void filledActions(AdvancedFilter advancedfilter){
        advancedfilter.CandidateTab();
        clickButton("Filled");
        advancedfilter.Filter();
        advancedfilter.ClearBtn();
        waitForThePageToLoad();
        advancedfilter.Filter();
    }
    public void filledApplyAction(AdvancedFilter advancedfilter){
        advancedfilter.ApplyBtn();
    }
    public void filledTabActionsInCandidatePage() {
        AdvancedFilter advancedfilter = new AdvancedFilter();
        filledActions(advancedfilter);
    }
    public void filledTabApplyActionInCandidatePage(){
        AdvancedFilter advancedfilter = new AdvancedFilter();
        filledApplyAction(advancedfilter);
    }
            public void filledTab_HiringManager_Role(){
            filledTabActionsInCandidatePage();
                selectByVisibleText(LONG_WAIT, ddl_hiring_manager, FilterDataReader.getTestData("hiring_manager"));
                selectByVisibleText(LONG_WAIT, ddl_role, FilterDataReader.getTestData("role"));
            filledTabApplyActionInCandidatePage();
        }
        public void filledTab_Speciality(){
            filledTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_speciality,FilterDataReader.getTestData("speciality"));
            filledTabApplyActionInCandidatePage();
        }
        public void filledTab_YearsOfExp(){
            filledTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,txt_years_experience_1,FilterDataReader.getTestData("years_experience_1"));
            selectByVisibleText(LONG_WAIT,txt_years_experience_2,FilterDataReader.getTestData("years_experience_2"));
            filledTabApplyActionInCandidatePage();
        }
        public void filledTab_CurrentCompany_Degree(){
            filledTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_current_past_company,FilterDataReader.getTestData("current_past_company"));
            selectByVisibleText(LONG_WAIT,ddl_degree_qualification,FilterDataReader.getTestData("degree_qualification"));
            filledTabApplyActionInCandidatePage();
        }
        public void filledTab_License(){
            filledTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_license_type,FilterDataReader.getTestData("license_type"));
            selectByVisibleText(LONG_WAIT,ddl_license_state,FilterDataReader.getTestData("license_state"));
            clickOnTheElement(LONG_WAIT,btn_compact_license);
            filledTabApplyActionInCandidatePage();
        }
        public void filledTab_Certifications(){
            filledTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_certifications,FilterDataReader.getTestData("certifications"));
            filledTabApplyActionInCandidatePage();
        }
        public void filledTab_AiScore_Location(){
            filledTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_AI_match_score,FilterDataReader.getTestData("AI_match_score"));
            selectByVisibleText(LONG_WAIT,ddl_candidate_location,FilterDataReader.getTestData("candidate_location"));
            filledTabApplyActionInCandidatePage();
        }
        public void filledTab_Date(){
            filledTabActionsInCandidatePage();
            clickOnTheElement(LONG_WAIT,ddl_date);
            clickOnTheElement(LONG_WAIT,ddl_start_date);
            filledTabApplyActionInCandidatePage();
        }
        public void filledTab_AllFilters(){
            filledTabActionsInCandidatePage();
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
            filledTabApplyActionInCandidatePage();
        }
        public void filledTab_AllFilters_Clear(){
            filledTabActionsInCandidatePage();
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


