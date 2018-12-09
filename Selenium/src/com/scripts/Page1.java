package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page1 {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Ravi/Desktop/page1.html");
		//driver.switchTo().frame("f1");
		driver.findElement(By.id("textbox")).sendKeys("Abc");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
	
			
		driver.quit();
	}

}
