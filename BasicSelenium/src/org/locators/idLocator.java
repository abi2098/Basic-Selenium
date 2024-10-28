package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/ABIRAMI/OneDrive/Desktop/index.html");
	driver.findElement(By.id("user")).sendKeys("selenium@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("pass")).sendKeys("password");
	
	
}
}
