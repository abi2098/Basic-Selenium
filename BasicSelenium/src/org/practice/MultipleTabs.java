package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com");
	//to open the new tab
	driver.switchTo().newWindow(WindowType.TAB);
	//navigate into instagram page
	driver.get("https://www.instagram.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.facebook.com");	
}
}
