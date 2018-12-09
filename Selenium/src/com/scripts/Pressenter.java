package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pressenter {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
