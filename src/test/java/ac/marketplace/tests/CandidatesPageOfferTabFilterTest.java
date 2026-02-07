package ac.testingplace.tests;

import ac.testingplace.pages.CandidatePageOfferTabFilter;
import org.testng.Assert;
import org.testng.annotations.Test;

import static ac.testingplace.pages.BasePage.SHORT_WAIT;
import static ac.testingplace.pages.CandidateStagePage.*;

public class CandidatesPageOfferTabFilterTest extends BaseTest {

        @Test(description = "Validation of Candidate filter in Offer tab for Hiring Manager and Role ",
                            groups = {"sanity", "acceptance", "system"})
        public void OfferTab_HiringManager_Role(){
            CandidatePageOfferTabFilter candidateOfferFilter = new CandidatePageOfferTabFilter();
            candidateOfferFilter.offerTab_HiringManager_Role();
            Assert.assertTrue(candidateOfferFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateOfferFilter.isElementDisplayed(SHORT_WAIT,RegisteredNurseXPath()));
        }
        @Test(description = "Validation of Candidate filter in Offer tab for Speciality",
                           groups = {"sanity","acceptance","system"})
        public void offerTab_Speciality() {
            CandidatePageOfferTabFilter candidateOfferFilter = new CandidatePageOfferTabFilter();
            candidateOfferFilter.offerTab_Speciality();
            Assert.assertTrue(candidateOfferFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateOfferFilter.isElementDisplayed(SHORT_WAIT,AcuteCareXpath()));
        }
        @Test(description = "Validation of Candidate filter in Offer tab for Years Of Exp",
                            groups = {"sanity", "acceptance","system"})
        public void OfferTab_YearsOfExp() {
            CandidatePageOfferTabFilter candidateOfferFilter = new CandidatePageOfferTabFilter();
            candidateOfferFilter.offerTab_YearsOfExp();
            Assert.assertTrue(candidateOfferFilter.isElementDisplayed(SHORT_WAIT,TotalItems()));
        }
        @Test(description = "Validation of Candidate filter in Offer tab for Current Company and Degree",
                            groups = {"sanity","acceptance","system"})
        public void OfferTab_CurrentCompany_Degree() {
            CandidatePageOfferTabFilter candidateOfferFilter = new CandidatePageOfferTabFilter();
            candidateOfferFilter.offerTab_CurrentCompany_Degree();
           Assert.assertFalse(candidateOfferFilter.isElementDisplayed(SHORT_WAIT,noProfile()));
        }
        @Test(description = "Validation of Candidate filter in Offer tab for License",
                            groups = {"sanity","acceptance","system"})
        public void OfferTab_License() {
            CandidatePageOfferTabFilter candidateOfferFilter = new CandidatePageOfferTabFilter();
            candidateOfferFilter.offerTab_License();
            Assert.assertTrue(candidateOfferFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateOfferFilter.isElementDisplayed(SHORT_WAIT,FerrariEnzo()));

        }
        @Test(description = "Validation of Candidate filter in Offer tab for Certifications ",
                          groups = {"sanity","acceptance","system"})
        public void OfferTab_Certifications() {
            CandidatePageOfferTabFilter candidateOfferFilter = new CandidatePageOfferTabFilter();
            candidateOfferFilter.offerTab_Certifications();
            Assert.assertTrue(candidateOfferFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateOfferFilter.isElementDisplayed(SHORT_WAIT,FerrariEnzo()));
        }
        @Test(description = "Validation of Candidate filter in Offer tab for Ai Score and Location",
                          groups = {"sanity","acceptance","system"})
        public void OfferTab_AiScore_Location() {
            CandidatePageOfferTabFilter candidateOfferFilter = new CandidatePageOfferTabFilter();
            candidateOfferFilter.offerTab_AiScore_Location();
            Assert.assertTrue(candidateOfferFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateOfferFilter.isElementDisplayed(SHORT_WAIT,FerrariEnzo()));
        }
        @Test(description = "Validation of Candidate filter in Offer tab for Date",
                          groups = {"sanity","acceptance","system"})
        public void OfferTab_Date() {
            CandidatePageOfferTabFilter candidateOfferFilter = new CandidatePageOfferTabFilter();
            candidateOfferFilter.offerTab_Date();
            Assert.assertTrue(candidateOfferFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateOfferFilter.isElementDisplayed(SHORT_WAIT,FerrariEnzo()));
        }
        @Test(description = "Validation of All Candidate filter in Offer tab",groups = {"sanity","acceptance","system"})
        public void OfferTab_AllFilters() {
            CandidatePageOfferTabFilter candidateOfferFilter = new CandidatePageOfferTabFilter();
            candidateOfferFilter.offerTab_AllFilters();
            Assert.assertFalse(candidateOfferFilter.isElementDisplayed(SHORT_WAIT,noProfile()));
        }
        @Test(description = "Validation of All Candidate filter in Offer tab and then clear",
                             groups = {"sanity","acceptance","system"} )
        public void OfferTab_AllFilters_Clear() {
            CandidatePageOfferTabFilter candidateOfferFilter = new CandidatePageOfferTabFilter();
            candidateOfferFilter.offerTab_AllFilters_Clear();
            Assert.assertTrue(candidateOfferFilter.isElementDisplayed(SHORT_WAIT,TotalItems()) &&
                    candidateOfferFilter.isElementDisplayed(SHORT_WAIT,FerrariEnzo()));
        }
    }

