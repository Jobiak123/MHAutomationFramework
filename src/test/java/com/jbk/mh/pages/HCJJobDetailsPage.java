package com.jbk.mh.pages;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.Page;

public class HCJJobDetailsPage extends Page{
	
	
	public enum LinkName {
		FacebookLink, TwitterLink, LinkedInLink
	}

	@FindBy(xpath = "//*[@class='img-responsive']")
	private WebElement HCJJobDetailsLogo;

	@FindBy(xpath = "//*[@class='jb-title']")
	private WebElement JobTitle;

	@FindBy(xpath = "//div[@class='hd']/h2")
	private WebElement JobEmployer;

	@FindBy(xpath = "//*[@class='information']/li[1]")
	private WebElement JobLocation;

	@FindBy(xpath = "//*[@class='information']/li[2]")
	private WebElement JobPostedDate;

	@FindBy(xpath = "(//span[@class='icon-facebook'])[1]")
	private WebElement FacebookIcon;

	@FindBy(xpath = "//span[@class='icon-twitter']")
	private WebElement TwitterTopIcon;

	@FindBy(xpath = "//*[@class='css-1dbjc4n r-1wtj0ep']")
	private WebElement TwitterPopUp;

	
	@FindBy(xpath = "//span[@class='icon-linkedin2']")
	private WebElement LinkedInTopIcon;

	@FindBy(xpath = "//*[@class='pr-btn bg-btn m-bt-16px']")
	private WebElement ApplyNowButton;

	@FindBy(xpath = "//*[@class='basic-information ht-auto']")
	private WebElement JobDescription;
	
	

	@FindBy(xpath = "//*[@id='slidecont']/p[4]")
	private WebElement JobRequirements;

	@FindBy(xpath = "//*[@id='slidecont']/p[5]")
	private WebElement JobBenefits;

	@FindBy(xpath = "//*[@id='slidecont']/p[6]")
	private WebElement JobResponsibilities;

	@FindBy(xpath = "//*[@id='slidecont']/p[8]")
	private WebElement AboutEmployer;

	@FindBy(xpath = "//*[@id='slidecont']/p[3]")
	private WebElement JobTypeInfo;

	@FindBy(xpath = "//*[@id='slidecont']/p[5]")
	private WebElement IndustryInfo;

	@FindBy(xpath = "//*[@id='slidecont']/p[6]")
	private WebElement EstimatedSalaryInfo;

	
	@FindBy(xpath = "//*[@class='information']/li[3]")
	private WebElement JobType;
	
	@FindBy(xpath = "//div[@class='widget-item ']/p[1]/span")
	private WebElement JobCategory;
	
	@FindBy(xpath = "//div[@class='widget-item ']/p[2]/span")
	private WebElement Industry;

	@FindBy(xpath = "//div[@class='widget-item ']/p[4]/span")
	private WebElement EstimatedSalary;

	@FindBy(xpath = "//div[@class='widget-item ']/p[3]/span")
	private WebElement PostalCode;
	
	
	@FindBy(xpath = "(//*[@class='widget-item '])[4]/h2")
	private WebElement JobsInDemand;

	@FindBy(xpath = "(//*[@class='widget-item '])[2]/h2")
	private WebElement OtherJobsLocation;

	@FindBy(xpath = "(//*[@class='widget-item '])[3]/h2")
	private WebElement OtherJobsForEmployer;
	
	@FindBy(xpath = "(//*[@class='widget-item '])[5]/h2")
	private WebElement RelevantJobs;
	
	@FindBy(xpath = "(//*[@class='widget-item '])[6]/h2")
	private WebElement JobsInterested;
	
	

	@FindBy(xpath = "//*[@class='widget-title']")
	private WebElement SimilarJobs;
	
	@FindBy(xpath = "(//*[@class='widget-tag-list']/a)")
	private WebElement SimilarJobsList;

	@FindBy(xpath = "(//*[@class='sc-media']/ul/li)[1]/a")
	private WebElement TwitterBottomIcon;
	
	@FindBy(xpath = "(//*[@class='sc-media']/ul/li)[2]/a")
	private WebElement LinkedInBottomIcon;
	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	private WebElement PrivacyPolicyLink;
	
	@FindBy(xpath = "//a[contains(text(),'Terms Of Service')]")
	private WebElement TermsOfServiceLink;
	
	@FindBy(xpath = "//a[contains(text(),'Cookie Policy')]")
	private WebElement CookiePolicyLink;
	
	@FindBy(xpath = "//div[@class='ly-wrapper']/p/small")
	private WebElement CopyRightFooter;


	
	
	
	
	public WebElement getCCJobDetailsLogo() {
		return HCJJobDetailsLogo;
	}
	
	public WebElement getJobTitle() {
		return JobTitle;
	}
	
	public WebElement getJobEmployer() {
		return JobEmployer;
	}
	
	public WebElement getJobLocation() {
		return JobLocation;
	}
	
	public WebElement getJobPostedDate() {
		return JobPostedDate;
	}
	
	public WebElement getFacebookIcon() {
		return FacebookIcon;
	}
	
	public WebElement getTwitterTopIcon() {
		return TwitterTopIcon;
	}
	
	public WebElement getLinkedInTopIcon() {
		return LinkedInTopIcon;
	}
	
	public WebElement getTwitterPopUp() {
		return TwitterPopUp;
	}


	
	public WebElement getTwitterBottomIcon() {
		return TwitterBottomIcon;
	}
	
	public WebElement getLinkedInBottomIcon() {
		return LinkedInBottomIcon;
	}
	
	 public WebElement getApplyNowButton() {
		return ApplyNowButton;
	}
	
	public WebElement getJobDescription() {
		return JobDescription;
	}
	
	public WebElement getJobRequirements() {
		return JobRequirements;
	}
	
	public WebElement getJobBenefits() {
		return JobBenefits;
	}
	
	public WebElement getJobResponsibilities() {
		return JobResponsibilities;
	}
	
	public WebElement getAboutEmployer() {
		return AboutEmployer;
	}
	
	public WebElement getJobType() {
		return JobType;
	}
	
	public WebElement getJobCategory() {
		return JobCategory;
	}
	
	
	public WebElement getIndustry() {
		return Industry;
	}
	
	public WebElement getEstimatedSalary() {
		return EstimatedSalary;
	}
	
	public WebElement getPostalCode() {
		return PostalCode;
	}
		
	public WebElement getJobTypeInfo() {
		return JobTypeInfo;
	}
	
	public WebElement getIndustryInfo() {
		return IndustryInfo;
	}
	
	public WebElement getEstimatedSalaryInfo() {
		return EstimatedSalaryInfo;
	}
	
	public WebElement getSimilarJobs() {
		return SimilarJobs;
	}
	
	public WebElement getSimilarJobsList() {
		return SimilarJobsList;
	}
	
	public WebElement getJobsInDemand() {
		return JobsInDemand;
	}
	
	public WebElement getOtherJobsLocation() {
		return OtherJobsLocation;
	}
	
	public WebElement getOtherJobsForEmployer() {
		return OtherJobsForEmployer;
	}
	
	public WebElement getRelevantJobs() {
		return RelevantJobs;
	}
	
	public WebElement getJobsInterested() {
		return JobsInterested;
	}
	
	public WebElement getPrivacyPolicyLink() {
		return PrivacyPolicyLink;
	}

	public WebElement getTermsOfServiceLink() {
		return TermsOfServiceLink;
	}

	public WebElement getCookiePolicyLink() {
		return CookiePolicyLink;
	}

	public WebElement getCopyRightFooter() {
		return CopyRightFooter;
	}
	
		
	
	
	public void waitForHCJJobDetailsPageToLoad() {
		waitForPageLoad();
		
		/*
		 * int count=0; while(!driver.getCurrentUrl().contains("healthcare.ai/")){
		 * explicitWait(1); count++; if(count==50){ driver.navigate().refresh();
		 * //waitForPageLoad(); explicitWait(10); } if(count==100){
		 * System.out.println("break"); break; } }
		 */
		waitForPageElement(getCCJobDetailsLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Job Details Page Logo");
	}

	public void validateSocialIconLinks() {
		isElementDisplayed(getFacebookIcon(), "Facebook Top Icon");
		isElementDisplayed(getTwitterTopIcon(), "Twitter Top Icon");
		isElementDisplayed(getLinkedInTopIcon(), "LinkedIn Top Icon");
		isElementDisplayed(getApplyNowButton(), "Apply Now Button");
		isElementDisplayed(getTwitterBottomIcon(), "Twitter Bottom Icon");
		isElementDisplayed(getLinkedInBottomIcon(), "LinkedIn Bottom Icon");
	}
	
	public void verifyFacebookIconNavigation() {
		jsClick(getFacebookIcon(), "Facebook Top Icon");
		waitForPageLoad();
	//	String parent=driver.getWindowHandle();		
	    ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles()); 
	    driver.switchTo().window(tab.get(1));      
		String Pagetitle=Page.getPageTitle(); 
		System.out.println("Value::"+Pagetitle);
		
	    if(Pagetitle.contains("Facebook")) {
			  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
			  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  }
	    else  {
	    	 AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
			 Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
			 driver.close();
	    }
	    driver.switchTo().window(tab.get(0));
	    waitForPageElement(getCCJobDetailsLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Job Details Page Logo");
	    System.out.println("Value::"+driver.getTitle());
	}
	

	public void verifyTwitterTopIconNavigation() {
		waitForPageElement(getTwitterTopIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Twitter Icon");
		jsClick(getTwitterTopIcon(), "Twitter Icon");
		waitForPageLoad();
		//String parent=driver.getWindowHandle();	
		 ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles()); 
		driver.switchTo().window(tab.get(1));
		
		String Pagetitle=Page.getPageTitle(); 
		System.out.println("Value::"+Pagetitle);
	//	System.out.println(driver.getPageSource());
	//	System.out.println(driver.getCurrentUrl());
		
		
	    if(Pagetitle.contains("Want to Log")) {
			  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
			  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		}
	    else {
	    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	        Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	        driver.close();
	    }
	    driver.switchTo().window(tab.get(0));
	    waitForPageElement(getCCJobDetailsLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Job Details Page Logo");
	    
	}

	

	public void verifyLinkedInTopIconNavigation() {
		waitForPageElement(getLinkedInTopIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "LinkedIn Icon");
		jsClick(getLinkedInTopIcon(), "LinkedIn Icon");
		waitForPageLoad();
	//	String parent=driver.getWindowHandle();	
		 
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles()); 
		driver.switchTo().window(tab.get(1));
		String Pagetitle=Page.getPageTitle(); 
		System.out.println("Value::"+Pagetitle);
	    if(Pagetitle.contains("LinkedIn")) {
			  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
			  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  }
	    else {
	    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	        Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	        driver.close();
	    }
	    driver.switchTo().window(tab.get(0));
	    waitForPageElement(getCCJobDetailsLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Job Details Page Logo");
	    
	}

	
	
	
	public void verifyTwitterBottomIconNavigation() {
		webDriverHelper.explicitWait(1);
		waitForPageElement(getTwitterBottomIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Twitter Icon");
		jsClick(getTwitterBottomIcon(), "Twitter Icon");
		waitForPageLoad();
		String Pagetitle=Page.getPageTitle(); 
		System.out.println("Value::"+Pagetitle);
	    if(Pagetitle.contains("Twitter")) {
			  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
			  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  }
	    else {
	    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	    	driver.close();
	    	Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	      }
	    
	}
	
	public void verifyLinkedInBottonIconNavigation() {
		webDriverHelper.explicitWait(1);
		waitForPageElement(getLinkedInBottomIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "LinkedIn Icon");
		jsClick(getLinkedInBottomIcon(), "LinkedIn Icon");
		waitForPageLoad();
		String Pagetitle=Page.getPageTitle(); 
		 System.out.println("Value::"+Pagetitle);
		if(Pagetitle.contains("LinkedIn")) {
		  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
	  }
		else {
	    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	    	driver.close();
	    	Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	      }

	}

	
	public void verifyPrivacyPolicyNavigation() {
		webDriverHelper.explicitWait(1);
		waitForPageElement(getPrivacyPolicyLink(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Privacy Policy Link");
		jsClick(getPrivacyPolicyLink(), "Privacy Policy Link");
		waitForPageLoad();
		String Pagetitle=Page.getPageTitle(); 
		 System.out.println("Value::"+Pagetitle);
		if(Pagetitle.contains("Privacy Policy")) {
		  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
	  }
		  else {
		    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		    	driver.close();
		    	Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		        
		    }
	}

	
	public void verifyTermsOfServiceNavigation() {
		webDriverHelper.explicitWait(1);
		waitForPageElement(getTermsOfServiceLink(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Terms of Service Link");
		jsClick(getTermsOfServiceLink(), "Terms of Service Link");
		waitForPageLoad();
		String Pagetitle=Page.getPageTitle(); 
		 System.out.println("Value::"+Pagetitle);
		if(Pagetitle.contains("Terms of Service")) {
		  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
	  }
		  else {
		    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		    	driver.close();
		    	Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		        
		    }
	}

	
	public void verifyCookiePolicyNavigation() {
		webDriverHelper.explicitWait(1);
		waitForPageElement(getCookiePolicyLink(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Cookie Policy Link");
		jsClick(getCookiePolicyLink(), "Cookie Policy Link");
		waitForPageLoad();
		String Pagetitle=Page.getPageTitle(); 
		 System.out.println("Value::"+Pagetitle);
		if(Pagetitle.contains("Cookie Policy")) {
		  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
	  }
		  else {
		    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		    	driver.close();
		    	Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		        
		    }
	}

	
	public void verifyCopyRightFooter() {
		isTextPresent(getCopyRightFooter(), "Copyright");	
	}
	
		
	public void verifySocialIcoNavigations() {
		
		jsClick(getFacebookIcon(), "Facebook Top Icon");
		waitForPageLoad();
	//	String parent=driver.getWindowHandle();		
	    ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles()); 
	    driver.switchTo().window(tab.get(1));      
		String Pagetitle=Page.getPageTitle(); 
		System.out.println("Value::"+Pagetitle);
		
	    if(Pagetitle.contains("Facebook")) {
			  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
			  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  }
	    else  {
	    	 AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
			 Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
			 driver.close();
	    }
	    driver.close();
	    driver.switchTo().window(tab.get(0));
	    waitForPageElement(getCCJobDetailsLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Job Details Page Logo");
	    System.out.println("Value::"+driver.getTitle());
	
	
		waitForPageElement(getTwitterTopIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Twitter Icon");
		jsClick(getTwitterTopIcon(), "Twitter Icon");
		waitForPageLoad();
		//String parent=driver.getWindowHandle();	
	//	 ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles()); 

		driver.switchTo().window(tab.get(1));
		
		String Pagetitle1=Page.getPageTitle(); 
		System.out.println("Value::"+Pagetitle1);
	    if(Pagetitle1.contains("Want to Log")) {
			  AtuReports.passResults1("Verify navigation to"  +Pagetitle1, Pagetitle1, "Should be clicked and navigated to " +Pagetitle1 ,"Is clicked and navigated to" +Pagetitle1);
			  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle1, "Should be clicked and navigated to " +Pagetitle1 ,"Is clicked and navigated to" +Pagetitle1);
		}
	    else {
	    	AtuReports.failResults("Verify navigation to"  +Pagetitle1, Pagetitle1, "Should be clicked and navigated to " +Pagetitle1 ,"Is clicked and not navigated to" +Pagetitle1);
	        Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle1, "Should be clicked and navigated to " +Pagetitle1 ,"Is clicked and not navigated to" +Pagetitle1);
	        driver.close();
	    }
	    driver.close();
	    driver.switchTo().window(tab.get(0));
	    waitForPageElement(getCCJobDetailsLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Job Details Page Logo");
	    
		waitForPageElement(getLinkedInTopIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "LinkedIn Icon");
		jsClick(getLinkedInTopIcon(), "LinkedIn Icon");
		waitForPageLoad();
	//	String parent=driver.getWindowHandle();	
		 
	//	ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles()); 
		driver.switchTo().window(tab.get(1));
		String Pagetitle2=Page.getPageTitle(); 
		System.out.println("Value::"+Pagetitle2);
	    if(Pagetitle2.contains("LinkedIn")) {
			  AtuReports.passResults1("Verify navigation to"  +Pagetitle2, Pagetitle2, "Should be clicked and navigated to " +Pagetitle2 ,"Is clicked and navigated to" +Pagetitle2);
			  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle2, "Should be clicked and navigated to " +Pagetitle2 ,"Is clicked and navigated to" +Pagetitle2);
		  }
	    else {
	    	AtuReports.failResults("Verify navigation to"  +Pagetitle2, Pagetitle2, "Should be clicked and navigated to " +Pagetitle2 ,"Is clicked and not navigated to" +Pagetitle2);
	        Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle2, "Should be clicked and navigated to " +Pagetitle2 ,"Is clicked and not navigated to" +Pagetitle2);
	        driver.close();
	    }
	    driver.close();
	    driver.switchTo().window(tab.get(0));
	    waitForPageElement(getCCJobDetailsLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Job Details Page Logo");

		
		
		
	}

	
	
	
	public void validateJobDetailsInfo() {
		waitForTextToLoad(getJobTitle(),10);
		getText(getJobTitle());
		waitForTextToLoad(getJobEmployer(),10);
		getText(getJobEmployer());
		waitForTextToLoad(getJobLocation(),10);
		getText(getJobLocation());
		waitForTextToLoad(getJobPostedDate(),10);
		getText(getJobPostedDate());
	}
	
	
	public void validateJobDetailedInfo() {
	   
	   waitForTextToLoad(getJobDescription(),2);
		/*
		 * String desc= getText(getJobDescription()); if (desc.contains("?")){
		 * AtuReports.failResults("Verify Description contains special characters"
		 * +desc, desc,"Description should not contain special characters " +desc
		 * ,"Description contains" +desc); Reporter.LogEvent(TestStatus.PASS,
		 * "Verify Description contains special characters" +desc,
		 * "Description should not contain special characters " +desc
		 * ,"Description contains" +desc); driver.close(); } else {
		 * AtuReports.passResults1("Verify Description contains special characters"
		 * +desc, desc,"Description should not contain special characters " +desc
		 * ,"Description contains" +desc); Reporter.LogEvent(TestStatus.PASS,
		 * "Verify Description contains special characters" +desc,
		 * "Description should not contain special characters " +desc
		 * ,"Description contains" +desc); }
		 */
		
		waitForTextToLoad(getJobType(), 2);
		getText(getJobType());
		waitForTextToLoad(getIndustry(),2);
		getText(getIndustry());
		waitForTextToLoad(getPostalCode(),2);
		getText(getPostalCode());
		waitForTextToLoad(getJobCategory(),2);
		getText(getJobCategory());
		
	
	}
	
	
	public void verifyJobBuckets() {
		waitForTextToLoad(getJobsInDemand(),2);
		getText(getJobsInDemand());
		waitForTextToLoad(getOtherJobsLocation(), 2);
		getText(getOtherJobsLocation());
		waitForTextToLoad(getOtherJobsForEmployer(),2 );
		getText(getOtherJobsForEmployer());
		waitForTextToLoad(getRelevantJobs(),2 );
		getText(getRelevantJobs());
		waitForTextToLoad(getJobsInterested(),2 );
		getText(getJobsInterested());
		
	}
	
	public void verifySimilarJobs() {
		waitForTextToLoad(getSimilarJobs(),1);
		getText(getSimilarJobs());
		waitForTextToLoad(getSimilarJobsList(), 1);
		getText(getSimilarJobsList());
		
	}
	
	


}
