package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hrefurl {
public static void main(String args[]) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Ravi/Desktop/url.html");
	driver.findElement(By.xpath("//a[1]"));
	driver.findElement(By.xpath("//a[2]/input"));
	
	Thread.sleep(1000);
	driver.quit();
	
}
}
