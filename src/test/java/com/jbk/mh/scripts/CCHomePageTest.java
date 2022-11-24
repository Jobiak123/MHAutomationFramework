package com.jbk.mh.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.WebDriverBase;
import com.jbk.mh.pages.CCHomePage;
import com.jbk.mh.pages.CCJobsPage;

public class CCHomePageTest extends WebDriverBase{
	
	
	
	@Test(priority = 1)
	public void verifyLoadingHomePage() throws Exception{
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  driver.close();
		
	}
	
	@Test(priority = 2)
	public void verifyPresenceofTabs() {
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyPresenceofTabs();
		  driver.close();
	}

    @Test(priority = 3)
    public void verifyJobsAvailableHeader() {
    	
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyJobsHeader();
		  driver.close();
		 		  
    }
	
    @Test(priority = 4)
    public void verifyTagLine() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyJobsTagLine();
		  driver.close();
    }

    
    @Test(priority = 5)
    public void verifySearchFields() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifySearchFields();
		  driver.close();
    }

    
   @Test(priority = 6)
    public void verifyLocationAutoPopulateValue() throws Exception {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.getLocationDropdownValues();
		  driver.close();
    }
    

    @Test(priority = 7)
    public void verifyMilesDropDownValues() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.getMilesDropdownValues();
		  driver.close();
    }
    
    
    @Test(priority = 8)
    public void verifyTrendindSearches() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyTrendingSearches();
		  driver.close();
    }
    

    @Test(priority = 9)
    public void verifyTrendingSearchLink() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyTrendingSearchLink();
		  driver.close();
    }


    @Test(priority = 10)
    public void verifyViewMoreJobsLink() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyViewMoreJobsLink();
		  driver.close();
    }

    
    @Test(priority = 11)
    public void verifyCompaniesScrolling() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyCompaniesLogoScrolling();
		  driver.close();
    }


    @Test(priority = 12)
    public void verifyViewMoreCompanyJobsLink() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyViewMoreCompanyJobsLink();
		  driver.close();
    }

    
    @Test(priority = 13)
    public void verifyFacebookIconPresence() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyFacebookIconPresence();
		  driver.close();
    }


    @Test(priority = 14)
    public void verifyInstagramIconPresence() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyInstagramIconPresence();
		  driver.close();
    }

   
    @Test(priority = 15)
    public void verifyFacebookNavigation() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyFacebookIconNavigation();
		  driver.close();
    }


    @Test(priority = 16)
    public void verifyInstagramNavigation() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyInstagramIconNavigation();
		  driver.close();
    }
    
    
    @Test(priority = 17)
    public void verifyPrivacyPolicyNavigation() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyPrivacyPolicyNavigation();
		  driver.close();
    }

    
    @Test(priority = 18)
    public void verifyTermsOfServiceNavigation() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyTermsOfServiceNavigation();
		  driver.close();
    }

    
    @Test(priority = 19)
    public void verifyCookiePolicyNavigation() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyCookiePolicyNavigation();
		  driver.close();
    }
    
    
    @Test(priority = 20)
    public void verifyCopyRightFooter() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.verifyCopyRightFooter();
		  driver.close();
    }
    
    

    @Test(priority = 21)
    public void verifyJobsSearchByLocation() throws Exception {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.searchByCityField("Ashburn, VA");
		  driver.close();
    }
    

    @Test(priority = 22)
    public void verifyJobsSearchByTitle() throws Exception {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage();
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  String Title="Nurse";
		  ccHomePage.getJobsTitleField().sendKeys(Title);
		  AtuReports.passResults1("Verify text is entered to " + Title + " textbox", Title,
					"Text '" + Title + "' should be entered in to " + Title + " textbox",
					"Text '" + Title + "' is entered in to " + Title + " textbox");

		  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + Title + " textbox",
					"Text '" + Title + "' should be entered in to " + Title + " textbox",
					"Text '" + Title + "' is entered in to " + Title + " textbox");
		  Thread.sleep(1000);
		  ccHomePage.searchByCityField("Ashburn, GA");
		  
		  String Jobtitle=ccJobsPage.getJobsTitleField().getAttribute("value");
		  if(Jobtitle.equals(Title)) {
			  System.out.println("Job title is ::"+ Jobtitle );
			 }
		  
		  String JobTitle=ccJobsPage.getJobTitle().getText();
		  System.out.println("Job Title is ::"+ JobTitle );
		  String JobLocation=ccJobsPage.getJobLocation().getText();
		  System.out.println("Job Location is ::"+ JobLocation );
		  driver.close();
    }
    
    

}
