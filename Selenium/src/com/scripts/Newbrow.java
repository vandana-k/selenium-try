package com.scripts;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newbrow {


public static void main(String args[])  throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.amazon.in/");
	String text=driver.findElement(By.xpath("html/body/div[1]/header/div/div[3]/div[1]/div[1]/span/a/div[2]/span[1]")).getText();
	System.out.println(text);
	//driver.findElement(By.id("nav-your-amazon")).click();
	
	
	//driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
	/*System.out.println(driver.getTitle());
	 driver.findElement(By.id("login1")).sendKeys("vandana");
    //   String username  = driver.findElement(By.id("login1")).sendKeys("vandana");
	driver.findElement(By.id("password")).sendKeys("selenium");
	driver.findElement(By.id("remember"));
	driver.findElement(By.name("proceed")).click();*/

	//driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/a/img")).click();
	
	//driver.findElement(By.xpath("html/body/div[2]/div[5]/a[3]/div/u")).click();
   
	Thread.sleep(1000);
	driver.quit();
}
}
