package opentaps.lead;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class CreateLead extends ProjectSpecificWrapper{
	
	@BeforeTest
	public void beforeTest() {
		testCaseName = "TC001_CreateLead";
		testCaseDec = "Create a new Lead in Opentaps";
		author= "Anish";
		category = "Sanity";
		device = "Win 10";
		excelName = "TC001";
	}
	
	

	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName){
		click(locSelector("link", "Leads"));
		click(locSelector("link", "Create Lead"));
		clearAndType(locSelector("id", "createLeadForm_companyName"), cName);
		clearAndType(locSelector("id", "createLeadForm_firstName"), fName);
		clearAndType(locSelector("id", "createLeadForm_lastName"), lName);
		selectDropDownUsingText(locSelector("id", "createLeadForm_dataSourceId"), "Direct Mail");
		selectDropDownUsingIndex(locSelector("id", "createLeadForm_marketingCampaignId"), 2);
		clearAndType(locSelector("id", "createLeadForm_primaryEmail"), "anish@gmail.com");
		clearAndType(locSelector("id", "createLeadForm_primaryPhoneNumber"), "+144556677");
		click(locSelector("xpath", "//input[@name='submitButton']"));
	}
	
}
