package com.bridgelabz.SeleniumAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		
		Robot robot = new Robot();
		
		/***Mouse Move***/
		robot.mouseMove(300, 500);
		Thread.sleep(3000);
		robot.mouseWheel(1);
		Thread.sleep(3000);
		robot.mouseWheel(-1);
		
		//****Keyboard***//
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		
		driver.quit();


	}

}
