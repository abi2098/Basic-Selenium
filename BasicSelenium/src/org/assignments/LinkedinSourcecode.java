package org.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinSourcecode {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.linkedin.com/");
	String sourceCode=driver.getPageSource();
	System.out.println(sourceCode);
}
}