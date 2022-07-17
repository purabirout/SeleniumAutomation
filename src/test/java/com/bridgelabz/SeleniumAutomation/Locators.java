package com.bridgelabz.SeleniumAutomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
	@Test
	public void locators() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		/*WebElement emaiElement  = driver.findElement(By.id("email"));
		
		emaiElement.sendKeys("routpurabi96@gmail.com");
		Thread.sleep(3000);
		emaiElement.clear();
		
		driver.findElement(By.id("pass")).sendKeys("123456");*/
		driver.findElement(By.partialLinkText("Create New Account")).click();
		Thread.sleep(3000);
		WebElement firstnameElement  = driver.findElement(By.name("firstname"));
		firstnameElement.sendKeys("Purabi");
		Thread.sleep(3000);
		firstnameElement.clear();
		driver.findElement(By.name("lastname")).sendKeys("Rout");
		driver.findElement(By.cssSelector("#login-logIn"));
		
		
		driver.findElement(By.id("password_step_input")).sendKeys("New password");
		Thread.sleep(3000);
		driver.findElement(By.id("day")).sendKeys("12");
		Thread.sleep(3000);
		driver.findElement(By.id("month")).sendKeys("jul");
		Thread.sleep(3000);
		driver.findElement(By.id("year")).sendKeys("2021");
		
		Thread.sleep(3000);
		driver.close();
	}
}