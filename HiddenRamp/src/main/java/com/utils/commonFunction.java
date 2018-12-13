package com.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class commonFunction extends TestMethodSetup {
	
	
	
	public static boolean elementDisplayedOrNot(String xpath)
	{
		boolean find=driver.findElement(By.xpath(xpath)).isDisplayed();
		return find;
	}
	
	public static void navigateUrl(String url) 
	{
		driver.get(url);
		//Thread.sleep(2000);
		
		
	}
	
	public static void click(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		
	}
	
	public static void enterInput(String xpath, String data)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(data);
		
	}
	
//	public static void verifyTheElementIsPresent(String xpath)
//	{
//		driver.findElement(By.xpath(xpath)).isDisplayed();
//		
//	}
	
	
	public static void DragAndDrop(String xpath_src, String xpath_dest)
	{
		
		WebElement src=driver.findElement(By.xpath(xpath_src));
		WebElement dest=driver.findElement(By.xpath(xpath_dest));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(src, dest);
		ac.build().perform();
	   		
	}
	
	
	public static void doubleClick(String xpath_beforeClick, String xpath_iframe)
	{
		
		driver.switchTo().frame(driver.findElement(By.xpath(xpath_iframe)));
		WebElement ele=driver.findElement(By.xpath(xpath_beforeClick));
		Actions ac=new Actions(driver);
		ac.doubleClick(ele).build().perform();
		driver.quit();
		
	}
	
	
	public static void contextClick(String xpath)
	{
		WebElement ele=driver.findElement(By.xpath(xpath));
		Actions ac=new Actions(driver);
		ac.contextClick(ele);
		ac.build().perform();
		driver.quit();
		
		
	}
	
	public static void keyEvents()
	{
		//WebElement ele=driver.findElement(By.xpath(xpath));
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.COMMAND+"t");
		ac.build().perform();
		
		
	}
	
	public static void mouseHover(String xpath, String xpath1)
	{
		//this is the way to use impllicit wait here (line no--190)
		driver.manage().timeouts().implicitlyWait(43, TimeUnit.SECONDS);
		driver.findElement(By.xpath(xpath1)).click();
		WebElement ele=driver.findElement(By.xpath(xpath));
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).build().perform();
		driver.manage().timeouts().implicitlyWait(32, TimeUnit.DAYS);
		driver.quit();
		
		
		
		
	}
	

	
}
