package org.cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String colour = driver.findElement(By.cssSelector("a[class='ico-register']")).getCssValue("color");
		System.out.println(colour);
		driver.get("https://rgbacolorpicker.com/rgba-to-hex");
		WebElement r = driver.findElement(By.cssSelector("input[id='color-r']"));
		r.clear();
		r.sendKeys("175");
		WebElement g = driver.findElement(By.cssSelector("input[id='color-g']"));
		g.clear();
		g.sendKeys("3");
		WebElement b = driver.findElement(By.cssSelector("input[id='color-b']"));
		b.clear();
		b.sendKeys("4");
		WebElement a = driver.findElement(By.cssSelector("input[id='color-a']"));
		a.clear();
		a.sendKeys("1");
		String hexValue = driver.findElement(By.cssSelector("div[class='cursor-pointer select-all text-xl tracking-wider']")).getText();
		System.out.println(hexValue);

	}
}
