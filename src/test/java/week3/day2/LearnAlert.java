package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
	//	driver.findElement(By.name("confirmation")).click();
		
		Thread.sleep(2000);
		
		// Simple, Confirmation Alert
		String text2 = driver.switchTo().alert().getText();
		System.out.println(text2);
		
		driver.switchTo().alert().dismiss();
		
		String text = driver.findElement(By.className("title")).getText();
		System.out.println(text);
	}

}
