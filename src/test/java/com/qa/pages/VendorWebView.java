package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.BaseTest;
import com.qa.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;

public class VendorWebView extends BaseTest {
	
	AndroidDriver androidDriver; 
	
	
	public void toClickOnReview() {
		
    	
		driver.findElement(By.xpath("//button[text()='Review']")).click();
	    	
	    
	    	
	    }
	
	public void toClickOnConfirmedOrder() {
    	
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	    	
	    
	    	
	    }
	
	public void toClickOnPlacedOrder() {
    	
		driver.findElement(By.xpath("//button[text()='Confirm Order']")).click();
	    	
	    
	    	
	    }
	
	
	

}
