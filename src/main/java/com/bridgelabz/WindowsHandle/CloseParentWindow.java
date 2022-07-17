package com.bridgelabz.WindowsHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		String parentID = driver.getWindowHandle();
		driver.findElement(By.linkText("Register now")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		 for(String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			if(windowHandle.equals(parentID));
			driver.close();
	}

}
}