package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssexample {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.cssSelector("#login1")).sendKeys("hello");
		Thread.sleep(1000);
		driver.quit();
		
	}

}
