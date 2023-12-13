package com.rahulshettyacademy.moolya.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {

	public WebDriver driver;
	
	public FileUtility utils = new FileUtility();
	public WebDriverUtility waits = new WebDriverUtility();
	
	@BeforeMethod
	
	public void executeBeforeMethod() throws IOException
	{
		if(utils.readValueFromPropertyFile("browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (utils.readValueFromPropertyFile("browser").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if (utils.readValueFromPropertyFile("browser").equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		else if (utils.readValueFromPropertyFile("browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		waits.implicitWait(driver);
		driver.get(utils.readValueFromPropertyFile("url"));		
	}
	
	// @AfterMethod
	
	public void executeAfterMethod()
	{
		driver.manage().window().minimize();
		driver.quit();
	}
}
