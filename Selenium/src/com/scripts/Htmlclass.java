package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Htmlclass {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Ravi/Desktop/mypage.html");
		String text= driver.findElement(By.xpath("//tr[2]/td[1]")).getText();
		System.out.println(text);
		String text1 = driver.findElement(By.xpath("//tr[2]//td[3]")).getText();
		System.out.println(text1);
		Thread.sleep(2000);
		
		//System.out.println(text);
		driver.quit();
		
	}

}
//<td>james</td>