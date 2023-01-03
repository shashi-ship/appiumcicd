package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.BaseTest;

public class BrokerView extends BaseTest {
	
	
	public void toClickOnBroker(String username) {
    	
		List<WebElement> Products = driver.findElements(By.cssSelector("div.swipeableFold__2vMXX"));

		for (int i = 0; i < Products.size(); i++) {

			int flag = 0;

			List<WebElement> name = Products.get(i).findElements(By.className("d-flex"));

			for (int j = 0; j < name.size(); j++) {

				String value = name.get(j).getText();

				if (value.contains(username)) {

					flag++;
					System.out.println("Print traces ");
					name.get(j).findElement(By.xpath("//span[text()='Motilal Oswal']")).click();

				}

			}

			if (flag == 0) {

				driver.findElement(By.xpath("//div[@class='button__1sZZG']")).click();

			}

		}
	    	
	    
	    	
	    }

}
