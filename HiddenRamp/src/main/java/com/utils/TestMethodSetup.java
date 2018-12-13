package com.utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestMethodSetup {
	
protected static WebDriver driver;
	
	@BeforeSuite
    public void openBrowser() throws Exception
	{
		
		FileInputStream file=new FileInputStream("/Users/rahulchowdhary/eclipse-workspace/HiddenRamp/src/config.properites");
		Properties prop=new Properties();
		prop.load(file);
		String br;
		br=prop.getProperty("browser");
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/rahulchowdhary/eclipse-workspace/HiddenRamp/lib/chromedriver");
			driver=new ChromeDriver();
			//driver.manage().window().maximize();
			ChromeOptions chromeOptions = new ChromeOptions(); 
			chromeOptions.addArguments("--kiosk");
			driver = new ChromeDriver(chromeOptions);
		
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "/Users/rahulchowdhary/eclipse-workspace/HiddenRamp/lib/geckodriver");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		
		
		}
	
	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
		
	}



}
