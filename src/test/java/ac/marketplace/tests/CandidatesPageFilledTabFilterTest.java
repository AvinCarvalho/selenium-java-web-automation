package ac.testingplace.tests;

import ac.testingplace.pages.CandidatePageFilledTabFilter;
import org.testng.Assert;
import org.testng.annotations.Test;

import static ac.testingplace.pages.BasePage.SHORT_WAIT;
import static ac.testingplace.pages.CandidateStagePage.*;

public class CandidatesPageFilledTabFilterTest extends BaseTest {
        @Test(description = "Validation of Candidate filter in Filled tab for Hiring Manager and Role ",
                groups = {"sanity", "acceptance", "system"})
        public void FilledTab_HiringManager_Role() {
            CandidatePageFilledTabFilter candidateFilledFilter = new CandidatePageFilledTabFilter();
            candidateFilledFilter.filledTab_HiringManager_Role();
            Assert.assertTrue(candidateFilledFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateFilledFilter.isElementDisplayed(SHORT_WAIT,RegisteredNurseXPath()));
        }
        @Test(description = "Validation of Candidate filter in Filled tab for Speciality",groups = {"sanity","acceptance","system"})
        public void FilledTab_Speciality() {
            CandidatePageFilledTabFilter candidateFilledFilter = new CandidatePageFilledTabFilter();
            candidateFilledFilter.filledTab_Speciality();
            Assert.assertTrue(candidateFilledFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateFilledFilter.isElementDisplayed(SHORT_WAIT,AcuteCareXpath()));
        }
        @Test(description = "Validation of Candidate filter in Filled tab for Years Of Exp",groups = {"sanity","acceptance","system"})
        public void FilledTab_YearsOfExp() {
            CandidatePageFilledTabFilter candidateFilledFilter = new CandidatePageFilledTabFilter();
            candidateFilledFilter.filledTab_YearsOfExp();
            Assert.assertTrue(candidateFilledFilter.isElementDisplayed(SHORT_WAIT,TotalItems()));
        }
        @Test(description = "Validation of Candidate filter in Filled tab for Current Company and Degree",groups = {"sanity","acceptance","system"})
        public void FilledTab_CurrentCompany_Degree() {
            CandidatePageFilledTabFilter candidateFilledFilter = new CandidatePageFilledTabFilter();
            candidateFilledFilter.filledTab_CurrentCompany_Degree();
            Assert.assertTrue(candidateFilledFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateFilledFilter.isElementDisplayed(SHORT_WAIT,AstonStroll()));
        }
        @Test(description = "Validation of Candidate filter in Filled tab for License",groups = {"sanity","acceptance","system"})
        public void FilledTab_License() {
            CandidatePageFilledTabFilter candidateFilledFilter = new CandidatePageFilledTabFilter();
            candidateFilledFilter.filledTab_License();
            Assert.assertTrue(candidateFilledFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateFilledFilter.isElementDisplayed(SHORT_WAIT,AstonStroll()));
        }
        @Test(description = "Validation of Candidate filter in Filled tab for Certifications ",groups = {"sanity","acceptance","system"})
        public void FilledTab_Certifications() {
            CandidatePageFilledTabFilter candidateFilledFilter = new CandidatePageFilledTabFilter();
            candidateFilledFilter.filledTab_Certifications();
            Assert.assertTrue(candidateFilledFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateFilledFilter.isElementDisplayed(SHORT_WAIT,AstonStroll()));
        }
        @Test(description = "Validation of Candidate filter in Filled tab for Ai Score and Location",groups = {"sanity","acceptance","system"})
        public void FilledTab_AiScore_Location() {
            CandidatePageFilledTabFilter candidateFilledFilter = new CandidatePageFilledTabFilter();
            candidateFilledFilter.filledTab_AiScore_Location();
            Assert.assertTrue(candidateFilledFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateFilledFilter.isElementDisplayed(SHORT_WAIT,AstonStroll()));
        }
        @Test(description = "Validation of Candidate filter in Filled tab for Date",groups = {"sanity","acceptance","system"})
        public void FilledTab_Date() {
                CandidatePageFilledTabFilter candidateFilledFilter = new CandidatePageFilledTabFilter();
                candidateFilledFilter.filledTab_Date();
            Assert.assertTrue(candidateFilledFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateFilledFilter.isElementDisplayed(SHORT_WAIT,AstonStroll()));
        }
        @Test(description = "Validation of All Candidate filter in Filled tab",groups = {"sanity","acceptance","system"} )
        public void FilledTab_AllFilters() {
            CandidatePageFilledTabFilter candidateFilledFilter = new CandidatePageFilledTabFilter();
            candidateFilledFilter.filledTab_AllFilters();
            Assert.assertTrue(candidateFilledFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateFilledFilter.isElementDisplayed(SHORT_WAIT,AstonStroll()));
        }
        @Test(description = "Validation of All Candidate filter in Filled tab and then clear",groups = {"sanity","acceptance","system"} )
        public void FilledTab_AllFilters_Clear() {
            CandidatePageFilledTabFilter candidateFilledFilter = new CandidatePageFilledTabFilter();
            candidateFilledFilter.filledTab_AllFilters_Clear();
            Assert.assertTrue(candidateFilledFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateFilledFilter.isElementDisplayed(SHORT_WAIT,AstonStroll()));
        }
    }

