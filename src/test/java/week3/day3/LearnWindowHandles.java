package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandles {
	
	public static void main(String[] args) {		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Try it Yourself »")).click();
		
		driver.findElement(By.xpath("")).click();
		
		
		/**
		 * getWindowHandle:   return current active window ref and its return String(String)
		 * getWindowHandles:  return all window ref's and its returns Set<String>
		 * 
		 */
		
		System.out.println(driver.getTitle());
	
		// Window Handle - first to second
		Set<String> allWin = driver.getWindowHandles();
		List<String> lt = new ArrayList<String>(allWin);
		driver.switchTo().window(lt.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("tryhome")).click();
		
		// Window Handle - Second to 3rd
		allWin = driver.getWindowHandles();
		lt = new ArrayList<String>(allWin);
		driver.switchTo().window(lt.get(2));
		
		System.out.println(driver.getTitle());
		
		// 3rd to 1st
		driver.switchTo().window(lt.get(0));
		
	}

}
