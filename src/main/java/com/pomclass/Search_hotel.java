package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	
	public static WebDriver driver;
	public Search_hotel(WebDriver driver) {

		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	WebElement location;
	
	@FindBy(id = "hotels")
    WebElement hotels;
	
	@FindBy(id = "room_type")
	WebElement room;
	
	@FindBy(id = "room_nos")
	WebElement number;
	
	@FindBy(id = "datepick_in")
	WebElement checkin;

	@FindBy(id = "datepick_out")
	WebElement checkout;

	@FindBy(id = "adult_room")
	WebElement adult;
	
	@FindBy(id = "child_room")
	WebElement child;

	@FindBy(id = "Submit")
	WebElement submit;
	
	public static WebDriver getDriver(WebDriver driver) {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

	

	
	
	

}
