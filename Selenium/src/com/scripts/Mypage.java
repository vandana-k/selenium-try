package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mypage {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Ravi/Desktop/HTML%20pgms/mypage1.html");
		
		//WebElement textbox= driver.findElement(By.id("textbox"));
		//textbox.clear();
		//driver.findElement(By.xpath("//input[2]")).clear();
		
		driver.findElement(By.xpath("//input[1]")).clear();
		
		driver.findElement(By.xpath("//input[3]"));
		
		driver.findElement(By.xpath("//input[4]")).click();
		
		driver.findElement(By.xpath("//input[7]")).click();
		
		Thread.sleep(2000);
		
		
		
		
		driver.close();
	}

}
