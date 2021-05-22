package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking {

	public static WebDriver driver;
	public Booking(WebDriver driver) {

		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "my_itinerary")
	WebElement hotel;
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getHotel() {
		return hotel;
	}

	
	
}
