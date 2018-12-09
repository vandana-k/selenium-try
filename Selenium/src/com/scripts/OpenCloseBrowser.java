package com.scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseBrowser 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		//driver.get("http://www.gmail.com");
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		
		String title=driver.getTitle();
		String URL=driver.getCurrentUrl();
		System.out.println("title"+title);
		System.out.println("URL"+URL);
		
			
		Thread.sleep(3000);
		
		driver.quit();
	}

}
