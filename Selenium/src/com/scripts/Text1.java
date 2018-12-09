package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Ravi/Desktop/text.html");
		driver.findElement(By.xpath("//div[1]/input")).clear();
		Thread.sleep(2000);
		driver.quit();
	}

}
