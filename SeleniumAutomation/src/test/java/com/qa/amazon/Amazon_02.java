package com.qa.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.AmazonPages;

public class Amazon_02 {
@test
	public  void CreateAccount() {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	AmazonPages AmazonOR=new AmazonPages(driver);
	
	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Famazonprime%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	AmazonOR.getcreateAccountSubmit_btn().click();
	AmazonOR.getcustomernName().sendKeys("gagana");
	AmazonOR.getemail().sendKeys("gagana@gmail.com");
	AmazonOR.getpassword().sendKeys("gagana1");
	AmazonOR.getpassword_check().sendKeys("gagana1");
	AmazonOR.getcreateAccountbtn().click();
	
	driver.close();
	
	
	
	
}
}