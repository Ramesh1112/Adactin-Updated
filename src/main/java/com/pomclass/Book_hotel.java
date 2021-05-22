package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {

	public static WebDriver driver;
	
	public Book_hotel(WebDriver driver) {

		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	WebElement fname;
	
	@FindBy(id = "last_name")
	WebElement lname;
	
	@FindBy(id = "address")
	WebElement address;
	
	@FindBy(id = "cc_num")
	WebElement cnumber;
	
	@FindBy(id = "cc_type")
	WebElement ctype;
	
	@FindBy(id = "cc_exp_month")
	WebElement month;
	
	@FindBy(id = "cc_exp_year")
	WebElement year;
	
	@FindBy(id = "cc_cvv")
	WebElement cvv;
	
	@FindBy(id = "book_now")
	WebElement book;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCnumber() {
		return cnumber;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	
	
	
	
}
