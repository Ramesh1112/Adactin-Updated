package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	
	public static WebDriver driver;
	
	public Select_hotel(WebDriver driver) {

		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	WebElement box;
	
	@FindBy(id = "continue")
	WebElement select;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getBox() {
		return box;
	}

	public WebElement getSelect() {
		return select;
	}

	
	
	

	
	

}
