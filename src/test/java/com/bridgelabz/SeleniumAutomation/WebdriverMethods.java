package com.bridgelabz.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("routpurabi96@gmailcom");
		Thread.sleep(2000);
		String value = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println("Value present inside the text box is : "+value);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("againEnteredpurabi");
		Thread.sleep(2000);
		
		WebElement emaiElement = driver.findElement(By.id("email"));
		if (emaiElement.isEnabled()) {
		System.out.println("email text box is enabled");
		}else {
		System.out.println("email text box is disabled");
		}
		WebElement keepLogin  = driver.findElement(By.name("login"));
		keepLogin.click();
		if (keepLogin.isSelected()) {
			System.out.println("Log In is selected");
			}else{
			System.out.println("Log In is NOT selected");
			}

		
		driver.close();

		
		
	}

}
