package week7.day1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnReports {
	
	public static void main(String[] args) {
		
		// File Level - BS
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/result.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		
		// BT
		
		// TestCase Level - BC
		ExtentTest test = extent.createTest("TC001_CreateLead", "Create a new Lead in lead forms");
		test.assignAuthor("Anish");
		test.assignCategory("Smoke");
		test.assignDevice("Win 10");
		
		
		// Step Level
		test.pass("The Data DemoSalesManager entered successfully");
		test.fail("The Data crmsfa couldn't enter");
		test.pass("The Element Login clicked successfully");
		
		// final Level - AS
		extent.flush();
		
	}

}
