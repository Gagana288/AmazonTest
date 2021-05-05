package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {
WebDriver driver;
	@FindBy(id="createAccountSubmit")
	WebElement createAccountSubmit_btn;
	
	 public WebElement getcreateAccountSubmit_btn(){
		 return createAccountSubmit_btn;
	 }
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement customernName;
	
	public WebElement getcustomernName() {
		return customernName;
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	
	public WebElement getemail() {
		
		return email;
	}
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	public WebElement getpassword() {
		return password;
	}
	
	@FindBy(xpath="//input[@id='ap_password_check']")
	WebElement password_check;
	
	public WebElement getpassword_check() {
		return password_check;
	}
	@FindBy(id="a-autoid-0")
	WebElement createAccountbtn;
	
	public WebElement getcreateAccountbtn() {
		return createAccountbtn;
	}
	
	
	

public AmazonPages (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}