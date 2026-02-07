package ac.testingplace.tests;

import ac.testingplace.pages.CandidatePageSubmittedTabFilter;
import org.testng.Assert;
import org.testng.annotations.Test;

import static ac.testingplace.pages.CandidateStagePage.*;
import static ac.testingplace.pages.CandidateStagePage.noProfile;
public class CandidatesPageSubmittedTabFilterTest extends BaseTest {
    @Test(description = "Validation of Candidate filter in Submitted tab for Hiring Manager and Role ", groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_HiringManager_Role() {
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_HiringManager_Role();
        Assert.assertTrue(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
               candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,RegisteredNurseXPath()));
 }
    @Test(description = "Validation of Candidate filter in Submitted tab for Speciality", groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_Speciality() {
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_Speciality();
        Assert.assertTrue(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,AcuteCareXpath()));
    }
    @Test(description = "Validation of Candidate filter in Submitted tab for Years Of Exp", groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_YearsOfExp() {
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_YearsOfExp();
        Assert.assertTrue(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()));}
    @Test(description = "Validation of Candidate filter in Submitted tab for Current Company and Degree", groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_CurrentCompany_Degree() {
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_CurrentCompany_Degree();
        Assert.assertTrue(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,LamborghiniFerruccio()));
        }
    @Test(description = "Validation of Candidate filter in Submitted tab for License", groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_License() {
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_License();
        Assert.assertTrue(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,LamborghiniFerruccio()));    }
    @Test(description = "Validation of Candidate filter in Submitted tab for Certifications ", groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_Certifications() {
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_Certifications();
        Assert.assertTrue(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,LamborghiniFerruccio()));    }

    @Test(description = "Validation of Candidate filter in Submitted tab for Ai Score and Location", groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_AiScore_Location() {
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_AiScore_Location();
        Assert.assertTrue(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,LamborghiniFerruccio())); }

    @Test(description = "Validation of Candidate filter in Submitted tab for Date", groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_Date() {
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_Date();
        Assert.assertTrue(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,LamborghiniFerruccio()));
    }
    @Test(description = "Validation of All Candidate filter in Submitted tab", groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_AllFilters() {
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_AllFilters();
        Assert.assertTrue(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,LamborghiniFerruccio()));    }
    @Test(description = "Validation of All Candidate filter in Submitted tab and then clear", groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_AllFilters_Clear() {
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_AllFilters_Clear();
        Assert.assertTrue(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,LamborghiniFerruccio()));
    }
    @Test(description="Validation of Search Field With Candidate Name",groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_SearchField_CandidateName(){
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
       candidateSubmittedFilter.submittedTab_SearchWithCandidateName();
       Assert.assertTrue(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,LamborghiniFerruccio()));

       }
    @Test(description="Validation of Search Field With Lower Case Letters",groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_SearchField_CandidateNameLowerCaseLetter(){
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_SearchWithLowerCaseLetters();
    }
    @Test(description="Validation of Search Field With Upper Case Letters",groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_SearchField_WithUpperCaseLetters(){
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_SearchWithUpperCaseLetters();
    }
    @Test(description="Validation of Search Field With Designation",groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_SearchField_WithDesignation(){
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_SearchWithDesignation();
    }
    @Test(description="Validation of Search Field With Free Text",groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_SearchField_WithRandomText(){
        CandidatePageSubmittedTabFilter candidateSubmittedFilter = new CandidatePageSubmittedTabFilter();
        candidateSubmittedFilter.submittedTab_SearchWithRandomText();
        Assert.assertFalse(candidateSubmittedFilter.isElementDisplayed(SHORT_WAIT,noProfile()));
    }

}