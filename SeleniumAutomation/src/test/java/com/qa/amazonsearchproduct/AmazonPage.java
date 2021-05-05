package com.qa.amazonsearchproduct;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
	 WebDriver driver;
		
	 @FindBy(name="url")
	 WebElement Alldropdown;
	 
	 
	 @FindAll(@FindBy(xpath="//option[starts-with(@value,'search-alias=')]"))
	 List<WebElement> Alloptions;
	 
	 public List<WebElement> getAlloptions(){
		 return Alloptions;
	 }
	 @FindBy(xpath="//input[@id='twotabsearchtextbox']")
	 WebElement searchTextField;
	 public WebElement getSearchTextField()
	 {
		 return searchTextField;
		 
	 }
	 
	 @FindBy(xpath="//input[@id='nav-search-submit-button']")
	 WebElement searchBtn;
	 public WebElement getSearchBtn()
	 {
		 return searchBtn;
	 }
	 
	 @FindAll(@FindBy(xpath="//a[@class='a-link-normal a text-normal']"))
	 List<WebElement> ProductNames;
	 public List<WebElement> getProductNames()
	 {
		 return ProductNames;
	 }
	 @FindAll(@FindBy(xpath="//span[@data-color='price']"))
	 List<WebElement> ProductPrices;
	 public List<WebElement> getProductPrices()
	 {
		 return ProductPrices;
	 }
	 public WebElement getAlldropdown()
	 {
		 return Alldropdown;
	 }
	 
	 @FindBy(linkText="New Apple iPhone 12 Mini (128GB) - White") //  Customer Select New Apple iPhone 12 Mini (128GB) - White
	 WebElement customerselectproduct;
	 public WebElement getCustomerProduct()
	 {
		 return customerselectproduct;
	 }
	 @FindBy(id="buy-now-button") //  
	 WebElement customerclickbuynow;
	 public WebElement getCustomerClickBuyNow()
	 {
		 return customerclickbuynow;
	 }
	 
	 
	 
/*	 @FindAll(@FindBy(xpath="//*[@id=\"navFooter\"]/div[4]/ul/li/a"))
	 List<WebElement> footernames;
	 public List<WebElement> getFooterNames()
	 {
		 return footernames;
	 }  */
	 public AmazonPage(WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }
	 
	 
	 

}

