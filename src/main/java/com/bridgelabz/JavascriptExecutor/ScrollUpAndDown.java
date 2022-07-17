package com.bridgelabz.JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.org/download");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 5; i++) {
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);	
		}
		
		for (int i = 1; i < 5; i++) {
			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(3000);
		}
	}

}
