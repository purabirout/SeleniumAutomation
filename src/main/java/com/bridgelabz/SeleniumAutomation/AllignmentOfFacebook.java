package com.bridgelabz.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllignmentOfFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement unTB = driver.findElement(By.id("email"));
		int username_Ycordinate = unTB.getLocation().getX();
		System.out.println("username y cordinate"+username_Ycordinate);
		int height = unTB.getSize().getHeight();
		System.out.println("username height"+height);
		WebElement unTB1 = driver.findElement(By.id("pass"));
		int password_Ycordinate = unTB.getLocation().getX();
		int heighty = unTB.getSize().getHeight();
		System.out.println("username height"+heighty);
		System.out.println("password y cordinate"+password_Ycordinate);
		if(username_Ycordinate == password_Ycordinate) {
			System.out.println("Alligned");
		}
		else {
			System.out.println("Not Alligned");
		}
		
	}

}
