package wrapper;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day2.ReadExcel;

public class ProjectSpecificWrapper extends GenericWrapper{
	
	public String excelName;
	
	@Parameters({"browser","uName", "pwd"})
	@BeforeMethod
	public void loginOpenTaps(String browser, String username, String pwd) {
		invokeBrowser(browser, "http://iarchtaps.com:8080/opentaps/control/main");
		clearAndType(locSelector("id", "username"), username);
		clearAndType(locSelector("id", "password"), pwd);
		click(locSelector("class", "decorativeSubmit"));
		click(locSelector("link", "CRM/SFA"));
	}
	
	
	@AfterMethod
	public void closeOpenTaps() {
		close();
	}
	
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		ReadExcel re = new ReadExcel();
		return re.readExcel(excelName);
	}
}
