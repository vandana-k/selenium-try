package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebshop {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		//driver.findElement(By.className("ico-login")).sendKeys("tosca@gmail.com");
		
		driver.findElement(By.id("Email")).sendKeys("tosca28@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("tosca9999");
		
		//code to login 
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		////apparel and shoes
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[4]/a")).click();
		
		//item to find blue jeans
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/h2/a")).click();
		
		//driver.findElement(By.id("addtocart_36_EnteredQuantity")).sendKeys("10");
		
		//driver.findElement(By.id("addtocart_36_EnteredQuantity")).sendKeys("10");
		
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[6]/div/input[1]")).sendKeys("0");
	
		driver.findElement(By.id("add-to-cart-button-36")).click();
		
		driver.findElement(By.className("cart-label")).click();
		
		//check out
		//driver.findElement(By.className("button-1 cart-button")).click();
		
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[2]/div/div[4]/input")).click();
		
		//check out
		
		driver.findElement(By.id("termsofservice")).click();
		
		//final check out
		
		driver.findElement(By.id("checkout")).click();
		//driver.findElement(By.className("button-1 ")).click();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
