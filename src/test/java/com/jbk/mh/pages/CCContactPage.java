package com.jbk.mh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.jbk.automation.framework.reports.AtuReports;
import com.jbk.automation.framework.util.Reporter;
import com.jbk.automation.framework.util.Reporter.TestStatus;
import com.jbk.automation.framework.webdriver.Page;

public class CCContactPage extends Page{

	@FindBy(xpath = "//*[@class='logo-main']")
	private WebElement ContactPageLogo;
	
	@FindBy(xpath = "//div[@class='container']/h1")
	private WebElement ContactPageHeader;
	
	@FindBy(xpath = "(//*[@class=' contact-info']/div)[1]")
	private WebElement ContactPageAddress;
	
	@FindBy(xpath = "(//*[@class=' contact-info']/div)[2]")
	private WebElement ContactPageMailId;
	
	@FindBy(xpath = "//*[@name='firstname']")
	private WebElement ContactPageFirstName;
	
	@FindBy(xpath = "//*[@name='lastname']")
	private WebElement ContactPageLastName;
	
	@FindBy(xpath = "//*[@name='email']")
	private WebElement ContactPageEmail;
	
	@FindBy(xpath = "//*[@name='message']")
	private WebElement ContactPageMessage;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement ContactPageSubmitBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-warning']")
	private WebElement ContactUsCnfmMsg;
	
	
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
	
	public WebElement getContactPageFirstName() {
		return ContactPageFirstName;
	}
	
	public WebElement getContactPageLastName() {
		return ContactPageLastName;
	}
	
	public WebElement getContactPageEmail() {
		return ContactPageEmail;
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
	

	
	public void waitForCCContactPageToLoad() {
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
		waitForPageElement(getContactPageLogo(),
				"WAIT_FOR_ELEMENT_TO_BE_DISPLAYED", "Contact Page");
	}

	
	public void verifyContactPageHeader() {
		isTextPresent(getContactPageHeader(), "Contact Us");
	}
	
	public void verifyContactPageDetails() {
		isTextPresent(getContactPageAddress(), "Broadway");
		isTextPresent(getContactPageMailId(), "admin");
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
		  String CnfmMsg=getContactUsCnfmMsg().getText();
		  System.out.println("Contact Us Message is ::"+CnfmMsg );
		  isTextPresent(getContactUsCnfmMsg(), "Thanks for");
		  		
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
