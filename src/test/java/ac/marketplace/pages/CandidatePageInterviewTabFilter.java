package ac.testingplace.pages;

public class CandidatePageInterviewTabFilter extends AdvancedFilter{
    public void interviewActions(AdvancedFilter advancedfilter){
        advancedfilter.CandidateTab();
        clickButton("Interview");
        advancedfilter.Filter();
        advancedfilter.ClearBtn();
        waitForThePageToLoad();
        advancedfilter.Filter();
    }
    public void interviewApplyAction(AdvancedFilter advancedfilter){
        advancedfilter.ApplyBtn();
    }
    public void interviewTabActionsInCandidatePage() {
        AdvancedFilter advancedfilter = new AdvancedFilter();
        interviewActions(advancedfilter);
    }
    public void interviewTabApplyActionInCandidatePage(){
        AdvancedFilter advancedfilter = new AdvancedFilter();
        interviewApplyAction(advancedfilter);
    }
        public void interviewTab_HiringManager_Role(){
            interviewTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT, ddl_hiring_manager, FilterDataReader.getTestData("hiring_manager"));
            selectByVisibleText(LONG_WAIT, ddl_role, FilterDataReader.getTestData("role"));
            interviewTabApplyActionInCandidatePage();
        }
        public void interviewTab_Speciality(){
            interviewTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_speciality,FilterDataReader.getTestData("speciality"));
            interviewTabApplyActionInCandidatePage();
        }
        public void interviewTab_YearsOfExp(){
            interviewTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,txt_years_experience_1,FilterDataReader.getTestData("years_experience_1"));
            selectByVisibleText(LONG_WAIT,txt_years_experience_2,FilterDataReader.getTestData("years_experience_2"));
            interviewTabApplyActionInCandidatePage();
        }
        public void interviewTab_CurrentCompany_Degree(){
            interviewTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_current_past_company,FilterDataReader.getTestData("current_past_company"));
            selectByVisibleText(LONG_WAIT,ddl_degree_qualification,FilterDataReader.getTestData("degree_qualification"));
           interviewTabApplyActionInCandidatePage();
        }
        public void interviewTab_License(){
            interviewTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_license_type,FilterDataReader.getTestData("license_type"));
            selectByVisibleText(LONG_WAIT,ddl_license_state,FilterDataReader.getTestData("license_state"));
            clickOnTheElement(LONG_WAIT,btn_compact_license);
            interviewTabApplyActionInCandidatePage();
        }
        public void interviewTab_Certifications(){
            interviewTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_certifications,FilterDataReader.getTestData("certifications"));
            interviewTabApplyActionInCandidatePage();
        }
        public void interviewTab_AiScore_Location(){
            interviewTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_AI_match_score,FilterDataReader.getTestData("AI_match_score"));
            selectByVisibleText(LONG_WAIT,ddl_candidate_location,FilterDataReader.getTestData("candidate_location"));
            interviewTabApplyActionInCandidatePage();
        }
        public void interviewTab_Date(){
            interviewTabActionsInCandidatePage();;
            clickOnTheElement(LONG_WAIT,ddl_date);
            clickOnTheElement(LONG_WAIT,ddl_start_date);
            interviewTabApplyActionInCandidatePage();
        }
        public void interviewTab_AllFilters(){
            interviewTabActionsInCandidatePage();
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
            interviewTabApplyActionInCandidatePage();
        }
        public void interviewTab_AllFilters_Clear(){
            interviewTabActionsInCandidatePage();
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
