package com.qa.pages;

import org.openqa.selenium.WebElement;

import com.qa.BaseTest;
import com.qa.utils.AndroidActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ToPlaceOrder extends BaseTest {
	
	@AndroidFindBy(accessibility="Search") private WebElement searchTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/search_src_text") private WebElement editSearchTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/search_src_text") private WebElement toClickOnTxtFld;
	
	@AndroidFindBy(xpath=".//android.widget.EditText[@text='IDEA']") private WebElement toPressSearch;


	@AndroidFindBy(xpath=".//android.widget.TextView[@text='IDEA']") private WebElement clickonTxtFld;
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@content-desc=\"BUY\"]/android.widget.TextView") private WebElement buyTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/transaction_qty_et") private WebElement quantityTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/transaction_add_bt") private WebElement addTxtFld;
	@AndroidFindBy(id="in.smallcase.gateway.sample:id/transaction_order_bt") private WebElement placeorderTxtFld;

   public void toClickOnSearchBox() {
	
	click(searchTxtFld);
	
}

public void toEnterValueOnSearchBox(String name) {
	
 sendKeys(editSearchTxtFld,name);
 


}




public void toClickOnSearch() {
	
	click(toPressSearch);
	
	//AndroidActions.toEnterKeyboardSearch();
	

}



public void toClickOnTextField() {
	
	click(clickonTxtFld);
}
	
public void toClickOnBuySection() {
	
	click(buyTxtFld);
	
}


public void toClickOnQuantityField(String value) {
 	
 sendKeys(quantityTxtFld, value);
 
 	
 }

public void toClickOnAdd() {
 	
 	click(addTxtFld);
 	
 }


public void toPlaceOrder() {
 	
 	click(placeorderTxtFld);
 	
 	
 	

 }
}