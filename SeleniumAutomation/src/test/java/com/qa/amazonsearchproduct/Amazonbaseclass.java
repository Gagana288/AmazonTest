package com.qa.amazonsearchproduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class Amazonbaseclass {
	WebDriver driver;
	AmazonPage Amazonpagetest;
	
	@Parameters({"Browser", "Url"})
	@BeforeClass
	public void setUP(String Browser, String Url)
	{
	ExtentHtmlReporter	htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
			
			 driver=new ChromeDriver(); 
			 driver.manage().window().maximize();
			 
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
			   driver= new EdgeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
			driver= new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
			driver= new InternetExplorerDriver();
		}
		Amazonpagetest=new AmazonPage(driver);
		driver.get(Url);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
}