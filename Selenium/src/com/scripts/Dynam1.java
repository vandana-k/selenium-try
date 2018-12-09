package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynam1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://irctc.com/displayServlet");
		String text=driver.findElement((By.xpath("//p[label[text()='Mumbai']]/label[2]"))).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
