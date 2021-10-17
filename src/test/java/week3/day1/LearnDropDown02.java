package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown02 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		/**
		 * selectByVisible
		 * selectByValue
		 * selectByIndex
		 */
// Single Value - Dropdown	
		WebElement ani = driver.findElement(By.id("animals"));
		Select dd = new Select(ani);
		dd.selectByIndex(3);
		
		// dd.selectByVisibleText("Baby Cat");
		// dd.selectByValue("big baby cat");
		
// Multi Value - Dropdown
		WebElement food = driver.findElement(By.xpath("//select[@id='second']"));
		Select dd1 = new Select(food);
		dd1.selectByIndex(0);
		dd1.selectByIndex(1);
		dd1.selectByIndex(2);
		dd1.selectByIndex(3);
		
		dd1.deselectByIndex(1);
		
		
		
	}

}
