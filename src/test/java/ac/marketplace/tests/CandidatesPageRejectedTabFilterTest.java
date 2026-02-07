package ac.testingplace.tests;

import ac.testingplace.pages.CandidatePageRejectedTabFilter;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import static ac.testingplace.pages.BasePage.SHORT_WAIT;
import static ac.testingplace.pages.CandidateStagePage.*;

public class CandidatesPageRejectedTabFilterTest extends BaseTest{
        @Test(description = "Validation of Candidate filter in Rejected tab for Hiring Manager and Role ",
                groups = {"sanity", "acceptance", "system"})
        public void RejectedTab_HiringManager_Role() {
           CandidatePageRejectedTabFilter candidateRejectedFilter = new CandidatePageRejectedTabFilter();
           candidateRejectedFilter.rejectedTab_HiringManager_Role();
           Assert.assertTrue(candidateRejectedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) && candidateRejectedFilter.isElementDisplayed(SHORT_WAIT,RegisteredNurseXPath()));
       }
        @Test(description = "Validation of Candidate filter in Rejected tab for Speciality",groups = {"sanity","acceptance","system"})
        public void RejectedTab_Speciality() {
            CandidatePageRejectedTabFilter candidateRejectedFilter = new CandidatePageRejectedTabFilter();
            candidateRejectedFilter.rejectedTab_Speciality();
            Assert.assertTrue(candidateRejectedFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateRejectedFilter.isElementDisplayed(SHORT_WAIT,AcuteCareXpath()));
        }
        @Test(description = "Validation of Candidate filter in Rejected tab for Years Of Exp",groups = {"sanity","acceptance","system"})
        public void RejectedTab_YearsOfExp() {
            CandidatePageRejectedTabFilter candidateRejectedFilter = new CandidatePageRejectedTabFilter();
            candidateRejectedFilter.rejectedTab_YearsOfExp();
            Assert.assertFalse(candidateRejectedFilter.isElementDisplayed(SHORT_WAIT,TotalItems())&& candidateRejectedFilter.isElementDisplayed(SHORT_WAIT,BugattiEttores()));
        }
        @Test(description = "Validation of Candidate filter in Rejected tab for Current Company and Degree",groups = {"sanity","acceptance","system"})
        public void RejectedTab_CurrentCompany_Degree() {
            CandidatePageRejectedTabFilter candidateRejectedFilter = new CandidatePageRejectedTabFilter();
            candidateRejectedFilter.rejectedTab_CurrentCompany_Degree();
            Assert.assertTrue(candidateRejectedFilter.isElementDisplayed(Duration.ofSeconds(2), By.xpath("//span[contains(text(),'No search results matching your criteria. Kindly u')]")));
        }
        @Test(description = "Validation of Candidate filter in Rejected tab for License",groups = {"sanity","acceptance","system"})
        public void RejectedTab_License() {
            CandidatePageRejectedTabFilter candidateRejectedFilter = new CandidatePageRejectedTabFilter();
            candidateRejectedFilter.rejectedTab_License();
            Assert.assertFalse(candidateRejectedFilter.isElementDisplayed(Duration.ofSeconds(2), By.xpath("//span[contains(text(),'No search results matching your criteria. Kindly u')]")));
        }
        @Test(description = "Validation of Candidate filter in Rejected tab for Certifications ",groups = {"sanity","acceptance","system"})
        public void RejectedTab_Certifications() {
            CandidatePageRejectedTabFilter candidateRejectedFilter = new CandidatePageRejectedTabFilter();
            candidateRejectedFilter.rejectedTab_Certifications();
            Assert.assertFalse(candidateRejectedFilter.isElementDisplayed(Duration.ofSeconds(2), By.xpath("//span[contains(text(),'No search results matching your criteria. Kindly u')]")));
        }
        @Test(description = "Validation of Candidate filter in Rejected tab for Ai Score and Location",groups = {"sanity","acceptance","system"})
        public void RejectedTab_AiScore_Location() {
            CandidatePageRejectedTabFilter candidateRejectedFilter = new CandidatePageRejectedTabFilter();
            candidateRejectedFilter.rejectedTab_AiScore_Location();
            Assert.assertTrue(candidateRejectedFilter.isElementDisplayed(Duration.ofSeconds(2), By.xpath("//span[contains(text(),'No search results matching your criteria. Kindly u')]")));
        }
        @Test(description = "Validation of Candidate filter in Rejected tab for Date",groups = {"sanity","acceptance","system"})
        public void RejectedTab_Date() {
            CandidatePageRejectedTabFilter candidateRejectedFilter = new CandidatePageRejectedTabFilter();
            candidateRejectedFilter.rejectedTab_Date();
            Assert.assertFalse(candidateRejectedFilter.isElementDisplayed(Duration.ofSeconds(2), By.xpath("//span[contains(text(),'No search results matching your criteria. Kindly u')]")));
       }

        @Test(description = "Validation of All Candidate filter in Rejected tab",groups = {"sanity","acceptance","system"} )
        public void RejectedTab_AllFilters() {
            CandidatePageRejectedTabFilter candidateRejectedFilter = new CandidatePageRejectedTabFilter();
            candidateRejectedFilter.rejectedTab_AllFilters();
            Assert.assertTrue(candidateRejectedFilter.isElementDisplayed(Duration.ofSeconds(2), By.xpath("//span[contains(text(),'No search results matching your criteria. Kindly u')]")));
        }
        @Test(description = "Validation of All Candidate filter in Rejected tab and then clear",groups = {"sanity","acceptance","system"} )
        public void RejectedTab_AllFilters_Clear() {
            CandidatePageRejectedTabFilter candidateRejectedFilter = new CandidatePageRejectedTabFilter();
            candidateRejectedFilter.rejectedTab_AllFilters_Clear();
            Assert.assertFalse(candidateRejectedFilter.isElementDisplayed(Duration.ofSeconds(2), By.xpath("//span[contains(text(),'No search results matching your criteria. Kindly u')]")));
        }
    }