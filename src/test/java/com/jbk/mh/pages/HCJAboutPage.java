package com.jbk.mh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.Page;

public class HCJAboutPage extends Page {

	
	@FindBy(xpath = "//img[@class='logo']")
	private WebElement AboutPageLogo;
	
	@FindBy(xpath = "//*[@class='hd']/h1")
	private WebElement AboutPageHeader;
	
	@FindBy(xpath = "//*[@class='hd']/p")
	private WebElement AboutPageLabel;
	
	@FindBy(xpath = "//div[@class='mi-rw']")
	private WebElement AboutPageArticles;
	
	
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

	
	
	
	public WebElement getAboutPageLogo() {
		return AboutPageLogo;
	}
	
	public WebElement getAboutPageHeader() {
		return AboutPageHeader;
	}
	
	public WebElement getAboutPageLabel() {
		return AboutPageLabel;
	}
	
	public WebElement getAboutPageArticles() {
		return AboutPageArticles;
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
	

	
	public void waitForHCJAboutPageToLoad() {
		waitForPageLoad();
		
		/*
		 * int count=0; while(!driver.getCurrentUrl().contains("healthcarejobs.ai/")){
		 * explicitWait(1); count++; if(count==50){ driver.navigate().refresh();
		 * //waitForPageLoad(); explicitWait(10); } if(count==100){
		 * System.out.println("break"); break; } }
		 */
		
		waitForPageElement(getAboutPageLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "About Page");
	}

	
	public void verifyAboutPageHeader() {
		isTextPresent(getAboutPageHeader(), "Where Our Passion Lies!");
		
	}
	
	public void verifyAboutPageLabel() {
		isTextPresent(getAboutPageLabel(), "Healthcarejobs is built with a singular focus: connect healthcare job seekers with every local employer who has a job to fill");
		
	}
	
	public void verifyAboutPageArticlesPresence() {
		waitForPageElement(getAboutPageArticles(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "About Page Articles");
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
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Instagram Icon");
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
