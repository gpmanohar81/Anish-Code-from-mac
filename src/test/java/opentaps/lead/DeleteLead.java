package opentaps.lead;



import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;


public class DeleteLead extends ProjectSpecificWrapper {

	@Test
	public void deleteLead() throws InterruptedException{
		click(locSelector("link", "Leads"));
		click(locSelector("link", "Leads"));
		click(locSelector("link", "Find Leads"));
		click(locSelector("xpath", "//span[contains(text(),'Phone')]"));
		clearAndType(locSelector("name", "phoneNumber"), "+144556677");
		click(locSelector("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);
		String sText = getElementText(locSelector("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locSelector("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locSelector("link", "Delete"));
		click(locSelector("link", "Find Leads"));
		Thread.sleep(2000);
		clearAndType(locSelector("xpath", "//label[contains(text(),'Lead ID:')]/following::input"), sText);
		click(locSelector("xpath", "//button[contains(text(),'Find Leads')]"));
		verifyExactText(locSelector("xpath", "//div[@class='x-paging-info']"), "No records to display");
	}
	

}
