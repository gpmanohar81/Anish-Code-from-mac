package day01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSalesforceDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// Step01: Launch the chrome browser
		// ClassName obj = new ClassName();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
				
		// Step02: Load the URL
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Step03: Enter the Username
		driver.findElement(By.id("username")).sendKeys("Anish");
		
		Thread.sleep(2000);   // Compile Time
		
		// Step04: Enter the password
		driver.findElement(By.id("password")).sendKeys("shas");
		
		// Step05: Click the Login button
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // - 500 -500 - 500
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Loginxyz")));
		driver.findElement(By.id("Login")).click();
		
		
		// Step06: Close Browser
		driver.close();
		
	
	
	}

}
