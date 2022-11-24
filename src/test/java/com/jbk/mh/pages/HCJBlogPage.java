package com.jbk.mh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.Page;

public class HCJBlogPage extends Page {
	
	
	@FindBy(xpath = "//img[@class='logo']")
	private WebElement BlogPageLogo;
	
	@FindBy(xpath = "//*[@class='hd']/h1")
	private WebElement BlogPageHeader;
	
	@FindBy(xpath = "(//div[@class='company-list'])[1]")
	private WebElement BlogArticle;
	
	@FindBy(xpath = "(//div[@class='company-content']/h2/a)[1]")
	private WebElement BlogArticleLink;
	
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

		
	public WebElement getBlogPageLogo() {
		return BlogPageLogo;
	}
	
	public WebElement getBlogPageHeader() {
		return BlogPageHeader;
	}
	
	public WebElement getBlogArticle() {
		return BlogArticle;
	}
	
	public WebElement getBlogArticleLink() {
		return BlogArticleLink;
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
	

	
	public void waitForHCJBlogPageToLoad() {
		waitForPageLoad();
		
		/*
		 * int count=0; while(!driver.getCurrentUrl().contains("healthcarejobs.ai/")){
		 * explicitWait(1); count++; if(count==50){ driver.navigate().refresh();
		 * //waitForPageLoad(); explicitWait(10); } if(count==100){
		 * System.out.println("break"); break; } }
		 */
		
		waitForPageElement(getBlogPageLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Blog Page");
	}

	
	public void verifyBlogPageHeader() {
		isTextPresent(getBlogPageHeader(), "Explore latest healthcare articles");
	}
	
	
	public void verifyBlogPageArticlesPresence() {
		//getLink("Read Article");
		waitForPageElement(getBlogArticle(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Blog page Article Link");
			
	}
	
	public void verifyBlogPageArticlesNavigation() {
		
		waitForPageElement(getBlogArticle(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Blog page Article Link");
		jsClick(getBlogArticleLink(), "Blog page Article Link");
		waitForPageLoad();
		String Pagetitle=Page.getPageTitle(); 
		System.out.println("Value::"+Pagetitle);
		webDriverHelper.explicitWait(1);
	    if(Pagetitle.contains("Resume Writing")) {
			  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
			  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  }
	    else {
	    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	    	driver.close();
	    	Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	        
	    }
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
