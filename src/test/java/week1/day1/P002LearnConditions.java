package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P002LearnConditions {
	
	/**
	 * 
	 * if else -condition
	 * ------------------
	 * 1)
	 * 
	 * if(condition){
	 * 
	 * 			body of the if
	 * 
	 * }
	 * 
	 * 2)
	 * if(condition){
	 * 
	 * 			body of the if
	 * 
	 * }else{
	 * 
	 *  		body of the else
	 *  
	 *  }
	 * 
	 * 3)
	 * if(condition){
	 * 
	 * 		body of the if
	 * 
	 * }else if(condition){
	 * 
	 * 		body of the else if
	 * 
	 * }else{
	 * 
	 * 		body of the else
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(100%2 == 1);
		
		
		int age = 19;
		
		if(age < 18) {
			System.out.println("minor");
		}else if(age >= 18 && age < 60){
			System.out.println("adult");
		}else if(age >= 60 && age < 80) {
			System.out.println("Senior Citizen");
		}else {
			System.out.println("Super Senior");
		}
		
		
		String browser = "edge";
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver drive = new FirefoxDriver();
			
		}else if(browser.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			
		}else {
			System.out.println("Unexpected input was given");
		}
		
		
		
		
		
	}

}
