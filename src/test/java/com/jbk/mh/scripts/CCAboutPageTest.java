package com.jbk.mh.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.webdriver.WebDriverBase;
import com.jbk.mh.pages.CCAboutPage;
import com.jbk.mh.pages.CCHomePage;

public class CCAboutPageTest extends WebDriverBase{

	
	   @Test(priority = 1)
	    public void verifyAboutPageNavigation() throws Exception{
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCAboutPage ccAboutPage=getPageFactory().getCCAboutPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("AboutTab");
		  ccAboutPage.waitForCCAboutPageToLoad();
		  driver.close();
		
	}
	
	
	 @Test(priority = 2)
	    public void verifyAboutPageHeader() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCAboutPage ccAboutPage=getPageFactory().getCCAboutPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("AboutTab");
			  ccAboutPage.waitForCCAboutPageToLoad();
			  ccAboutPage.verifyAboutPageHeader();
			  driver.close();
	    }
	 
	 @Test(priority = 3)
	    public void verifyAboutPageLabel() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCAboutPage ccAboutPage=getPageFactory().getCCAboutPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("AboutTab");
			  ccAboutPage.waitForCCAboutPageToLoad();
			  ccAboutPage.verifyAboutPageLabel();
			  driver.close();
	    }
	
	 @Test(priority = 4)
	    public void verifyFacebookIconPresence() {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCAboutPage ccAboutPage=getPageFactory().getCCAboutPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("AboutTab");
			  ccAboutPage.waitForCCAboutPageToLoad();
			  ccAboutPage.verifyFacebookIconPresence();
			  driver.close();
	    }


	    @Test(priority = 5)
	    public void verifyInstagramIconPresence() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCAboutPage ccAboutPage=getPageFactory().getCCAboutPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("AboutTab");
			  ccAboutPage.waitForCCAboutPageToLoad();
			  ccAboutPage.verifyInstagramIconPresence();
			  driver.close();
	    }

	   
	    @Test(priority = 6)
	    public void verifyFacebookNavigation() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCAboutPage ccAboutPage=getPageFactory().getCCAboutPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("AboutTab");
			  ccAboutPage.waitForCCAboutPageToLoad();
			  ccAboutPage.verifyFacebookNavigation();
			  driver.close();
	    }


	    @Test(priority = 7)
	    public void verifyInstagramNavigation() {
	    	WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCAboutPage ccAboutPage=getPageFactory().getCCAboutPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("AboutTab");
			  ccAboutPage.waitForCCAboutPageToLoad();
			  ccAboutPage.verifyInstagramNavigation();
			  driver.close();
	    }
	    
	    
	    @Test(priority = 8)
	    public void verifyPrivacyPolicyNavigation() {
	    	WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCAboutPage ccAboutPage=getPageFactory().getCCAboutPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("AboutTab");
			  ccAboutPage.waitForCCAboutPageToLoad();
			  ccAboutPage.verifyPrivacyPolicyNavigation();
			  driver.close();
	    }

	    
	    @Test(priority = 9)
	    public void verifyTermsOfServiceNavigation() {
	    	WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCAboutPage ccAboutPage=getPageFactory().getCCAboutPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("AboutTab");
			  ccAboutPage.waitForCCAboutPageToLoad();
			  ccAboutPage.verifyTermsOfServiceNavigation();
			  driver.close();
	    }

	    
	    @Test(priority = 10)
	    public void verifyCookiePolicyNavigation() {
	    	WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCAboutPage ccAboutPage=getPageFactory().getCCAboutPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("AboutTab");
			  ccAboutPage.waitForCCAboutPageToLoad();
			  ccAboutPage.verifyCookiePolicyNavigation();
			  driver.close();
	    }
	    
	    
	    @Test(priority = 11)
	    public void verifyCopyRightFooter() {
	    	WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCAboutPage ccAboutPage=getPageFactory().getCCAboutPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("AboutTab");
			  ccAboutPage.waitForCCAboutPageToLoad();
			  ccAboutPage.verifyCopyRightFooter();
			  driver.close();
	    }

	
	 
	 
	
}
