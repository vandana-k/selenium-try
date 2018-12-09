package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Forpass {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
	//WebElement text =	driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div/form/div/div[3]/div[2]/a"));
	//System.out.println(text);	
		
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div/form/div/div[3]/div[2]/a")).click();
		Thread.sleep(1000);
	driver.quit();
	}

}
