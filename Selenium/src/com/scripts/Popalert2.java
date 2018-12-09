package com.scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popalert2 {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.vrlbus.in");
		driver.findElement(By.id("TRIPSTARTDATE")).click();
		driver.findElement(By.linkText("31")).click();
		/*System.out.println("linkText");
		Alert a=driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);*/
		
		
	
		Thread.sleep(1000);
		//a.accept();
		driver.quit();
		
		
	}

}
