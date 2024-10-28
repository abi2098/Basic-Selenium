package org.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathReview {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abi070@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	
	driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
	driver.findElement(By.xpath("(//a[text()='Computing and Internet'])[2]")).click();
	driver.findElement(By.xpath("//a[text()='Add your review']")).click();
	
	driver.findElement(By.xpath("//input[contains(@id,'Title')]")).sendKeys("Happy Review");
	driver.findElement(By.xpath("//textarea[contains(@id,'ReviewText')]")).sendKeys("I am very satisfied about your product");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	Thread.sleep(1000);
	driver.quit();
	
}
}
