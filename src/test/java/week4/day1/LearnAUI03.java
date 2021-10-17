package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI03 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Gaming")).click();
		
		
	}

}












