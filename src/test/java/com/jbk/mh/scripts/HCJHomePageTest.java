package com.jbk.mh.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.WebDriverBase;
import com.jbk.mh.pages.HCJContactPage;
import com.jbk.mh.pages.HCJHomePage;

public class HCJHomePageTest extends WebDriverBase{
	
	
	@Test(priority = 1)
	public void verifyLoadingHomePage() throws Exception{
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  driver.close();
		
	}
	
	@Test(priority = 2)
	public void verifyPresenceofTabs() {
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifyPresenceofTabs();
		  driver.close();
	}

    @Test(priority = 3)
    public void verifyJobsAvailableHeader() {
    	
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifyJobsHeader();
		  driver.close();
		 		  
    }
	
    @Test(priority = 4)
    public void verifyTagLine() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifyJobsTagLine();
		  driver.close();
    }

    
    @Test(priority = 5)
    public void verifySearchFields() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifySearchFields();
		  driver.close();
    }
    
    
    @Test(priority = 6)
    public void verifyJobsSearchByLocation() throws Exception {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.searchByCityField("Ashburn, VA");
		  Thread.sleep(1000);
		  driver.close();
    }
    

    @Test(priority = 7)
    public void verifyJobsSearchByTitle() throws Exception {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  String Title="Nurse";
		  hcjHomePage.getJobsTitleField().sendKeys(Title);
		  AtuReports.passResults1("Verify text is entered to " + Title + " textbox", Title,
					"Text '" + Title + "' should be entered in to " + Title + " textbox",
					"Text '" + Title + "' is entered in to " + Title + " textbox");

		  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + Title + " textbox",
					"Text '" + Title + "' should be entered in to " + Title + " textbox",
					"Text '" + Title + "' is entered in to " + Title + " textbox");
		  Thread.sleep(1000);
		  hcjHomePage.searchByCityField("Ashburn, GA");
		  Thread.sleep(3000);
		  driver.close();
    }


    @Test(priority = 8)
    public void verifyTwitterIconPresence() {
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifyTwitterIconPresence();
		  driver.close();
    }


    @Test(priority = 9)
    public void verifyLinkedInIconPresence() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifyLinkedInIconPresence();
		  driver.close();
    }

   
    @Test(priority = 10)
    public void verifyTwitterNavigation() {
    	 WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifyTwitterNavigation();
		  driver.close();
    }


    @Test(priority = 11)
    public void verifyLinkedInNavigation() {
    	 WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifyLinkedInNavigation();
		  driver.close();
    }

          
    @Test(priority = 12)
    public void verifyPrivacyPolicyNavigation() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifyPrivacyPolicyNavigation();
		  driver.close();
    }

    
    @Test(priority = 13)
    public void verifyTermsOfServiceNavigation() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifyTermsOfServiceNavigation();
		  driver.close();
    }

    
    @Test(priority = 14)
    public void verifyCookiePolicyNavigation() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifyCookiePolicyNavigation();
		  driver.close();
    }
    
    
    @Test(priority = 15)
    public void verifyCopyRightFooter() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.verifyCopyRightFooter();
		  driver.close();
    }
    
    
    @Test(priority = 16)
    public void verifyLocationAutoPopulateValue() throws Exception {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.getLocationDropdownValues();
		  driver.close();
    }
    

    @Test(priority = 17)
    public void verifyMilesDropDownValues() {
    	  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.getMilesDropdownValues();
		  driver.close();
    }
    

    
    

}
