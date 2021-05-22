package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public static WebDriver driver;

	public Login(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(id = "login")
	WebElement login;

//	public static WebDriver getDriver(WebDriver driver) {
//		return driver;
//	}

	public WebElement getUsername(WebDriver driver) {
		return username;
	}

	public WebElement getPassword(WebDriver driver) {
		return password;
	}

	public WebElement getLogin(WebDriver driver) {
		return login;
	}

}
