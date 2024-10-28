package org.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshoGetAddress {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.meesho.com");
	String meeshoAddress=driver.getWindowHandle();
	System.out.println("Meesho Address:"+meeshoAddress);
}
}
