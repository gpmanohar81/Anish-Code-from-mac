package opentaps.lead;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;


public class EditLead extends ProjectSpecificWrapper {
	
	@BeforeTest
	public void beforeTest() {
		excelName = "TC002";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void editLead() throws InterruptedException{
		click(locSelector("link", "Leads"));
		click(locSelector("link", "Find Leads"));
		clearAndType(locSelector("xpath", "(//label[contains(text(),'First name:')])[3]/following::input[1]"), "Anish");
		click(locSelector("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(5000);
		String sText = getTypedText(locSelector("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locSelector("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		verifyTitle("View Lead | opentaps CRM");
		click(locSelector("xpath", "//a[contains(text(),'Edit')]"));
		selectDropDownUsingText(locSelector("id","updateLeadForm_industryEnumId"), "Computer Software");
		click(locSelector("xpath", "//input[@class='smallSubmit']"));
	}
}
