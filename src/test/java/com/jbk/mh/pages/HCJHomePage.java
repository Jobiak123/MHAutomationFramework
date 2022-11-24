package com.jbk.mh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.Page;

public class HCJHomePage extends Page {
	
	
	public enum LinkName {
		HomeTab,AboutTab, BlogTab, ContactTab
	}
			
	@FindBy(xpath = "//*[@class='logo']")
	private WebElement HomePageLogo;
	
	@FindBy(xpath = "//*[@class='nav navbar-nav navbar-right']//*[contains(text(),'Home')]")
	private WebElement HomeTab;
	
	@FindBy(xpath = "//*[@class='nav navbar-nav navbar-right']//*[contains(text(),'About')]")
	private WebElement AboutTab;
	
	@FindBy(xpath = "//*[@class='nav navbar-nav navbar-right']//*[contains(text(),'Blog')]")
	private WebElement BlogTab;
	
	@FindBy(xpath = "//*[@class='nav navbar-nav navbar-right']//*[contains(text(),'Contact')]")
	private WebElement ContactTab;
	
	@FindBy(xpath = "//*[@class='heading']")
	private WebElement JobsAvailableHeader;
	
	@FindBy(xpath = "//*[@class='caption']/h1")
	private WebElement JobsAvailableTagLine;
	
	@FindBy(xpath = "//*[@name='q']")
	private WebElement JobsTitleField;

	@FindBy(xpath = "//*[@name='location']")
	private WebElement CityLocations;
	

	@FindBy(xpath = "//*[@name='miles']")
	private WebElement MilesField;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement SearchIcon;

	@FindBy(xpath = "(//div[@class='company-content']/p[2]/span[1])[1]")
	private WebElement JobsLocation;
	
	@FindBy(xpath = "(//div[@class='company-content']/p[2]/span[2])[1]")
	private WebElement JobsDate;

	
	@FindBy(xpath = "(//*[@class='sc-media']/ul/li)[1]/a")
	private WebElement TwitterIcon;
	
	@FindBy(xpath = "(//*[@class='sc-media']/ul/li)[2]/a")
	private WebElement LinkedInIcon;
	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	private WebElement PrivacyPolicyLink;
	
	@FindBy(xpath = "//a[contains(text(),'Terms Of Service')]")
	private WebElement TermsOfServiceLink;
	
	@FindBy(xpath = "//a[contains(text(),'Cookie Policy')]")
	private WebElement CookiePolicyLink;
	
	@FindBy(xpath = "//div[@class='ly-wrapper']/p/small")
	private WebElement CopyRightFooter;

	
	
	
	public WebElement getHomePageLogo() {
		return HomePageLogo;
	}
	
	public WebElement getHomeTab() {
		return HomeTab;
	}

	public WebElement getAboutTab() {
		return AboutTab;
	}
	public WebElement getBlogTab() {
		return BlogTab;
	}
	public WebElement getContactTab() {
		return ContactTab;
	}
	public WebElement getJobsAvailableHeader() {
		return JobsAvailableHeader;
	}
	public WebElement getJobsAvailableTagLine() {
		return JobsAvailableTagLine;
	}
	public WebElement getJobsTitleField() {
		return JobsTitleField;
	}
	
	public WebElement getCityLocations() {
		return CityLocations;
	}
	
	public WebElement getMilesField() {
		return MilesField;
	}
	public WebElement getSearchIcon() {
		return SearchIcon;
	}
	
	public WebElement getJobsLocation() {
		return JobsLocation;
	}
	
	public WebElement getJobsDate() {
		return JobsDate;
	}
	
	
	public WebElement getTwitterIcon() {
		return TwitterIcon;
	}

	public WebElement getLinkedInIcon() {
		return LinkedInIcon;
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
	
	
	
	public void openHCJUrl() {
		try {
			
			driver.navigate().to(Page.hcjURL);
			waitForPageLoad();
			//driver.navigate().to(WebDriverBase._prop.getString("hcjURL"));
			AtuReports.passResults1("Navigate to "+Page.hcjURL+" Application", "--",
					"Home Page should display", "Home Page is displayed");

		} catch (Exception exception) {
			driver.close();
			AtuReports.failResults("Navigate to "+Page.hcjURL+" Application", "--",
					"Home Page should display", catchException(exception));
			
		}
	}

		
	public void waitForHCJHomePageToLoad() {
		waitForPageLoad();
		
		/*
		 * int count=0; while(!driver.getCurrentUrl().contains("healthcare.ai/")){
		 * explicitWait(1); count++; if(count==50){ driver.navigate().refresh();
		 * //waitForPageLoad(); explicitWait(10); } if(count==100){
		 * System.out.println("break"); break; } }
		 */
		waitForPageElement(getHomePageLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Home Page Logo");
	}

	
	
	public void searchByJobsTitleField(String FieldValue) {
		    sendKeys(getJobsTitleField(), FieldValue, "JobsTitleField");
			explicitWait(1);
			click(SearchIcon, "SearchIcon");
			explicitWait(3);
	}
	
	public void searchByCityField(String FieldValue) { 
     	sendKeys(getCityLocations(), FieldValue, "CityField");
		explicitWait(1);
		click(SearchIcon, "SearchIcon");
		explicitWait(3);
	}
	
	public void searchByMilesTitleField(String FieldValue,String value) {
		selectListBox(getMilesField(), FieldValue,"value" , "MilesField");
		explicitWait(1);
		click(SearchIcon, "SearchIcon");
		explicitWait(3);
			
	}
	
		
	public void clickOnLink(String link) {

		LinkName linkName = LinkName.valueOf(link);

		switch (linkName) {
		case HomeTab:
			waitForPageElement(getHomeTab(),"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE",
					"HomePage");
			click(getHomeTab(), "HomePage");
			explicitWait(2);
			break;
        case AboutTab:
			waitForPageElement(getAboutTab(), "WAIT_FOR_ELEMENT_TO_BE_CLICKABLE",
					"AboutPage");
			click(getAboutTab(), "AboutPage");
			explicitWait(2);
			break;
		case BlogTab:
			waitForPageElement(getBlogTab(), "WAIT_FOR_ELEMENT_TO_BE_CLICKABLE",
					"BlogPage");
			click(getBlogTab(), "BlogPage");
			explicitWait(2);
			break;
		case ContactTab:
			waitForPageElement(getContactTab(),"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE",
					"ContactPage");
			click(getContactTab(), "ContactPage");
			explicitWait(2);
			break;
			
		}
	}	
	
	
	public void verifyPresenceofTabs() {
		waitForPageElement(getHomeTab(),
				"WAIT_FOR_ELEMENT_TO_BE_ENABLED", "Home Tab");
		waitForPageElement(getAboutTab(),
				"WAIT_FOR_ELEMENT_TO_BE_ENABLED", "About Tab");
		waitForPageElement(getBlogTab(),
				"WAIT_FOR_ELEMENT_TO_BE_ENABLED", "Blog Tab");
		waitForPageElement(getContactTab (),
				"WAIT_FOR_ELEMENT_TO_BE_ENABLED", "Contact Tab");
		
	}
	
	public void verifyJobsHeader() {
		isTextPresent(getJobsAvailableHeader(), "Jobs Available");
		
	}
	
	public void verifyJobsTagLine() {
		isTextPresent(getJobsAvailableTagLine(), "Every Healthcare Job in your area");
		
	}
	
	public void verifySearchFields() {
		
		waitForPageElement(getJobsTitleField(),
				"WAIT_FOR_ELEMENT_TO_BE_ENABLED", "Job Title Field");
		waitForPageElement(getCityLocations(),
				"WAIT_FOR_ELEMENT_TO_BE_ENABLED", "City Field");
		waitForPageElement(getMilesField(),
				"WAIT_FOR_ELEMENT_TO_BE_ENABLED", "Miles Field");
		waitForPageElement(getSearchIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_ENABLED", "Submit Button");	
	}
	
	
	public void getLocationDropdownValues() throws Exception {
		webDriverHelper.explicitWait(1);
		getCityLocations().sendKeys("A");
		webDriverHelper.explicitWait(2);
		isTextPresent(getCityLocations(), "Aarons");
		//List<String> values=getOptionsList(getCityLocations());
		
	}
	
	public void getMilesDropdownValues() {
		webDriverHelper.explicitWait(1);
		getMilesField().click();
		webDriverHelper.explicitWait(1);
		getAllValuesFromListBox(getMilesField(), " Drop Down ");
		
	}
	
	public void verifyTwitterIconPresence() {
		waitForPageElement(getTwitterIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Twitter Icon");
		}
	
	public void verifyLinkedInIconPresence() {
		
		waitForPageElement(getLinkedInIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "LinkedIn Icon");
		}
	
		
	public void verifyTwitterNavigation() {
		
		waitForPageElement(getTwitterIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Twitter Icon");
		jsClick(getTwitterIcon(), "Twitter Icon");
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
	
	public void verifyLinkedInNavigation() {
		
		waitForPageElement(getLinkedInIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "LinkedIn Icon");
		jsClick(getLinkedInIcon(), "LinkedIn Icon");
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
	

}
