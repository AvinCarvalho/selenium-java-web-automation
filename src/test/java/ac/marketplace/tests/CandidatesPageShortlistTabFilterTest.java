package ac.testingplace.tests;

import ac.testingplace.pages.CandidatePageShortlistTabFilter;
import ac.testingplace.pages.CandidatePageSubmittedTabFilter;
import org.testng.Assert;
import org.testng.annotations.Test;

import static ac.testingplace.pages.BasePage.SHORT_WAIT;
import static ac.testingplace.pages.CandidateStagePage.*;

public class CandidatesPageShortlistTabFilterTest extends BaseTest {

    @Test(description = "Validation of Candidate filter in Shortlist tab for Hiring Manager and Role ",
            groups = {"sanity", "acceptance", "system"})
    public void ShortlistTab_HiringManager_Role() {
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_HiringManager_Role();
        Assert.assertTrue(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,RegisteredNurseXPath()));
    }
    @Test(description = "Validation of Candidate filter in Shortlist tab for Speciality",groups = {"sanity","acceptance","system"})
    public void ShortListTab_Speciality() {
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_Speciality();
        Assert.assertTrue(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,AcuteCareXpath()));
    }
    @Test(description = "Validation of Candidate filter in Shortlist tab for Years Of Exp",groups = {"sanity","acceptance","system"})
     public void ShortlistTab_YearsOfExp() {
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_YearsOfExp();
        Assert.assertTrue(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,TotalItems()));
    }
    @Test(description = "Validation of Candidate filter in Shortlist tab for Current Company and Degree",groups = {"sanity","acceptance","system"})
    public void ShortlistTab_CurrentCompany_Degree() {
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_CurrentCompany_Degree();
        Assert.assertTrue(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,RogersSteve()));
    }
    @Test(description = "Validation of Candidate filter in Shortlist tab for License",groups = {"sanity","acceptance","system"})
    public void ShortlistTab_License() {
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_License();
        Assert.assertTrue(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,RogersSteve()));
    }
    @Test(description = "Validation of Candidate filter in Shortlist tab for Certifications ",groups = {"sanity","acceptance","system"})
    public void ShortlistTab_Certifications() {
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_Certifications();
        Assert.assertTrue(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,RogersSteve()));
    }
    @Test(description = "Validation of Candidate filter in Shortlist tab for Ai Score and Location",groups = {"sanity","acceptance","system"})
    public void ShortlistTab_AiScore_Location() {
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_AiScore_Location();
        Assert.assertFalse(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,noProfile()));
    }
    @Test(description = "Validation of Candidate filter in Shortlist tab for Date",groups = {"sanity","acceptance","system"})
    public void ShortlistTab_Date() {
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_Date();
        Assert.assertTrue(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,RogersSteve()));
    }
    @Test(description = "Validation of All Candidate filter in Shortlist tab",groups = {"sanity","acceptance","system"} )
    public void ShortlistTab_AllFilters() {
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_AllFilters();
        Assert.assertTrue(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,RogersSteve()));
    }
    @Test(description = "Validation of All Candidate filter in Shortlist tab and then clear",groups = {"sanity","acceptance","system"} )
    public void ShortlistTab_AllFilters_Clear() {
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_AllFilters_Clear();
        Assert.assertTrue(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,RogersSteve()));
    }
    @Test(description="Validation of Search Field With Candidate Name",groups = {"sanity", "acceptance", "system"})
    public void SubmittedTab_SearchField_CandidateName(){
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_SearchWithCandidateName();
        Assert.assertTrue(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,LamborghiniFerruccio()));

    }
    @Test(description="Validation of Search Field With Lower Case letters",groups = {"sanity", "acceptance", "system"})
    public void ShortlistTab_SearchField_CandidateNameLowerCaseLetter(){
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_SearchWithLowerCaseLetters();
    }
    @Test(description="Validation of Search Field With Upper Case Letters",groups = {"sanity", "acceptance", "system"})
    public void ShortlistTab_SearchField_WithUpperCaseLetters(){
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_SearchWithUpperCaseLetters();
    }
    @Test(description="Validation of Search Field With Designation",groups = {"sanity", "acceptance", "system"})
    public void ShortlistTab_SearchField_WithDesignation(){
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_SearchWithDesignation();
    }
    @Test(description="Validation of Search Field With Free Text",groups = {"sanity", "acceptance", "system"})
    public void ShortlistTab_SearchField_WithRandomText(){
        CandidatePageShortlistTabFilter candidateShortlistFilter = new CandidatePageShortlistTabFilter();
        candidateShortlistFilter.shortlistTab_SearchWithRandomText();
        Assert.assertFalse(candidateShortlistFilter.isElementDisplayed(SHORT_WAIT,noProfile()));
    }
}



