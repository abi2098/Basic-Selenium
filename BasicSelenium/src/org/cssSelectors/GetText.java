package org.cssSelectors;

import java.nio.file.spi.FileSystemProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String text=driver.findElement(By.cssSelector("a[class='ico-register']")).getText();
	System.out.println(text);
}
}
