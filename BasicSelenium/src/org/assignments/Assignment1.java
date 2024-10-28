package org.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigate into instagram, facebook & Flipkart
		driver.get("https://www.instagram.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);

		// come back to the instagram page and fetch the url of the webpage and print in
		// the console
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);
		String instagramUrl = driver.getCurrentUrl();
		System.out.println("Instagram url:" + instagramUrl);
	

		// go forward to the flipcart application and fetch the url of the webpage and
		// print in the console
		driver.navigate().forward();
		driver.navigate().forward();
		Thread.sleep(1000);
		String flipcartUrl = driver.getCurrentUrl();
		System.out.println("Flipcart Url:" + flipcartUrl);
	

		// come back to the facebook application to fetch the url of the webpage and print in the console
		driver.navigate().back();
		Thread.sleep(1000);
		String facebookUrl = driver.getCurrentUrl();
		System.out.println("Facebook Url:" + facebookUrl);
		

		// go forward to the flipcart and fetch the title of the webpage and print in
		// the console
		driver.navigate().forward();
		Thread.sleep(1000);
		String flikartTitle = driver.getTitle();
		System.out.println("Flipkart title:" + flikartTitle);
	

		// go backward to the instagram and fetch the title of the webpage and print in
		// the console
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);
		String instagramTitle = driver.getTitle();
		System.out.println("Instagram title:" + instagramTitle);
		

		// go forward to the facebook and fetch the address of the webpage and print in
		// the console
		driver.navigate().forward();
		Thread.sleep(1000);
		String facebookAddress = driver.getWindowHandle();
		System.out.println("Facebook Address:"+facebookAddress);
	
		
		//go forward to the instagram and fetch address of the webpage and print in the console
		driver.navigate().back();
		Thread.sleep(1000);
		String instagramAddress=driver.getWindowHandle();
		System.out.println("Instagram Address:"+instagramAddress);
	
	}
}
