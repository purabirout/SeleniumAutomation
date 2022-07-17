package com.bridgelabz.WindowsHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.findElement(By.linkText("Register now")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of Browser windows opened on the system is: "+count);
		for(String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			System.out.println("Title"+title);
			System.out.println("ID"+windowHandle);
		}

	}

}
