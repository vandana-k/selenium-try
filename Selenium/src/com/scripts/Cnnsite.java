package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cnnsite {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://edition.cnn.com/");
		String text = driver.findElement(By.xpath("html/body/div[6]/section[1]/div[2]/div/div[1]/ul/li[1]/article/a/h2")).getText();
		System.out.println(text);
		
		Thread.sleep(1000);
		driver.quit();
	}

}
