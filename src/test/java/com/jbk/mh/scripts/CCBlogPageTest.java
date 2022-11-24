package com.jbk.mh.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.webdriver.WebDriverBase;
import com.jbk.mh.pages.CCBlogPage;
import com.jbk.mh.pages.CCHomePage;

public class CCBlogPageTest extends WebDriverBase{
	
	
	     @Test(priority = 1)
         public void verifyBlogPageNavigation() throws Exception{
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
		  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
		  ccHomePage.openCCUrl();
		  ccHomePage.waitForCCHomePageToLoad();
		  ccHomePage.clickOnLink("BlogTab");
		  ccBlogPage.waitForCCBlogPageToLoad();
		  driver.close();
	 
	}
	
	
	   @Test(priority = 2)
	    public void verifyBlogPageHeader() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("BlogTab");
			  ccBlogPage.waitForCCBlogPageToLoad();
			  ccBlogPage.verifyBlogPageHeader();
			  driver.close();
	    }
	 
	 
	    @Test(priority = 3)
	    public void verifyReadArticleLinkPresence() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("BlogTab");
			  ccBlogPage.waitForCCBlogPageToLoad();
			  ccBlogPage.verifyReadArticleLinkPresence();
			  driver.close();
	    }
	
	
	 @Test(priority = 4)
	    public void verifyReadArticleLinkNavigation() {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("BlogTab");
			  ccBlogPage.waitForCCBlogPageToLoad();
			  ccBlogPage.verifyReadArticleLinkNavigation();
			  driver.close();
	    }
	
	 
	 @Test(priority = 5)
	    public void verifyFacebookIconPresence() {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("BlogTab");
			  ccBlogPage.waitForCCBlogPageToLoad();
			  ccBlogPage.verifyFacebookIconPresence();
			  driver.close();
	    }


	    @Test(priority = 6)
	    public void verifyInstagramIconPresence() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("BlogTab");
			  ccBlogPage.waitForCCBlogPageToLoad();
			  ccBlogPage.verifyInstagramIconPresence();
			  driver.close();
	    }

	   
	    @Test(priority = 7)
	    public void verifyFacebookNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("BlogTab");
			  ccBlogPage.waitForCCBlogPageToLoad();
			  ccBlogPage.verifyFacebookNavigation();
			  driver.close();
	    }


	    @Test(priority = 8)
	    public void verifyInstagramNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("BlogTab");
			  ccBlogPage.waitForCCBlogPageToLoad();
			  ccBlogPage.verifyInstagramNavigation();
			  driver.close();
	    }
	    
	    
	    @Test(priority = 9)
	    public void verifyPrivacyPolicyNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("BlogTab");
			  ccBlogPage.waitForCCBlogPageToLoad();
			  ccBlogPage.verifyPrivacyPolicyNavigation();
			  driver.close();
	    }

	    
	    @Test(priority = 10)
	    public void verifyTermsOfServiceNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("BlogTab");
			  ccBlogPage.waitForCCBlogPageToLoad();
			  ccBlogPage.verifyTermsOfServiceNavigation();
			  driver.close();
	    }

	    
	    @Test(priority = 11)
	    public void verifyCookiePolicyNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("BlogTab");
			  ccBlogPage.waitForCCBlogPageToLoad();
			  ccBlogPage.verifyCookiePolicyNavigation();
			  driver.close();
	    }
	    
	    
	    @Test(priority = 12)
	    public void verifyCopyRightFooter() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  CCHomePage ccHomePage=getPageFactory().getCCHomePage(); 
			  CCBlogPage ccBlogPage=getPageFactory().getCCBlogPage(); 
			  ccHomePage.openCCUrl();
			  ccHomePage.waitForCCHomePageToLoad();
			  ccHomePage.clickOnLink("BlogTab");
			  ccBlogPage.waitForCCBlogPageToLoad();
			  ccBlogPage.verifyCopyRightFooter();
			  driver.close();
	    }


}
