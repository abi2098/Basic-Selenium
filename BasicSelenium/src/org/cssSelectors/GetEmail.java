package org.cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetEmail {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("abi070@gmail.com");
	driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("123456");
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
	String loginEmail=driver.findElement(By.cssSelector("a[class='account']")).getText();
	System.out.println(loginEmail);
	
	
}
}
