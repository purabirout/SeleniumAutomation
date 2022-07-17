package com.bridgelabz.SeleniumAutomation;

import java.sql.DriverManager;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserInput {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome for Selection of web Browser");
		UserInput userinput = new UserInput();
		 int  option;
		 option =  userinput.showMainMenu();
		userinput.launchBrowser(option);
		 
	}
		
	public int launchBrowser(int option) throws InterruptedException {
		//System.out.println("Enter Browser Name You Want to see");
		WebDriver driver;
		switch(option) {
		case 1:
			System.out.println("Welcome to Chrome Web Browser");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.close();
			break;
		case 2:
			System.out.println("Welcome to Mozila Web Browser");
			System.setProperty("webdriver.gecko.driver","C:\\Users\\avije\\eclipse-workspace\\SeleniumAutomation\\Driver\\geckodriver.exe");
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.close();
			break;	
		}
		return option;		
		
}

	public  int showMainMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1:chrome \n2: firefox");
		int option = scanner.nextInt();
		return option;
	}

}
