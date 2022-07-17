package com.bridgelabz.SeleniumAutomationWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("routpurabi96@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("purvi321");
		WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[starts-with@id,'u_0_2']")));
		driver.findElement(By.xpath("//a[starts-with@id,'u_0_2']")).click();
		driver.close();

	}
	

}
