package com.bridgelabz.WindowsHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentWindowHandled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String idString = driver.getWindowHandle();
		System.out.println("ID"+idString);

	}

}
