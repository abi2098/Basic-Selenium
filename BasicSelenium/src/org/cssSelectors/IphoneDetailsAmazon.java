package org.cssSelectors;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneDetailsAmazon {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("");
	driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("iphone",Keys.ENTER);
	
	
}
}
