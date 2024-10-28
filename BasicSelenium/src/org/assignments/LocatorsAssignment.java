package org.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAssignment {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(1000);
	driver.findElement(By.name("username")).sendKeys("abiramikumaresan98@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("Shanthi@20");
	Thread.sleep(1000);
	driver.findElement(By.className("_acas")).click();
}
}
