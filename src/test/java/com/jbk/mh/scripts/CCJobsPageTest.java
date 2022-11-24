package com.jbk.mh.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.WebDriverBase;
import com.jbk.mh.pages.CCJobsPage;
import com.jbk.mh.pages.CCHomePage;

  public class CCJobsPageTest extends WebDriverBase{

	@Test(priority = 1)
	public void verifyJobsPageNavigation() throws Exception{
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  driver.close();
	 }
	
	
	 @Test(priority = 2)
	 public void verifySearchFields() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("JobsTab");
			  ccJobsPage.waitForCCJobsPageToLoad();
			  ccJobsPage.verifySearchFields();
			  driver.close();
	    }
	  
	
	@Test(priority = 3)
	public void verifyLocationAutoPopulateValue() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.getLocationDropdownValues();
		  driver.close();
    }
    

    @Test(priority = 4)
    public void verifyMilesDropDownValues() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.getMilesDropdownValues();
		  driver.close();
    }
    

    @Test(priority = 5)
    public void verifyJobsAvailableHeader() {
    	
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.verifyJobsHeader();
		  driver.close();
		 		  
    }
    
    @Test(priority = 6)
    public void verifyDisplayLatestJobs() {
    	
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.verifyJobsPostedDate();
		  driver.close();
		 		  
    }
    
    @Test(priority = 8)
    public void verifyDisplayJobDetails() {
    	
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.getJobDetails();
		  driver.close();
		 		  
    }
    
    
    @Test(priority = 9)
    public void verifyViewApplyButton() {
    	
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.verifyApplyNowButtonDisplayed();
		  driver.close();
		 		  
    }
    
    @Test(priority = 10)
    public void verifyFacebookIconPresence() {
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.verifyFacebookIconPresence();
		  driver.close();
    }


    @Test(priority = 11)
    public void verifyInstagramIconPresence() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.verifyInstagramIconPresence();
		  driver.close();
    }

   
    @Test(priority = 12)
    public void verifyFacebookNavigation() {
    	 WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.verifyFacebookNavigation();
		  driver.close();
    }


    @Test(priority = 13)
    public void verifyInstagramNavigation() {
    	 WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.verifyInstagramNavigation();
		  driver.close();
    }
    
    
    @Test(priority = 14)
    public void verifyPrivacyPolicyNavigation() {
    	 WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.verifyPrivacyPolicyNavigation();
		  driver.close();
    }

    
    @Test(priority = 15)
    public void verifyTermsOfServiceNavigation() {
    	 WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.verifyTermsOfServiceNavigation();
		  driver.close();
    }

    
    @Test(priority = 16)
    public void verifyCookiePolicyNavigation() {
    	 WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.verifyCookiePolicyNavigation();
		  driver.close();
    }
    
    
    @Test(priority = 17)
    public void verifyCopyRightFooter() {
    	 WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.verifyCopyRightFooter();
		  driver.close();
    }

	
    @Test(priority = 18)
    public void verifyJobsSearchByLocation() throws Exception {
    	 WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  ccJobsPage.searchByCityField("Ashburn, VA");
		  driver.close();
    }
    

    @Test(priority = 19)
    public void verifyJobsSearchByTitle() throws Exception {
    	 WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCJobsPage ccJobsPage=getPageFactory().getCCJobsPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("JobsTab");
		  ccJobsPage.waitForCCJobsPageToLoad();
		  String Title="Nurse";
		  ccJobsPage.getJobsTitleField().sendKeys(Title);
		  AtuReports.passResults1("Verify text is entered to " + Title + " textbox", Title,
					"Text '" + Title + "' should be entered in to " + Title + " textbox",
					"Text '" + Title + "' is entered in to " + Title + " textbox");

		  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + Title + " textbox",
					"Text '" + Title + "' should be entered in to " + Title + " textbox",
					"Text '" + Title + "' is entered in to " + Title + " textbox");
		  Thread.sleep(1000);
		  ccJobsPage.searchByCityField("Ashburn, GA");
		  
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
