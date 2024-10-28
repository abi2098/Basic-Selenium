package org.cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement radio = driver.findElement(By.cssSelector("input[id='pollanswers-1']"));
		boolean disabled=radio.isDisplayed();
		System.out.println("Disabled"+disabled);
		if(disabled==true) {
		boolean before = radio.isSelected();
		radio.click();
		boolean after=radio.isSelected();
		System.out.println("Before"+before);
		System.out.println("After"+after);
		}
		else {
			System.out.println("Radio buton is not visible");
		}

	}
}
