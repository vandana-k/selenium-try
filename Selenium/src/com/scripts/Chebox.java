package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chebox {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Ravi/Desktop/che.html");
		//driver.findElement(By.xpath("//tr[2]/td[2]")).click();
	boolean status=	driver.findElement(By.xpath("//tr[1]/td[1]")).isSelected();
	
	if (status==true)
	{
		System.out.println("check box is selected");
	}
	else
	{
		System.out.println("check box is not selected");
	}
		driver.close();
	}

}
