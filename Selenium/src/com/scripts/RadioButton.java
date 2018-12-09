package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Ravi/Desktop/htm.html");
		driver.findElement(By.xpath("//input[4]")).click();
		Thread.sleep(2000);
		
}
}