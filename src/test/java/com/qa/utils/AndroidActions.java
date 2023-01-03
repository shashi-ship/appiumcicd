package com.qa.utils;

import com.google.common.collect.ImmutableMap;
import com.qa.BaseTest;

import io.appium.java_client.remote.SupportsContextSwitching;



public class AndroidActions extends BaseTest {
	
	//static AndroidDriver driver;
	
	
	
	
	public static void toEnterKeyboardSearch() {
		
		   driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		
	
		
		   
		   
		   
	}
	
	
	public static void toSwitchContext(String s) {
		
		   ((SupportsContextSwitching) driver).context(s);
		
	
		
		   
		   
		   
	}

}
