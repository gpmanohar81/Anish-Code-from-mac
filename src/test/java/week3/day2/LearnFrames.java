package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		/**
		 * frame : String, index, webElement
		 * 
		 * 		String: id, name
		 * 		index: index number
		 * 		WebElement: driver.findElement();
		 * 
		 */
		
		// enter into the frame
		WebElement ele = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(ele);
		
		// perform some action
		driver.findElement(By.xpath("//li[text()='Item 1']")).getText();
		
		// comeout from the frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Download")).click();
		
	}

}
