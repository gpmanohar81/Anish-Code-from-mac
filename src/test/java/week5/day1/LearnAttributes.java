package week5.day1;

import org.testng.annotations.Test;

import wrapper.GenericWrapper;
import wrapper.ProjectSpecificWrapper;

public class LearnAttributes extends GenericWrapper{
	
	public void loginOpenTaps() {
		invokeBrowser("chrome", "http://iarchtaps.com:8080/opentaps/control/main");
		clearAndType(locSelector("id", "username"), "DemoSalesManager");
		clearAndType(locSelector("id", "password"), "crmsfa");
		click(locSelector("class", "decorativeSubmit"));
		click(locSelector("link", "CRM/SFA"));
	}

	// invocationCount = 3
	// invocationCount = 3, threadPoolSize = 3
	// invocationCount = 3, invocationTimeOut = 50000
	
	
	@Test(invocationCount = 100, successPercentage = 70)
	public void createLead(){
		loginOpenTaps();
		click(locSelector("link", "Leads"));
		click(locSelector("link", "Create Lead"));
		close();
	}	
}
