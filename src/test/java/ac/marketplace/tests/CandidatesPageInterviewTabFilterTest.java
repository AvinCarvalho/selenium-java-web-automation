package ac.testingplace.tests;

import ac.testingplace.pages.CandidatePageInterviewTabFilter;
import org.testng.Assert;
import org.testng.annotations.Test;

import static ac.testingplace.pages.BasePage.SHORT_WAIT;
import static ac.testingplace.pages.CandidateStagePage.*;

public class CandidatesPageInterviewTabFilterTest extends BaseTest{
    @Test(description = "Validation of Candidate filter in Interview tab for Hiring Manager and Role ",
                groups = {"sanity", "acceptance", "system"})
        public void InterviewTab_HiringManager_Role() {
        CandidatePageInterviewTabFilter candidateInterviewFilter = new CandidatePageInterviewTabFilter();
            candidateInterviewFilter.interviewTab_HiringManager_Role();
        Assert.assertTrue(candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,RegisteredNurseXPath()));
    }
        @Test(description = "Validation of Candidate filter in Interview tab for Speciality",groups = {"sanity","acceptance","system"})
        public void InterviewTab_Speciality() {
            CandidatePageInterviewTabFilter candidateInterviewFilter = new CandidatePageInterviewTabFilter();
            candidateInterviewFilter.interviewTab_Speciality();
            Assert.assertTrue(candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,AcuteCareXpath()));
    }
        @Test(description = "Validation of Candidate filter in Interview tab for Years Of Exp",groups = {"sanity","acceptance","system"})
        public void InterviewTab_YearsOfExp() {
            CandidatePageInterviewTabFilter candidateInterviewFilter = new CandidatePageInterviewTabFilter();
            candidateInterviewFilter.interviewTab_YearsOfExp();
            Assert.assertTrue(candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,TotalItems()));
    }
        @Test(description = "Validation of Candidate filter in Interview tab for Current Company and Degree",groups = {"sanity","acceptance","system"})
        public void InterviewTab_CurrentCompany_Degree() {
            CandidatePageInterviewTabFilter candidateInterviewFilter = new CandidatePageInterviewTabFilter();
            candidateInterviewFilter.interviewTab_CurrentCompany_Degree();
            Assert.assertTrue(candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,DatsunAikawa()));
        }
        @Test(description = "Validation of Candidate filter in Interview tab for License",groups = {"sanity","acceptance","system"})
        public void InterviewTab_License() {
            CandidatePageInterviewTabFilter candidateInterviewFilter = new CandidatePageInterviewTabFilter();
            candidateInterviewFilter.interviewTab_License();
            Assert.assertTrue(candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,DatsunAikawa()));
    }
        @Test(description = "Validation of Candidate filter in Interview tab for Certifications ",groups = {"sanity","acceptance","system"})
        public void InterviewTab_Certifications() {
            CandidatePageInterviewTabFilter candidateInterviewFilter = new CandidatePageInterviewTabFilter();
            candidateInterviewFilter.interviewTab_Certifications();
            Assert.assertTrue(candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,DatsunAikawa()));
    }
        @Test(description = "Validation of Candidate filter in Interview tab for Ai Score and Location",groups = {"sanity","acceptance","system"})
        public void InterviewTab_AiScore_Location() {
            CandidatePageInterviewTabFilter candidateInterviewFilter = new CandidatePageInterviewTabFilter();
            candidateInterviewFilter.interviewTab_AiScore_Location();
            Assert.assertTrue(candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,DatsunAikawa()));
    }

        @Test(description = "Validation of Candidate filter in Interview tab for Date",groups = {"sanity","acceptance","system"})
        public void InterviewTab_Date() {
            CandidatePageInterviewTabFilter candidateInterviewFilter = new CandidatePageInterviewTabFilter();
            candidateInterviewFilter.interviewTab_Date();
            Assert.assertTrue(candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,DatsunAikawa()));
    }
        @Test(description = "Validation of All Candidate filter in Interview tab",groups = {"sanity","acceptance","system"} )
        public void InterviewTab_AllFilters(){
            CandidatePageInterviewTabFilter candidateInterviewFilter = new CandidatePageInterviewTabFilter();
            candidateInterviewFilter.interviewTab_AllFilters();
            Assert.assertTrue(candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,DatsunAikawa()));
    }
        @Test(description = "Validation of All Candidate filter in Interview tab and then clear",groups = {"sanity","acceptance","system"} )
        public void InterviewTab_AllFilters_Clear() {
            CandidatePageInterviewTabFilter candidateInterviewFilter = new CandidatePageInterviewTabFilter();
            candidateInterviewFilter.interviewTab_AllFilters_Clear();
            Assert.assertTrue(candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateInterviewFilter.isElementDisplayed(SHORT_WAIT,DatsunAikawa()));
    }
    }
