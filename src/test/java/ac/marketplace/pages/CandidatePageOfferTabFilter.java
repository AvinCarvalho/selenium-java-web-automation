package ac.testingplace.pages;
public class CandidatePageOfferTabFilter extends AdvancedFilter {
    public void offerActions(AdvancedFilter advancedfilter){
        advancedfilter.CandidateTab();
        clickButton("Offer");
        advancedfilter.Filter();
        advancedfilter.ClearBtn();
        waitForThePageToLoad();
        advancedfilter.Filter();
        }
    public void offerApplyAction(AdvancedFilter advancedfilter){
        advancedfilter.ApplyBtn();
    }
    public void offerTabActionsInCandidatePage() {
        AdvancedFilter advancedfilter = new AdvancedFilter();
        offerActions(advancedfilter);
        }
    public void offerTabApplyActionInCandidatePage(){
        AdvancedFilter advancedfilter = new AdvancedFilter();
        offerApplyAction(advancedfilter);
    }
    public void offerTab_HiringManager_Role(){
            offerTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT, ddl_hiring_manager, FilterDataReader.getTestData("hiring_manager"));
            selectByVisibleText(LONG_WAIT, ddl_role, FilterDataReader.getTestData("role"));
            offerTabApplyActionInCandidatePage();
        }
    public void offerTab_Speciality(){
            offerTabActionsInCandidatePage();
        selectByVisibleText(LONG_WAIT,ddl_speciality,FilterDataReader.getTestData("speciality"));
            offerTabApplyActionInCandidatePage();
        }
    public void offerTab_YearsOfExp(){
            offerTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,txt_years_experience_1,FilterDataReader.getTestData("years_experience_1"));
            selectByVisibleText(LONG_WAIT,txt_years_experience_2,FilterDataReader.getTestData("years_experience_2"));
            offerTabApplyActionInCandidatePage();
        }
    public void offerTab_CurrentCompany_Degree(){
            offerTabActionsInCandidatePage();
        selectByVisibleText(LONG_WAIT,ddl_current_past_company,FilterDataReader.getTestData("current_past_company"));
        selectByVisibleText(LONG_WAIT,ddl_degree_qualification,FilterDataReader.getTestData("degree_qualification"));
            offerTabApplyActionInCandidatePage();
        }
    public void  offerTab_License(){
            offerTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_license_type,FilterDataReader.getTestData("license_type"));
            selectByVisibleText(LONG_WAIT,ddl_license_state,FilterDataReader.getTestData("license_state"));
            clickOnTheElement(LONG_WAIT,btn_compact_license);
             offerTabApplyActionInCandidatePage();
        }
    public void offerTab_Certifications(){
            offerTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_certifications,FilterDataReader.getTestData("certifications"));
            offerTabApplyActionInCandidatePage();
        }
    public void offerTab_AiScore_Location(){
            offerTabActionsInCandidatePage();
            selectByVisibleText(LONG_WAIT,ddl_AI_match_score,FilterDataReader.getTestData("AI_match_score"));
            selectByVisibleText(LONG_WAIT,ddl_candidate_location,FilterDataReader.getTestData("candidate_location"));
            offerTabApplyActionInCandidatePage();
        }
    public void offerTab_Date(){
            offerTabActionsInCandidatePage();
            clickOnTheElement(LONG_WAIT,ddl_date);
            clickOnTheElement(LONG_WAIT,ddl_start_date);
            offerTabApplyActionInCandidatePage();
        }
    public void offerTab_AllFilters(){
        offerTabActionsInCandidatePage();
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
        offerTabApplyActionInCandidatePage();
        }
    public void offerTab_AllFilters_Clear(){
            offerTabActionsInCandidatePage();
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

