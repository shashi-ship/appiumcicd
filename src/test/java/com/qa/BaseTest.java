package com.qa;

import org.testng.annotations.Test;

import com.qa.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;


public class BaseTest {
	protected static AppiumDriver driver;
	protected static  Properties props;
	InputStream inputStream;
	
	public BaseTest() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	@BeforeClass
	public void AppiumConfigration() {
		
		 UiAutomator2Options optios=new UiAutomator2Options();
		   optios.setChromedriverExecutable("C:\\Users\\User\\Downloads\\chromedriver_win322");
		   
	}
	
	
     @Parameters ({"platformName","platformVersion","deviceName"})
     @BeforeTest
     public void beforeTest(String platformName,String platformVersion,String deviceName ) throws Exception {
	  try {
		  
		  props =new Properties();
		  String propFileName="config.properties";
		  
		  inputStream=getClass().getClassLoader().getResourceAsStream(propFileName); 
		  props.load(inputStream);
		  DesiredCapabilities desiredCapbilities=new DesiredCapabilities();
		  
		  desiredCapbilities.setCapability("platformName", platformName);
		  desiredCapbilities.setCapability("plaformVersion", platformVersion);
		  desiredCapbilities.setCapability("deviceName", deviceName);
		  desiredCapbilities.setCapability("automationName", props.getProperty("androidAutomationName"));
		  desiredCapbilities.setCapability("appPackage", props.getProperty("androidAppPackage"));
		 // desiredCapbilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		 // desiredCapbilities.setCapability("chromedriverExecutable", "Users\\User\\Downloads\\chromedriver_win322");
	      // desiredCapbilities.setCapability("avd", "ZF6226SWNJ");
		  // String appUrl=getClass().getClassLoader().getResource(props.getProperty("androidAppLocation")).getFile();
		   
		   String appUrl=System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+
		   File.separator+"app"+File.separator+"e9905d84-e9ad-4953-b35c-42ee2135bde1.apk";
		   
	      desiredCapbilities.setCapability("app",appUrl);
	       URL url=new URL(props.getProperty("appiumURL"));
	       driver =new AndroidDriver(url,desiredCapbilities);
	       String sessionId=driver.getSessionId().toString();

		  
	  }
	  catch(Exception e) {
		  e.printStackTrace();
		  throw e;
		  
	  }
	  
 
	 
 }
  
  public void waitForVisibility(WebElement e) {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(TestUtils.WAIT));
		 wait.until(ExpectedConditions.visibilityOf(e));
		
		
  }
  
  
  
  public void click(WebElement e) {
	  waitForVisibility(e);
	 
	  e.click();
	  
  }
  public void sendKeys(WebElement e ,String txt) {
	  waitForVisibility(e);
	  e.sendKeys(txt);
	  
	 
	  
  }
  
	
	 public String getText(WebElement e ,String attribute) {
	 waitForVisibility(e);
	 return e.getText();
	 
	
	 }
	 
	 
  

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
