package com.bridgelabz.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathSector {
	public static void facebookElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[starts-with@id,'u_0_2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Purabi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rout");
		driver.findElement(By.xpath("//input[contains@name,'reg_email_']")).sendKeys("7894336335");
		driver.findElement(By.xpath("//input[contains@name,'reg_passwd_']")).sendKeys("hdeueh67365");
		
	}
}
