package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browactions {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("http://demo.actitime.com");
		//driver.get("https://www.amazon.in");
		
		//driver.navigate().to("http://google.com");
		//Thread.sleep(8000);
		//driver.quit();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.quit();
		
		}

}
