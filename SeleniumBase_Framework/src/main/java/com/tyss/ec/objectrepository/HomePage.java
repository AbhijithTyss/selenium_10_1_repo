package com.tyss.ec.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.ecommerce.genericutility.WebDriverUtility;


public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "")
	private WebElement ele;

	public WebElement getEle() {
		return ele;
	}
	
	
	
}
