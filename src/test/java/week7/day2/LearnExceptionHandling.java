package week7.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExceptionHandling {

	// try catch finally
	// throw throws
	
	public static void method1() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		method1();
	}

	
}
