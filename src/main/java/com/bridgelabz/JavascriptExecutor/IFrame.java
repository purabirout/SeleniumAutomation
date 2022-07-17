package com.bridgelabz.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {
	WebDriver driver = null;

    @BeforeMethod
    public void initialization(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void frameDemo() throws InterruptedException {

        driver.get("C:/Users/avije/OneDrive/Documents/Page2.html");
        driver.findElement(By.id("t2")).sendKeys("T2 Text Field");
        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("T1 text Field");
        Thread.sleep(2000);
        driver.switchTo().parentFrame();

        driver.switchTo().frame("f2");
        driver.findElement(By.id("t3")).sendKeys("T3 text Field");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.id("t2")).clear();
    }
    @AfterMethod
    public void closeDriver(){
        try{
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
	 }
