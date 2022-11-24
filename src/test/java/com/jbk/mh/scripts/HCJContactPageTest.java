package com.jbk.mh.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.WebDriverBase;
import com.jbk.mh.pages.HCJContactPage;
import com.jbk.mh.pages.HCJHomePage;

public class HCJContactPageTest extends WebDriverBase{

	
	   @Test(priority = 1)
	    public void verifyContactPageNavigation() throws Exception{
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
		  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
		  hcjHomePage.openHCJUrl();
		  hcjHomePage.waitForHCJHomePageToLoad();
		  hcjHomePage.clickOnLink("ContactTab");
		  hcjContactPage.waitForHCJContactPageToLoad();
		  driver.close();
	 
	}
	
	
	    @Test(priority = 2)
	    public void verifyContactPageHeader() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  hcjContactPage.verifyContactPageHeader();
			  driver.close();
	    }
	 
	 
	    @Test(priority = 3)
	    public void verifyContactUsDetails() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  hcjContactPage.verifyContactPageDetails();
			  driver.close();
	    }
	
	
	 @Test(priority = 4)
	    public void verifyEnterContactFirstName() throws Exception {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  String FName="Jobiak";
			  hcjContactPage.getContactPageFirstName().sendKeys(FName);
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
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  String LName="Medichire";
			  hcjContactPage.getContactPageLastName().sendKeys(LName);
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
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  String Email="Jobiak@medichire.ai";
			  hcjContactPage.getContactPageEmail().sendKeys(Email);
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
	    public void verifyEnterContactPhoneNumber()throws Exception {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  String Phone="+1-617-938-3489";
			  hcjContactPage.getContactPagePhoneNumber().sendKeys(Phone);
			  AtuReports.passResults1("Verify text is entered to " + Phone + " textbox", Phone,
						"Text '" + Phone + "' should be entered in to " + Phone + " textbox",
						"Text '" + Phone + "' is entered in to " + Phone + " textbox");

			  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + Phone + " textbox",
						"Text '" + Phone + "' should be entered in to " + Phone + " textbox",
						"Text '" + Phone + "' is entered in to " + Phone + " textbox");
			  Thread.sleep(1000);
			  driver.close();
	    }

	 
	 @Test(priority = 8)
	    public void verifyEnterContactZipcode()throws Exception {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  String Zipcode="MA 01803";
			  hcjContactPage.getContactPageEmail().sendKeys(Zipcode);
			  AtuReports.passResults1("Verify text is entered to " + Zipcode + " textbox", Zipcode,
						"Text '" + Zipcode + "' should be entered in to " + Zipcode + " textbox",
						"Text '" + Zipcode + "' is entered in to " + Zipcode + " textbox");

			  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + Zipcode + " textbox",
						"Text '" + Zipcode + "' should be entered in to " + Zipcode + " textbox",
						"Text '" + Zipcode + "' is entered in to " + Zipcode + " textbox");
			  Thread.sleep(1000);
			  driver.close();
	    }

	 
	 
	 

	 @Test(priority = 9)
	    public void verifyContactUsDetailsSubmission()throws Exception {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  Thread.sleep(1000);
			  hcjContactPage.verifyEnterContactUsDetails();
			  driver.close();
	    }
	
	 
	 @Test(priority = 10)
	    public void verifyTwitterIconPresence() {
			  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  hcjContactPage.verifyTwitterIconPresence();
			  driver.close();
	    }


	    @Test(priority = 11)
	    public void verifyLinkedInIconPresence() {
	    	  WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  hcjContactPage.verifyLinkedInIconPresence();
			  driver.close();
	    }

	   
	    @Test(priority = 12)
	    public void verifyTwitterNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  hcjContactPage.verifyTwitterNavigation();
			  driver.close();
	    }


	    @Test(priority = 13)
	    public void verifyLinkedInNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  hcjContactPage.verifyLinkedInNavigation();
			  driver.close();
	    }
	    
	    
	    @Test(priority = 14)
	    public void verifyPrivacyPolicyNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  hcjContactPage.verifyPrivacyPolicyNavigation();
			  driver.close();
	    }

	    
	    @Test(priority = 15)
	    public void verifyTermsOfServiceNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  hcjContactPage.verifyTermsOfServiceNavigation();
			  driver.close();
	    }

	    
	    @Test(priority = 16)
	    public void verifyCookiePolicyNavigation() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  hcjContactPage.verifyCookiePolicyNavigation();
			  driver.close();
	    }
	    
	    
	    @Test(priority = 17)
	    public void verifyCopyRightFooter() {
	    	 WebDriver driver=WebDriverBase.getDriver();
			  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
			  HCJHomePage hcjHomePage=getPageFactory().getHCJHomePage(); 
			  HCJContactPage hcjContactPage=getPageFactory().getHCJContactPage(); 
			  hcjHomePage.openHCJUrl();
			  hcjHomePage.waitForHCJHomePageToLoad();
			  hcjHomePage.clickOnLink("ContactTab");
			  hcjContactPage.waitForHCJContactPageToLoad();
			  hcjContactPage.verifyCopyRightFooter();
			  driver.close();
	    }


}
