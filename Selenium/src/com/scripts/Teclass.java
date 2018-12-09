package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teclass {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
		
		
	    driver.get("file:///C:/Users/Ravi/Desktop/htm.html");
	    driver.findElement(By.xpath("//input[2]")).clear();
	    
		//driver.findElement(By.xpath("//input[3]")).click();
		//Thread.sleep(2000);
		
		
	    //driver.get("file:///C:/Users/Ravi/Desktop/htm.html");
		//driver.findElement(By.xpath("//input[1]")).clear();
		//Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//input[4]")).click();
		//Thread.sleep(2000);
		
		//driver.get("file:///C:/Users/Ravi/Desktop/htm.html");
		//driver.findElement(By.xpath("//input[2]")).sendKeys("xyz");
		
		//driver.findElement(By.linkText("GOOGLE")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
	}
}
//input type="checkbox" <br=""



//input type="radio" value="abc