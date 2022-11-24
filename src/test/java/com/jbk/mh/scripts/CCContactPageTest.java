package com.jbk.mh.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.WebDriverBase;
import com.jbk.mh.pages.CCContactPage;
import com.jbk.mh.pages.CCHomePage;

public class CCContactPageTest extends WebDriverBase {
	
	
	   @Test(priority = 1)
	    public void verifyContactPageNavigation() throws Exception{
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("ContactTab");
		  ccContactPage.waitForCCContactPageToLoad();
		  driver.close();
	 
	}
	
	
	    @Test(priority = 2)
	    public void verifyContactPageHeader() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  ccContactPage.verifyContactPageHeader();
			  driver.close();
	    }
	 
	 
	    @Test(priority = 3)
	    public void verifyContactUsDetails() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  ccContactPage.verifyContactPageDetails();
			  driver.close();
	    }
	
	
	 @Test(priority = 4)
	    public void verifyEnterContactFirstName() throws Exception {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  String FName="Jobiak";
			  ccContactPage.getContactPageFirstName().sendKeys(FName);
			  AtuReports.passResults1("Verify text is entered to " + FName + " textbox", FName,
						"Text '" + FName + "' should be entered in to " + FName + " textbox",
						"Text '" + FName + "' is entered in to " + FName + " textbox");

			  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + FName + " textbox",
						"Text '" + FName + "' should be entered in to " + FName + " textbox",
						"Text '" + FName + "' is entered in to " + FName + " textbox");
			  Thread.sleep(1000);
			  driver.close();
	    }
	
	 

	 @Test(priority = 5)
	    public void verifyEnterContactLastName() throws Exception {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  String LName="Medichire";
			  ccContactPage.getContactPageLastName().sendKeys(LName);
			  AtuReports.passResults1("Verify text is entered to " + LName + " textbox", LName,
						"Text '" + LName + "' should be entered in to " + LName + " textbox",
						"Text '" + LName + "' is entered in to " + LName + " textbox");

			  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + LName + " textbox",
						"Text '" + LName + "' should be entered in to " + LName + " textbox",
						"Text '" + LName + "' is entered in to " + LName + " textbox");
			  Thread.sleep(1000);
			  driver.close();
	    }
	

	 
	 @Test(priority = 6)
	    public void verifyEnterContactEmail()throws Exception {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  String Email="Jobiak@medichire.ai";
			  ccContactPage.getContactPageEmail().sendKeys(Email);
			  AtuReports.passResults1("Verify text is entered to " + Email + " textbox", Email,
						"Text '" + Email + "' should be entered in to " + Email + " textbox",
						"Text '" + Email + "' is entered in to " + Email + " textbox");

			  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + Email + " textbox",
						"Text '" + Email + "' should be entered in to " + Email + " textbox",
						"Text '" + Email + "' is entered in to " + Email + " textbox");
			  Thread.sleep(1000);
			  driver.close();
	    }
	
	 

	 @Test(priority = 7)
	    public void verifyContactUsDetailsSubmission()throws Exception {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  Thread.sleep(1000);
			  ccContactPage.verifyEnterContactUsDetails();
			  driver.close();
	    }
	
	 
	 @Test(priority = 9)
	    public void verifyFacebookIconPresence() {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  ccContactPage.verifyFacebookIconPresence();
			  driver.close();
	    }


	    @Test(priority = 10)
	    public void verifyInstagramIconPresence() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  ccContactPage.verifyInstagramIconPresence();
			  driver.close();
	    }

	   
	    @Test(priority = 11)
	    public void verifyFacebookNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  ccContactPage.verifyFacebookNavigation();
			  driver.close();
	    }


	    @Test(priority = 12)
	    public void verifyInstagramNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  ccContactPage.verifyInstagramNavigation();
			  driver.close();
	    }
	    
	    
	    @Test(priority = 13)
	    public void verifyPrivacyPolicyNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  ccContactPage.verifyPrivacyPolicyNavigation();
			  driver.close();
	    }

	    
	    @Test(priority = 14)
	    public void verifyTermsOfServiceNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  ccContactPage.verifyTermsOfServiceNavigation();
			  driver.close();
	    }

	    
	    @Test(priority = 15)
	    public void verifyCookiePolicyNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  ccContactPage.verifyCookiePolicyNavigation();
			  driver.close();
	    }
	    
	    
	    @Test(priority = 16)
	    public void verifyCopyRightFooter() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCContactPage ccContactPage=getPageFactory().getCCContactPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("ContactTab");
			  ccContactPage.waitForCCContactPageToLoad();
			  ccContactPage.verifyCopyRightFooter();
			  driver.close();
	    }



}
