package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
public static WebDriver driver;

public logout(WebDriver driver) {

	this.driver=driver;
	
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//a[@href='Logout.php']")
WebElement logout;

public static WebDriver getDriver() {
	return driver;
}

public WebElement getLogout() {
	return logout;
}


}
