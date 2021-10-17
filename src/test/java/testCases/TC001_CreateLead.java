package testCases;



import org.testng.annotations.Test;

import wrapper.GenericWrapper;

public class TC001_CreateLead extends GenericWrapper{
	
	@Test
	public void createLead() {
		invokeBrowser("edge", "http://iarchtaps.com:8080/opentaps/control/main");
		clearAndType(locSelector("id", "username"), "DemoSalesManager");
		clearAndType(locSelector("id", "password"), "crmsfa");
		click(locSelector("class", "decorativeSubmit"));
		click(locSelector("link", "CRM/SFA"));
		click(locSelector("link", "Leads"));
		click(locSelector("link", "Create Lead"));
		clearAndType(locSelector("id", "createLeadForm_companyName"), "PayPal");
		clearAndType(locSelector("id", "createLeadForm_firstName"), "Anish");
		clearAndType(locSelector("id", "createLeadForm_lastName"), "Shas");	
	}
}
