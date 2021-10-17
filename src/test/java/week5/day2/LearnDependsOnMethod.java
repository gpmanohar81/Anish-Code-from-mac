package week5.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {
	
	@Test(expectedExceptions = RuntimeException.class)
	public void createLead() {
		System.out.println("CreateLead");
		throw new RuntimeException();
	}
	
	@Test(enabled = false)
	public void editLead() {
		System.out.println("EditLead");
	}
	
	@Test (dependsOnMethods = "createLead", alwaysRun = true)
	public void deleteLead() {
		System.out.println("DeleteLead");
	}
	
	@Test
	public void mergeLead() {
		System.out.println("MergeLead");
	}

}
