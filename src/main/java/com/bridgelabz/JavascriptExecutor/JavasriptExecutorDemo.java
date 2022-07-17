package com.bridgelabz.JavascriptExecutor;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavasriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/avije/OneDrive/Documents/DisableTextBox.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value=''");
		js.executeScript("document.getElementById('t2').value='manager'");
		js.executeScript("document.getElementById('t2').type='button'");
	}

}
