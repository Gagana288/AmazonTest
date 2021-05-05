package com.qa.amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_01 {
	
	public static void main(String[] args) {
		
		
		
		//open the browser
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();


	//launch the browser
	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Famazonprime%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	//
	WebElement createAccountSubmit_btn=driver.findElement(By.id("createAccountSubmit"));

	 createAccountSubmit_btn.click();
	 
	 //check user landed on register page
	 String CurrentUrl= driver.getCurrentUrl();
	 if (CurrentUrl.contains("amazonprime"))
	 {
		 System.out.println("the user landed on create account");
		 driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("kim smith");
		 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("smith@gmail.com");
		 driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("smitha");
		 driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("smitha");
		 
		 driver.findElement(By.id("a-autoid-0")).click();
		 
	 }
	 else {
		 System.out.println("the user not landed");
	}
	 driver.close();
		}
	}
		

