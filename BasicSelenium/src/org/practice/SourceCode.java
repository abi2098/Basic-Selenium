package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SourceCode {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
}
