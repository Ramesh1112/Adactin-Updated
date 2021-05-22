package com.adactin_helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.pomclass.Book_hotel;
import com.pomclass.Booking;
import com.pomclass.Login;
import com.pomclass.Search_hotel;
import com.pomclass.Select_hotel;
import com.pomclass.logout;

public class Page_Object_Manager {
	
	public WebDriver driver;
	private Login l;
	public Page_Object_Manager(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
public Login getLogin() {
	// TODO Auto-generated method stub
 l=new Login(driver);
return l;
}
public Search_hotel getSearch() {
	// TODO Auto-generated method stub
Search_hotel sh = new Search_hotel(driver);
return sh;

}
public Select_hotel getselect() {
	// TODO Auto-generated method stub
Select_hotel sh1= new Select_hotel(driver);
return sh1;
}
public Book_hotel getbook() {
	// TODO Auto-generated method stub
Book_hotel bh = new Book_hotel(driver);
return bh;
}

public Booking getbooking() {
	// TODO Auto-generated method stub
Booking b = new Booking(driver);
return b;
}

public logout getlogout() {
	// TODO Auto-generated method stub
logout l = new logout(driver);
return l;
}

}
