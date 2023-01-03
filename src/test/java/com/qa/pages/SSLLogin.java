package com.qa.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;

import com.google.common.collect.ImmutableMap;
import com.qa.BaseTest;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.SupportsContextSwitching;

import com.qa.utils.AndroidActions;


public class SSLLogin extends BaseTest {
	
	AndroidDriver androidDriver; 
	
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/main_id_name_tv") private WebElement usernameTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/main_id_submit_bt") private WebElement submitBtn;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/prodRadioItem") private WebElement envirnomentTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/leprechaunSwitch") private WebElement leprechaunTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/setupBt") private WebElement setuptTxtFld;
	@AndroidFindBy(id="android:id/button1") private WebElement popupTxtFld;

	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"SST\"]/android.widget.ImageView") private WebElement sslTxtFld;
	
	
	
	
	@AndroidFindBy(accessibility="Search") private WebElement searchTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/search_src_text") private WebElement editSearchTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/search_src_text") private WebElement toClickOnTxtFld;
	
	@AndroidFindBy(xpath=".//android.widget.EditText[@text='IDEA']") private WebElement toPressSearch;


	@AndroidFindBy(xpath=".//android.widget.TextView[@text='IDEA']") private WebElement clickonTxtFld;
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"BUY\"]/android.widget.TextView") private WebElement buyTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/transaction_qty_et") private WebElement quantityTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/transaction_add_bt") private WebElement addTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/transaction_order_bt") private WebElement placeorderTxtFld;

	@AndroidFindBy(id="//div[@class='button__1sZZG']") private WebElement addmore;
	@AndroidFindBy(id="//div[@id=\"app\"]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/button[7]/div") private WebElement motiLalOsWAL;
	
	@AndroidFindBy(id="android:id/message") private WebElement finalPopMessage;
	

	
	
	
    public void enterUsername(String username) {
    	
    	sendKeys(usernameTxtFld,username);
    	
    }
    
 public void pressLoginBtn() {
    	
    	click(submitBtn);
    	
    }
 /*public SSLLogin toClickOnEnvirnoment() {
 	
 	click(envirnomentTxtFld);
 	return this; 
 }
 
public SSLLogin toClickOnLaprechaun() {
 	
 	click(leprechaunTxtFld);
 	return this;
 }

public SSLLogin toClickOnSetup() {
	
	click(setuptTxtFld);
	return this;
}

public SSLLogin toClickOnalert() {
	
	click(popupTxtFld);
	return this;
}

public SSLLogin toClickOnSSLBtn() {
	
	click(sslTxtFld);
	return  this;
}


public SSLLogin toClickOnSearchBox() {
	
	click(searchTxtFld);
	return this;
}

public SSLLogin toEnterValueOnSearchBox(String name) {
	
 sendKeys(editSearchTxtFld,name);
 

return this;
}




public SSLLogin toClickOnSearch() {
	
	click(toPressSearch);
	AndroidActions.toEnterKeyboardSearch();
	
	return this;
}



public SSLLogin toClickOnTextField() {
	
	click(clickonTxtFld);
	return this;
}
public SSLLogin toClickOnBuySection() {
	
	click(buyTxtFld);
	return this;
}


public SSLLogin toClickOnQuantityField(String value) {
 	
 sendKeys(quantityTxtFld, value);
 
 	return this;
 }

public SSLLogin toClickOnAdd() {
 	
 	click(addTxtFld);
 	return this;
 }


public SSLLogin toPlaceOrder() {
 	
 	click(placeorderTxtFld);
 	
 	
 return this;
 }



public SSLLogin toAddMore() {
 	
 	click(addmore);
 	
 	
 	
 	
 	return this;
 }


public SSLLogin toClickOnMotilalOswal() {
 	
 	click(placeorderTxtFld);
 	
 	
 	
 	
 	return this;
 }

*/
public String toGetSuccessRespose() {
 	
	return  getText(finalPopMessage,"txt");
	
 	
 	
 	

 }

}


