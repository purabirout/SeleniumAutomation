package com.bridgelabz.SeleniumAutomationWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ImplecitWait {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/** redirect chrome browser to the URL**/
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//**Maximize the browser window**/
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("routpurabi@gmail.com");
		/**Take a screenshot of browser**/
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshot/" + "facebook" + ".png");
		FileHandler.copy(srcFile, destFile);
	}

}
