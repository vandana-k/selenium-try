package com.scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popalert {
public static void main(String args[]) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.vrlbus.in/");
	driver.findElement(By.id("Button1")).click();
	Alert a=driver.switchTo().alert();
	String text = a.getText();
	System.out.println(text);
	
	
	Thread.sleep(2000);
	a.accept();
	driver.close();
}
}
