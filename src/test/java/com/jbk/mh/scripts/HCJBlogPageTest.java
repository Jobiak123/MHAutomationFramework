package com.jbk.mh.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.webdriver.WebDriverBase;
import com.jbk.mh.pages.HCJBlogPage;
import com.jbk.mh.pages.HCJHomePage;

 public class HCJBlogPageTest extends WebDriverBase {
	
	
    @Test(priority = 1)
    public void verifyBlogPageNavigation() throws Exception {
	  WebDriver driver=WebDriverBase.getDriver();
	  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
	  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
	  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
	  hcjHomePage.openHCJUrl();
	  hcjHomePage.waitForHCJHomePageToLoad();
	  hcjHomePage.clickOnLink("BlogTab");
	  hcjBlogPage.waitForHCJBlogPageToLoad();
	  driver.close();

}


  @Test(priority = 2)
   public void verifyBlogPageHeader() {
	  	  WebDriver driver=WebDriverBase.getDriver(); 
	      AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.clickOnLink("BlogTab");
		  hcjBlogPage.waitForHCJBlogPageToLoad();
		  hcjBlogPage.verifyBlogPageHeader();
		  driver.close();
   }


   @Test(priority = 3)
   public void verifyBlogPageArticlesPresence() {
	   WebDriver driver=WebDriverBase.getDriver(); 
	      AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.clickOnLink("BlogTab");
		  hcjBlogPage.waitForHCJBlogPageToLoad();
		  hcjBlogPage.verifyBlogPageArticlesPresence();
		  driver.close();
   }


@Test(priority = 4)
   public void verifyBlogPageArticlesNavigation() {
	WebDriver driver=WebDriverBase.getDriver(); 
    AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
	  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
	  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
	  hcjHomePage.openHCJUrl();
	  hcjHomePage.waitForHCJHomePageToLoad();
	  hcjHomePage.clickOnLink("BlogTab");
	  hcjBlogPage.waitForHCJBlogPageToLoad();
	  hcjBlogPage.verifyBlogPageArticlesNavigation();
		  driver.close();
   }


@Test(priority = 5)
   public void verifyTwitterIconPresence() {
	WebDriver driver=WebDriverBase.getDriver(); 
    AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
	  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
	  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
	  hcjHomePage.openHCJUrl();
	  hcjHomePage.waitForHCJHomePageToLoad();
	  hcjHomePage.clickOnLink("BlogTab");
	  hcjBlogPage.waitForHCJBlogPageToLoad();
		  hcjBlogPage.verifyTwitterIconPresence();
		  driver.close();
   }


   @Test(priority = 6)
   public void verifyLinkedInIconPresence() {
	   WebDriver driver=WebDriverBase.getDriver(); 
	      AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.clickOnLink("BlogTab");
		  hcjBlogPage.waitForHCJBlogPageToLoad();
		  hcjBlogPage.verifyLinkedInIconPresence();
		  driver.close();
   }

  
   @Test(priority = 7)
   public void verifyTwitterNavigation() {
	   WebDriver driver=WebDriverBase.getDriver(); 
	      AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.clickOnLink("BlogTab");
		  hcjBlogPage.waitForHCJBlogPageToLoad();
		  hcjBlogPage.verifyTwitterNavigation();
		  driver.close();
   }


   @Test(priority = 8)
   public void verifyLinkedInNavigation() {
	   WebDriver driver=WebDriverBase.getDriver(); 
	      AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.clickOnLink("BlogTab");
		  hcjBlogPage.waitForHCJBlogPageToLoad();
		  hcjBlogPage.verifyLinkedInNavigation();
		  driver.close();
   }
   
   
   @Test(priority = 9)
   public void verifyPrivacyPolicyNavigation() {
	   WebDriver driver=WebDriverBase.getDriver(); 
	      AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.clickOnLink("BlogTab");
		  hcjBlogPage.waitForHCJBlogPageToLoad();
		  hcjBlogPage.verifyPrivacyPolicyNavigation();
		  driver.close();
   }

   
   @Test(priority = 10)
   public void verifyTermsOfServiceNavigation() {
	   WebDriver driver=WebDriverBase.getDriver(); 
	      AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.clickOnLink("BlogTab");
		  hcjBlogPage.waitForHCJBlogPageToLoad();
		  hcjBlogPage.verifyTermsOfServiceNavigation();
		  driver.close();
   }

   
   @Test(priority = 11)
   public void verifyCookiePolicyNavigation() {
	   WebDriver driver=WebDriverBase.getDriver(); 
	      AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.clickOnLink("BlogTab");
		  hcjBlogPage.waitForHCJBlogPageToLoad();
		  hcjBlogPage.verifyCookiePolicyNavigation();
		  driver.close();
   }
   
   
   @Test(priority = 12)
   public void verifyCopyRightFooter() {
	   WebDriver driver=WebDriverBase.getDriver(); 
	      AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  HCJBlogPage hcjBlogPage=getPageFactory().getHCJBlogPage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.clickOnLink("BlogTab");
		  hcjBlogPage.waitForHCJBlogPageToLoad();
		  hcjBlogPage.verifyCopyRightFooter();
		  driver.close();
   }

	

}
