package org.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm_Css {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.cssSelector("a[class='ico-register']")).click();
	driver.findElement(By.cssSelector("input[id='gender-female']")).click();
	driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Abirami");
	driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Kumaresan");
	driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("abi070@gmail.com");
	driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("123456");
	driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("123456");
	driver.findElement(By.cssSelector("input[id='register-button']")).click();
}
}
