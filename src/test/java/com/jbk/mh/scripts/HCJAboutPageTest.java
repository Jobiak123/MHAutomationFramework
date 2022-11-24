package com.jbk.mh.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.webdriver.WebDriverBase;
import com.jbk.mh.pages.CCAboutPage;
import com.jbk.mh.pages.CCHomePage;
import com.jbk.mh.pages.HCJAboutPage;
import com.jbk.mh.pages.HCJHomePage;

public class HCJAboutPageTest extends WebDriverBase {
	
	@Test(priority = 1)
	public void verifyAboutPageNavigation() throws Exception{
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("AboutTab");
			  hcjAboutPage.waitForHCJAboutPageToLoad();
			  driver.close();
			
		}
		
		
	@Test(priority = 2)
	public void verifyAboutPageHeader() {
		    WebDriver driver=WebDriverBase.getDriver();
		    AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("AboutTab");
			  hcjAboutPage.waitForHCJAboutPageToLoad();
		      hcjAboutPage.verifyAboutPageHeader();
			  driver.close();
		    }
		 
		 @Test(priority = 3)
		    public void verifyAboutPageLabel() {
		    	  WebDriver driver=WebDriverBase.getDriver();
				  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
				  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
				  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
				  hcjHomePage.openHCJUrl();
				  hcjHomePage.waitForHCJHomePageToLoad();
				  hcjHomePage.clickOnLink("AboutTab");
				  hcjAboutPage.waitForHCJAboutPageToLoad();
				  hcjAboutPage.verifyAboutPageLabel();
				  driver.close();
		    }
		 
		 @Test(priority = 4)
		    public void verifyAboutPageArticlesPresence() {
		    	  WebDriver driver=WebDriverBase.getDriver();
				  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
				  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
				  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
				  hcjHomePage.openHCJUrl();
				  hcjHomePage.waitForHCJHomePageToLoad();
				  hcjHomePage.clickOnLink("AboutTab");
				  hcjAboutPage.waitForHCJAboutPageToLoad();
				  hcjAboutPage.verifyAboutPageArticlesPresence();
				  driver.close();
		    }
		 
		
		 @Test(priority = 5)
		    public void verifyTwitterIconPresence() {
				  WebDriver driver=WebDriverBase.getDriver();
				  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
				  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
				  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
				  hcjHomePage.openHCJUrl();
				  hcjHomePage.waitForHCJHomePageToLoad();
				  hcjHomePage.clickOnLink("AboutTab");
				  hcjAboutPage.waitForHCJAboutPageToLoad();
				  hcjAboutPage.verifyTwitterIconPresence();
				  driver.close();
		    }


		    @Test(priority = 6)
		    public void verifyLinkedInIconPresence() {
		    	 WebDriver driver=WebDriverBase.getDriver();
				  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
				  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
				  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
				  hcjHomePage.openHCJUrl();
				  hcjHomePage.waitForHCJHomePageToLoad();
				  hcjHomePage.clickOnLink("AboutTab");
				  hcjAboutPage.waitForHCJAboutPageToLoad();
				  hcjAboutPage.verifyLinkedInIconPresence();
				  driver.close();
		    }

		   
		    @Test(priority = 7)
		    public void verifyTwitterNavigation() {
		    	  WebDriver driver=WebDriverBase.getDriver();
				  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
				  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
				  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
				  hcjHomePage.openHCJUrl();
				  hcjHomePage.waitForHCJHomePageToLoad();
				  hcjHomePage.clickOnLink("AboutTab");
				  hcjAboutPage.waitForHCJAboutPageToLoad();
				  hcjAboutPage.verifyTwitterNavigation();
				  driver.close();
		    }


		    @Test(priority = 8)
		    public void verifyLinkedInNavigation() {
		    	WebDriver driver=WebDriverBase.getDriver();
				  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
				  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
				  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
				  hcjHomePage.openHCJUrl();
				  hcjHomePage.waitForHCJHomePageToLoad();
				  hcjHomePage.clickOnLink("AboutTab");
				  hcjAboutPage.waitForHCJAboutPageToLoad();
				  hcjAboutPage.verifyLinkedInNavigation();
				  driver.close();
		    }
		    
		    
		    @Test(priority = 9)
		    public void verifyPrivacyPolicyNavigation() {
		    	WebDriver driver=WebDriverBase.getDriver();
				  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
				  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
				  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
				  hcjHomePage.openHCJUrl();
				  hcjHomePage.waitForHCJHomePageToLoad();
				  hcjHomePage.clickOnLink("AboutTab");
				  hcjAboutPage.waitForHCJAboutPageToLoad();
				  hcjAboutPage.verifyPrivacyPolicyNavigation();
				  driver.close();
		    }

		    
		    @Test(priority = 10)
		    public void verifyTermsOfServiceNavigation() {
		    	WebDriver driver=WebDriverBase.getDriver();
				  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
				  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
				  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
				  hcjHomePage.openHCJUrl();
				  hcjHomePage.waitForHCJHomePageToLoad();
				  hcjHomePage.clickOnLink("AboutTab");
				  hcjAboutPage.waitForHCJAboutPageToLoad();
				  hcjAboutPage.verifyTermsOfServiceNavigation();
				  driver.close();
		    }

		    
		    @Test(priority = 11)
		    public void verifyCookiePolicyNavigation() {
		    	WebDriver driver=WebDriverBase.getDriver();
				  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
				  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
				  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
				  hcjHomePage.openHCJUrl();
				  hcjHomePage.waitForHCJHomePageToLoad();
				  hcjHomePage.clickOnLink("AboutTab");
				  hcjAboutPage.waitForHCJAboutPageToLoad();
				  hcjAboutPage.verifyCookiePolicyNavigation();
				  driver.close();
		    }
		    
		    
		    @Test(priority = 12)
		    public void verifyCopyRightFooter() {
		    	WebDriver driver=WebDriverBase.getDriver();
				  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
				  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
				  HCJAboutPage hcjAboutPage=getPageFactory().getHCJAboutPage(); 
				  hcjHomePage.openHCJUrl();
				  hcjHomePage.waitForHCJHomePageToLoad();
				  hcjHomePage.clickOnLink("AboutTab");
				  hcjAboutPage.waitForHCJAboutPageToLoad();
				  hcjAboutPage.verifyCopyRightFooter();
				  driver.close();
		    }

	

}
