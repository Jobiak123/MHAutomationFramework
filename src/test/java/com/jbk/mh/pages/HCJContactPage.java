package com.jbk.mh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.Page;

public class HCJContactPage extends Page {
	
	@FindBy(xpath = "//img[@class='logo']")
	private WebElement ContactPageLogo;
	
	@FindBy(xpath = "//div[@class='hd']/h1")
	private WebElement ContactPageHeader;
	
	@FindBy(xpath = "(//*[@class='lt']/ul/li)[3]")
	private WebElement ContactPageAddress;
	
	@FindBy(xpath = "(//*[@class='lt']/ul/li)[2]")
	private WebElement ContactPagePhone;
	
	@FindBy(xpath = "(//*[@class='lt']/ul/li)[1]")
	private WebElement ContactPageMailId;
	
	@FindBy(xpath = "//*[@name='first_name']")
	private WebElement ContactPageFirstName;
	
	@FindBy(xpath = "//*[@name='last_name']")
	private WebElement ContactPageLastName;
	
	@FindBy(xpath = "//*[@name='email']")
	private WebElement ContactPageEmail;
	
	@FindBy(xpath = "//*[@name='phone']")
	private WebElement ContactPagePhoneNumber;
	
	@FindBy(xpath = "//*[@name='zipcode']")
	private WebElement ContactPageZipcode;
	
	@FindBy(xpath = "//*[@name='comments']")
	private WebElement ContactPageMessage;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement ContactPageSubmitBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-warning']")
	private WebElement ContactUsCnfmMsg;
	
	
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

	
	public WebElement getContactPageLogo() {
		return ContactPageLogo;
	}
	
	public WebElement getContactPageHeader() {
		return ContactPageHeader;
	}
	
	public WebElement getContactPageAddress() {
		return ContactPageAddress;
	}
	
	public WebElement getContactPageMailId() {
		return ContactPageMailId;
	}
	
	public WebElement getContactPagePhone() {
		return ContactPagePhone;
	}
	
	
	public WebElement getContactPageFirstName() {
		return ContactPageFirstName;
	}
	
	public WebElement getContactPageLastName() {
		return ContactPageLastName;
	}
	
	public WebElement getContactPageEmail() {
		return ContactPageEmail;
	}
	
	public WebElement getContactPagePhoneNumber() {
		return ContactPagePhoneNumber;
	}
	
	public WebElement getContactPageZipcode() {
		return ContactPageZipcode;
	}
	
	public WebElement getContactPageMessage() {
		return ContactPageMessage;
	}
	
	public WebElement getContactPageSubmitBtn() {
		return ContactPageSubmitBtn;
	}
	
	public WebElement getContactUsCnfmMsg() {
		return ContactUsCnfmMsg;
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
	

	
	public void waitForHCJContactPageToLoad() {
		waitForPageLoad();
		/*
		 * int count=0; while(!driver.getCurrentUrl().contains("healthcarejobs.ai/")){
		 * explicitWait(1); count++; if(count==50){ driver.navigate().refresh();
		 * //waitForPageLoad(); explicitWait(10); } if(count==100){
		 * System.out.println("break"); break; } }
		 */
		waitForPageElement(getContactPageLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Contact Page");
	}


	
	public void verifyContactPageHeader() {
		isTextPresent(getContactPageHeader(), "Drop Us a Line");
	}
	
	public void verifyContactPageDetails() {
		isTextPresent(getContactPageAddress(), "Burlington");
		isTextPresent(getContactPageMailId(), "admin@healthcarejobs.ai");
		isTextPresent(getContactPagePhone(), "+1-617-938-3489");
	}
	
	
	public void verifyTwitterIconPresence() {
		
		waitForPageElement(getTwitterIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "Twitter Icon");
		}
	
	public void verifyLinkedInIconPresence() {
		waitForPageElement(getLinkedInIcon(),
				"WAIT_FOR_ELEMENT_TO_BE_CLICKABLE", "LinkedIn Icon");
		}
	
	public void verifyEnterContactUsDetails() {
		
		  String FName="Jobiak";
		  getContactPageFirstName().sendKeys(FName);
		  AtuReports.passResults1("Verify text is entered to " + FName + " textbox", FName,
					"Text '" + FName + "' should be entered in to " + FName + " textbox",
					"Text '" + FName + "' is entered in to " + FName + " textbox");

		  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + FName + " textbox",
					"Text '" + FName + "' should be entered in to " + FName + " textbox",
					"Text '" + FName + "' is entered in to " + FName + " textbox");
		  webDriverHelper.explicitWait(1);
		  
		  String LName="Medichire";
		  getContactPageLastName().sendKeys(LName);
		  AtuReports.passResults1("Verify text is entered to " + LName + " textbox", LName,
					"Text '" + LName + "' should be entered in to " + LName + " textbox",
					"Text '" + LName + "' is entered in to " + LName + " textbox");

		  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + LName + " textbox",
					"Text '" + LName + "' should be entered in to " + LName + " textbox",
					"Text '" + LName + "' is entered in to " + LName + " textbox");
		  webDriverHelper.explicitWait(1);
		 
		  String Email="Jobiak@medichire.ai";
		  getContactPageEmail().sendKeys(Email);
		  AtuReports.passResults1("Verify text is entered to " + Email + " textbox", Email,
					"Text '" + Email + "' should be entered in to " + Email + " textbox",
					"Text '" + Email + "' is entered in to " + Email + " textbox");

		  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + Email + " textbox",
					"Text '" + Email + "' should be entered in to " + Email + " textbox",
					"Text '" + Email + "' is entered in to " + Email + " textbox");
		
		  webDriverHelper.explicitWait(1);
		  
		  String Phone="+1-617-938-3489";
		  getContactPagePhoneNumber().sendKeys(Phone);
		  AtuReports.passResults1("Verify text is entered to " + Phone + " textbox", Phone,
					"Text '" + Phone + "' should be entered in to " + Phone + " textbox",
					"Text '" + Phone + "' is entered in to " + Phone + " textbox");

		  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + Phone + " textbox",
					"Text '" + Phone + "' should be entered in to " + Phone + " textbox",
					"Text '" + Phone + "' is entered in to " + Phone + " textbox");
		  
		  webDriverHelper.explicitWait(1);
		  
		  String Zipcode="MA 01803";
		  getContactPageEmail().sendKeys(Zipcode);
		  AtuReports.passResults1("Verify text is entered to " + Zipcode + " textbox", Zipcode,
					"Text '" + Zipcode + "' should be entered in to " + Zipcode + " textbox",
					"Text '" + Zipcode + "' is entered in to " + Zipcode + " textbox");

		  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + Zipcode + " textbox",
					"Text '" + Zipcode + "' should be entered in to " + Zipcode + " textbox",
					"Text '" + Zipcode + "' is entered in to " + Zipcode + " textbox");
		  webDriverHelper.explicitWait(1);
		  
		  String Msg="Welcome to Jobiak";
		  getContactPageMessage().sendKeys(Msg);
		  AtuReports.passResults1("Verify text is entered to " + Msg + " textbox", Msg,
					"Text '" + Msg + "' should be entered in to " + Msg + " textbox",
					"Text '" + Msg + "' is entered in to " + Msg + " textbox");

		  Reporter.LogEvent(TestStatus.PASS, "Verify text is entered to " + Msg + " textbox",
					"Text '" + Msg + "' should be entered in to " + Msg + " textbox",
					"Text '" + Msg + "' is entered in to " + Msg + " textbox");
		    
		  webDriverHelper.explicitWait(1);
		  jsClick(getContactPageSubmitBtn(),"Submit Button");
		 	
		  webDriverHelper.explicitWait(1);
			/*
			 * String CnfmMsg=getContactUsCnfmMsg().getText();
			 * System.out.println("Contact Us Message is ::"+CnfmMsg );
			 * isTextPresent(getContactUsCnfmMsg(), "Thanks for");
			 */
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
