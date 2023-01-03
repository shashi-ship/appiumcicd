package com.qa.pages;

import org.openqa.selenium.WebElement;

import com.qa.BaseTest;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SSLSetUp extends BaseTest {
	

	@AndroidFindBy(id="in.smallcase.gateway.sample:id/prodRadioItem") private WebElement envirnomentTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/leprechaunSwitch") private WebElement leprechaunTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/setupBt") private WebElement setuptTxtFld;
	@AndroidFindBy(id="android:id/button1") private WebElement popupTxtFld;

	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"SST\"]/android.widget.ImageView") private WebElement sslTxtFld;
	
    public void toClickOnEnvirnoment() {
    	
    	click(envirnomentTxtFld);
    	
    }
    
  public void toClickOnLaprechaun() {
    	
    	click(leprechaunTxtFld);
    }
  
  public void toClickOnSetup() {
  	
  	click(setuptTxtFld);
  }
  
  public void toClickOnalert() {
		
		click(popupTxtFld);
		
	}
  
  public void toClickOnSSLBtn() {
  	
  	click(sslTxtFld);
  }
  




 
}
