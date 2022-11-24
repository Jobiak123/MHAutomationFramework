package com.jbk.mh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.Page;

public class CCBlogPage extends Page{
	
	
	@FindBy(xpath = "//*[@class='logo-main']")
	private WebElement BlogPageLogo;
	
	@FindBy(xpath = "//h1[@class='blog_title']")
	private WebElement BlogPageHeader;
	
	@FindBy(xpath = "(//a[contains(text(),'Read Article')])[1]")
	private WebElement ReadArticleLink;
	
	@FindBy(xpath = "//span[@class='icon-facebook']")
	private WebElement FacebookIcon;
	
	@FindBy(xpath = "//span[@class='icon-instagram']")
	private WebElement InstagramIcon;
	
	@FindBy(xpath = "(//*[@class='copyright']/a)[1]")
	private WebElement PrivacyPolicyLink;
	
	@FindBy(xpath = "(//*[@class='copyright']/a)[2]")
	private WebElement TermsOfServiceLink;
	
	@FindBy(xpath = "(//*[@class='copyright']/a)[3]")
	private WebElement CookiePolicyLink;
	
	@FindBy(xpath = "(//p[@class='copyright'])[2]")
	private WebElement CopyRightFooter;

		
	public WebElement getBlogPageLogo() {
		return BlogPageLogo;
	}
	
	public WebElement getBlogPageHeader() {
		return BlogPageHeader;
	}
	
	public WebElement getReadArticleLink() {
		return ReadArticleLink;
	}
	
	public WebElement getFacebookIcon() {
		return FacebookIcon;
	}

	public WebElement getInstagramIcon() {
		return InstagramIcon;
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
	

	
	public void waitForCCBlogPageToLoad() {
		waitForPageLoad();
		int count=0;
		while(!driver.getCurrentUrl().contains("carecrew.ai/")){
			explicitWait(1);
			count++;
			if(count==50){
				driver.navigate().refresh();
				//waitForPageLoad();
				explicitWait(10);
			}
			if(count==100){
				System.out.println("break");
				break;
			}
		}
		waitForPageElement(getBlogPageLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Blog Page");
	}

	
	public void verifyBlogPageHeader() {
		isTextPresent(getBlogPageHeader(), "Browse Latest Healthcare Career Resources");
	}
	
	
	public void verifyReadArticleLinkPresence() {
		//getLink("Read Article");
		webDriverHelper.explicitWait(1);
		waitForPageElement(getReadArticleLink(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Read Article Link");
			
	}
	
	public void verifyReadArticleLinkNavigation() {
		webDriverHelper.explicitWait(1);
		waitForPageElement(getReadArticleLink(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Read Article Link");
		jsClick(getReadArticleLink(), "Read Article Link");
		waitForPageLoad();
		String Pagetitle=Page.getPageTitle(); 
		System.out.println("Value::"+Pagetitle);
		webDriverHelper.explicitWait(1);
	    if(Pagetitle.contains("CareCrew")) {
			  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
			  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  }
	    else {
	    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	        Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	        driver.close();
	    }
		}
	
	
	public void verifyFacebookIconPresence() {
		webDriverHelper.explicitWait(1);
		waitForPageElement(getFacebookIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Facebook Icon");
		}
	
	public void verifyInstagramIconPresence() {
		webDriverHelper.explicitWait(1);
		waitForPageElement(getInstagramIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Instagram Icon");
		}
	
		
	public void verifyFacebookNavigation() {
		webDriverHelper.explicitWait(1);
		waitForPageElement(getFacebookIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Facebook Icon");
		jsClick(getFacebookIcon(), "Facebook Icon");
		waitForPageLoad();
		String Pagetitle=Page.getPageTitle(); 
		System.out.println("Value::"+Pagetitle);
	    if(Pagetitle.contains("Facebook")) {
			  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
			  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  }
	    else {
	    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	        Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
	        driver.close();
	    }
		}
	
	public void verifyInstagramNavigation() {
		webDriverHelper.explicitWait(1);
		waitForPageElement(getInstagramIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Instagram Icon");
		jsClick(getInstagramIcon(), "Instagram Icon");
		waitForPageLoad();
		String Pagetitle=Page.getPageTitle(); 
		 System.out.println("Value::"+Pagetitle);
		if(Pagetitle.contains("Instagram")) {
		  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
	  }
		  else {
		    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		        Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		        driver.close();
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
		        Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		        driver.close();
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
		if(Pagetitle.contains("TOS")) {
		  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
	  }
		  else {
		    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		        Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		        driver.close();
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
		if(Pagetitle.contains("Cookies")) {
		  AtuReports.passResults1("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
		  Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and navigated to" +Pagetitle);
	  }
		  else {
		    	AtuReports.failResults("Verify navigation to"  +Pagetitle, Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		        Reporter.LogEvent(TestStatus.PASS, "Verify navigation to"  +Pagetitle, "Should be clicked and navigated to " +Pagetitle ,"Is clicked and not navigated to" +Pagetitle);
		        driver.close();
		    }
	}

	
	public void verifyCopyRightFooter() {
		isTextPresent(getCopyRightFooter(), "Copyright");	
	}
		

	

}
