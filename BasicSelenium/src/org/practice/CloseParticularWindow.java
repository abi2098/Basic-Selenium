package org.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParticularWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("---Printing the each and every page address--");

		Set<String> allWindow = driver.getWindowHandles();
		// Close particular window
		for (String eachWindow : allWindow) {
			driver.switchTo().window(eachWindow);
			String url = driver.getCurrentUrl();
			if (url.contains("https://www.instagram.com/")) {
				driver.close();
			}
		}
		
		// close all the window using if else
		for (String eachWindow : allWindow) {
			driver.switchTo().window(eachWindow);
			String url = driver.getCurrentUrl();
			if (url.contains("https://www.facebook.com/")) {
				driver.close();
			} else if (url.contains("https://www.instagram.com/")) {
				driver.close();

			} else {
				driver.close();
			}
		}
			
		
	}

	}

