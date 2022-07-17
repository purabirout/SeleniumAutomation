package com.bridgelabz.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpAndDownForSpecificElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("close")).click();
		try {
			WebElement element = driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]"));
			element.click();
			int x = element.getLocation().getX();
			int y = element.getLocation().getY();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+x+", "+y+")");
		} catch (StaleElementReferenceException e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(3000);

	}

}
