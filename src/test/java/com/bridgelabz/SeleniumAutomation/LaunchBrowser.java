package com.bridgelabz.SeleniumAutomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	public void launchBrowser() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot/" + "facebook" + ".png");
		FileHandler.copy(srcFile, destFile);
		Thread.sleep(5000);
		
//		String title = driver.getTitle();
//		 System.out.println("the title of the page is :"+ title);
//		
		driver.manage().window().maximize();
		
		driver.close();
		//Assert.assertEquals(title,"Facebook-log in or sign up");
	}
	
}
