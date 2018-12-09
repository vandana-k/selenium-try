package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amabro {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.id("username")).sendKeys("admin");
		
		//driver.findElement(By.id("I'am feeling happy")).sendKeys("I'am feeling happy");
		
		driver.findElement(By.name("btnI")).sendKeys("I'am feeling lucky");
		Thread.sleep(2000);
		driver.findElement(By.name("bnK")).sendKeys("google search");
		driver.findElement(By.id("Q8LRLc")).sendKeys("India");
		driver.quit();
				
		
	}

}
//span class="Q8LRLc">India</span>