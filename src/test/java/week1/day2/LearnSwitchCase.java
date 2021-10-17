package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSwitchCase {

	public static void main(String[] args) {

		String browser = "chrome";

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
			EdgeDriver driver1 = new EdgeDriver();
			break;
		default:
			System.out.println("No Matches");
		}
	}

}
