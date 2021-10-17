package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("SBC", Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MAS", Keys.TAB);
		
		
		// For WebTable
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		
		// for Rows
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		WebElement secRow = allRows.get(1);	
		
		// for Columns
		List<WebElement> allColumns = secRow.findElements(By.tagName("td"));
		String text = allColumns.get(1).getText();
		
		System.out.println(text);
		
		
	
		
		
		
	}

}
