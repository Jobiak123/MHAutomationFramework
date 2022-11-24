package com.jbk.mh.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.webdriver.Page;
import com.jbk.automation.framework.webdriver.WebDriverBase;
import com.jbk.mh.pages.CCJobDetailsPage;
import com.jbk.mh.pages.HCJJobDetailsPage;

public class HCJJobsDetailsPageTest extends WebDriverBase{
	
	
	@Test(dataProvider ="HCJPostedGFJJobs")
	public void validatePostedGFJJobs(String data) throws Exception
	{
		
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJJobDetailsPage hcjJobDetailsPage=getPageFactory().getHCJJobDetailsPage();
		  System.out.println(" URL ::" + data);
		  Thread.sleep(1000);
		  driver.get(data);
		  Thread.sleep(3000);
		  hcjJobDetailsPage.validateSocialIconLinks();
		  hcjJobDetailsPage.validateJobDetailsInfo();
		  hcjJobDetailsPage.validateJobDetailedInfo();
		  hcjJobDetailsPage.verifyJobBuckets(); 
		  
		// ccJobDetailsPage.verifySimilarJobs();
		  
		  hcjJobDetailsPage.verifyTwitterBottomIconNavigation();
		  driver.navigate().back();
		  Thread.sleep(2000);
		  hcjJobDetailsPage.verifyLinkedInBottonIconNavigation();
		  driver.navigate().back();
		  Thread.sleep(2000);
		  hcjJobDetailsPage.verifyPrivacyPolicyNavigation();
		  driver.navigate().back();
		  Thread.sleep(2000);
		  hcjJobDetailsPage.verifyTermsOfServiceNavigation();
		  driver.navigate().back();
		  Thread.sleep(2000);
		  hcjJobDetailsPage.verifyCookiePolicyNavigation();
		  driver.navigate().back();
		  Thread.sleep(2000);
		  hcjJobDetailsPage.verifyCopyRightFooter();
		  Thread.sleep(1000);
	      driver.close();
					
	   }
	
	
	
	@Test(dataProvider ="HCJNonPostedGFJJobs")
	public void validateNonPostedGFJJobs(String data) throws Exception
	{
		
		  WebDriver driver=WebDriverBase.getDriver();
		  AtuReports.setAuthorInfoForReports("SYalavarthi", "1.0"); 
		  HCJJobDetailsPage hcjJobDetailsPage=getPageFactory().getHCJJobDetailsPage();
		  System.out.println(" unique id ::" + data);
		  Thread.sleep(1000);
		  driver.get(Page.hcjJobURL+data);
		  Thread.sleep(3000);
		  hcjJobDetailsPage.validateSocialIconLinks();
		  hcjJobDetailsPage.validateJobDetailsInfo();
		  hcjJobDetailsPage.validateJobDetailedInfo();
		  hcjJobDetailsPage.verifyJobBuckets(); 
		  
		// ccJobDetailsPage.verifySimilarJobs();
		  
		  hcjJobDetailsPage.verifyTwitterBottomIconNavigation();
		  driver.navigate().back();
		  Thread.sleep(2000);
		  hcjJobDetailsPage.verifyLinkedInBottonIconNavigation();
		  driver.navigate().back();
		  Thread.sleep(2000);
		  hcjJobDetailsPage.verifyPrivacyPolicyNavigation();
		  driver.navigate().back();
		  Thread.sleep(2000);
		  hcjJobDetailsPage.verifyTermsOfServiceNavigation();
		  driver.navigate().back();
		  Thread.sleep(2000);
		  hcjJobDetailsPage.verifyCookiePolicyNavigation();
		  driver.navigate().back();
		  Thread.sleep(2000);
		  hcjJobDetailsPage.verifyCopyRightFooter();
		  Thread.sleep(1000);
		  driver.close();
					
	   }
  

	
	
	

}
