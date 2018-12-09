package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Ravi/Desktop/drop.html");
		
		Select drpcountry=new Select(driver.findElement(By.name("country")));
		drpcountry.selectByVisibleText("AUS");
		Select drpcompany=new Select(driver.findElement(By.name("company")));
		//drpcompany.selectByVisibleText("XEROX");
		drpcompany.selectByIndex(1);
		Thread.sleep(1000);
		drpcountry.selectByVisibleText("CANADA");
		drpcompany.selectByVisibleText("CGI");
		//drpcompany.selectByIndex(4);
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
	

}
