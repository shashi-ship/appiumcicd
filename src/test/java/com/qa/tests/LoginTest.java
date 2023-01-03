package com.qa.tests;

import org.testng.annotations.Test;


import com.qa.BaseTest;
import com.qa.pages.BrokerView;
import com.qa.pages.Pages;
import com.qa.pages.SSLLogin;
import com.qa.pages.SSLSetUp;
import com.qa.pages.ToPlaceOrder;
import com.qa.pages.VendorWebView;
import com.qa.utils.AndroidActions;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;


import org.testng.annotations.AfterClass;

public class LoginTest extends BaseTest {

	
	@BeforeClass
	public void beforeClass() {

	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeMethod
	public void beforeMethod(Method m) {

		
		System.out.println("\n" + "********* Strating the Test :- " + m.getName() + "*******" + "\n");
	}

	@AfterMethod
	public void afterMethod() {
	}

	@Test
	public void loginFeature() throws InterruptedException {

		
		SSLLogin loginPage = new SSLLogin();

		loginPage.enterUsername("Shashi_9000");
		loginPage.pressLoginBtn();

		SSLSetUp sslSetUp = new SSLSetUp();
		sslSetUp.toClickOnEnvirnoment();

		sslSetUp.toClickOnLaprechaun();
		sslSetUp.toClickOnSetup();

		sslSetUp.toClickOnalert();

		sslSetUp.toClickOnSSLBtn();

		ToPlaceOrder toPlaceOrder = new ToPlaceOrder();
		toPlaceOrder.toClickOnSearchBox();
		toPlaceOrder.toEnterValueOnSearchBox("IDEA");
		AndroidActions.toEnterKeyboardSearch();
         
		toPlaceOrder.toClickOnTextField();
		toPlaceOrder.toClickOnBuySection();
		toPlaceOrder.toClickOnQuantityField("6");
		toPlaceOrder.toClickOnAdd();
		toPlaceOrder.toPlaceOrder();
		
		Thread.sleep(2000);

		Pages pages=new Pages();
		pages.toSwitch(props.getProperty("WebSmallCase"));
		

		BrokerView brokerView=new BrokerView();
		brokerView.toClickOnBroker("Motilal Oswal");

		pages.toSwitch(props.getProperty("NativeView"));

		pages.toSwitch(props.getProperty("WebChromeView"));

		VendorWebView vendorView=new VendorWebView();
		Thread.sleep(2000);
		vendorView.toClickOnReview();
		
		Thread.sleep(2000);
		
		vendorView.toClickOnConfirmedOrder();
		Thread.sleep(2000);
		vendorView.toClickOnPlacedOrder();
		
		pages.toSwitch(props.getProperty("NativeView"));

		

		String ActualResponse = loginPage.toGetSuccessRespose();

		System.out.println("Actual Respose is :- " + ActualResponse.toString());

	}

}
