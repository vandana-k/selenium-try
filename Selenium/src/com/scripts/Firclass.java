package com.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firclass {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://amazon.in");
		//driver.findElement(By.id("searchtex")).sendKeys("text");
		//driver.findElement(By.id("bookmarks")).sendKeys("launchbutton");
		
		//driver.findElement(By.xpath("//a[@tabindex='21']")).click();
		//driver.findElement(By.linkText("Today's Deals"));
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Amazon Pay")).click();
		
		driver.findElement(By.linkText("Sell")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}

//a class="nav-a" tabindex="21" href="/gp/goldbox?ref=nav_topnav_deals">Today's Deals</a>

//<button id="bookmarks" class="launchButton">Bookmarks</button>
//input type="submit" jsaction="sf.chk" name="btnK" aria-label="Google Search" value="Google Search"