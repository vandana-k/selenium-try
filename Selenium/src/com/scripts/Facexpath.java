package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facexpath {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		//driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[1]/div/form/div/div[3]/div[2]/a")).click();
		//driver.findElement(By.xpath("html/body/div[7]/div[2]/div[3]/div[5]/div[1]/div/div[3]/div/div/a/span")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[5]/a[6]/div/u")).click();
		
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[7]/div[2]/div[3]/div[11]/div[3]/div/div/a/span")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}
