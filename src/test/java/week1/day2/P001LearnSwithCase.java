package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P001LearnSwithCase {


	public static void main(String[] args) {
		//		String browser = "chrome";
		//		if(browser.equals("chrome")) {
		//			WebDriverManager.chromedriver().setup();
		//			ChromeDriver driver = new ChromeDriver();
		//		}else if(browser.equals("firefox")) {
		//			WebDriverManager.firefoxdriver().setup();
		//			FirefoxDriver drive = new FirefoxDriver();
		//		}else if(browser.equals("edge")) {
		//			WebDriverManager.edgedriver().setup();
		//			EdgeDriver driver = new EdgeDriver();
		//		}else {
		//			System.out.println("Unexpected input was given");
		//		}
		//	}
		String browser  = "chrome";

		switch(browser) {
		case "chrome": 
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			break;
		case "firefox": 
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver drive = new FirefoxDriver();
			break;
		case "edge": 
			WebDriverManager.edgedriver().setup();
			EdgeDriver driv = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

	}



}
