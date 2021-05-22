package com.stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Baseclass.BaseClass;
import com.adactin_helper.File_Reader_Manager;
import com.adactin_helper.Page_Object_Manager;
import com.pomclass.Book_hotel;
import com.pomclass.Booking;
import com.pomclass.Login;
import com.pomclass.Search_hotel;
import com.pomclass.Select_hotel;
import com.pomclass.logout;
import com.testrunner.Test_runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_defination extends BaseClass {
	public static WebDriver driver=Test_runner.driver;
	public static Page_Object_Manager p = new Page_Object_Manager(driver);

	@Given("^User Lauching Adactin application$")
	public void user_Lauching_Adactin_application() throws Throwable {
    String geturl = File_Reader_Manager.getinstances().getinstanceCR().geturl();
		openUrl(geturl);
	}

	@When("^User Enter \"([^\"]*)\" In User field$")
	public void user_Enter_In_User_field(String username) throws Throwable {
		inputValue(p.getLogin().getUsername(driver), username);
	}

	@When("^User Enter \"([^\"]*)\" In Password field$")
	public void user_Enter_In_Password_field(String password) throws Throwable {
		inputValue(p.getLogin().getPassword(driver), password );
	}


	@Then("^User Enter Login Button$")
	public void user_Enter_Login_Button() throws Throwable {
		clickOnElement(p.getLogin().getLogin(driver));
	}


	@When("^User Need To Select Location In Adactin Application$")
	public void user_Need_To_Select_Location_In_Adactin_Application() throws Throwable {
		dropdowns2(p.getSearch().getLocation(), "Sydney");
	}

	

	@When("^User Need To Select Hotels In Adactin Application$")
	public void user_Need_To_Select_Hotels_In_Adactin_Application() throws Throwable {
     dropdowns2(p.getSearch().getHotels(), "Hotel Creek");
	}

	@When("^User Need To Select Room In Adactin Application$")
	public void user_Need_To_Select_Room_In_Adactin_Application() throws Throwable {
    dropdowns2(p.getSearch().getRoom(), "Double");
	}

	@When("^User Need To Select No\\.Of\\.Rooms In Adactin Application$")
	public void user_Need_To_Select_No_Of_Rooms_In_Adactin_Application() throws Throwable {
    dropdowns2(p.getSearch().getNumber(), "1");
	}

	@When("^User Need To Select Check In Date In Adactin Application$")
	public void user_Need_To_Select_Check_In_Date_In_Adactin_Application() throws Throwable {
    inputValue(p.getSearch().getCheckin(), "01/01/2021");
	}

	@When("^User Need To Select Check Out Date In Adactin Application$")
	public void user_Need_To_Select_Check_Out_Date_In_Adactin_Application() throws Throwable {
     inputValue(p.getSearch().getCheckout(), "01/02/2021");
	}

	@When("^User Need To Select Adult Room In Adactin Application$")
	public void user_Need_To_Select_Adult_Room_In_Adactin_Application() throws Throwable {
    dropdowns2(p.getSearch().getAdult(), "2");
	}

	@When("^User Need To Select Children Rooms In Adactin Application$")
	public void user_Need_To_Select_Children_Rooms_In_Adactin_Application() throws Throwable {
		dropdowns2(p.getSearch().getChild(), "2");

	}

	@Then("^User Need To Click Search Button In Adactin Application$")
	public void user_Need_To_Click_Search_Button_In_Adactin_Application() throws Throwable {
    clickOnElement(p.getSearch().getSubmit());
	}
    
	@When("^User Need To Select Hotel In Adactin Application$")
	public void user_Need_To_Select_Hotel_In_Adactin_Application() throws Throwable {
    clickOnElement(p.getselect().getBox());
	}

	@Then("^User Need To Click Continue Button In Adactin Application$")
	public void user_Need_To_Click_Continue_Button_In_Adactin_Application() throws Throwable {
    clickOnElement(p.getselect().getSelect());
	}
	
	@When("^User Need To Enter A First Name In Adactin Application$")
	public void user_Need_To_Enter_A_First_Name_In_Adactin_Application() throws Throwable {
    inputValue(p.getbook().getFname(),"Ramesh");
	}

	@When("^User Need To Enter A Last Name In Adactin Application$")
	public void user_Need_To_Enter_A_Last_Name_In_Adactin_Application() throws Throwable {
    inputValue(p.getbook().getLname(), "Ram");
	}

	@When("^User Need To Enter A Billing Address Name In Adactin Application$")
	public void user_Need_To_Enter_A_Billing_Address_Name_In_Adactin_Application() throws Throwable {
    inputValue(p.getbook().getAddress(), "12345");
	}

	@When("^User Need To Enter A Credit Card No In Adactin Application$")
	public void user_Need_To_Enter_A_Credit_Card_No_In_Adactin_Application() throws Throwable {
    inputValue(p.getbook().getCnumber(), "1234567891234567");
	}

	@When("^User Need To Enter A Credit Card Type In Adactin Application$")
	public void user_Need_To_Enter_A_Credit_Card_Type_In_Adactin_Application() throws Throwable {
    dropdowns2(p.getbook().getCtype(), "VISA");
	}

	@When("^User Need To Enter A Expiry Date In Adactin Application$")
	public void user_Need_To_Enter_A_Expiry_Date_In_Adactin_Application() throws Throwable {
    dropdowns2(p.getbook().getMonth(), "2");
	}

	@When("^User Need To Enter A Expiry Year In Adactin Application$")
	public void user_Need_To_Enter_A_Expiry_Year_In_Adactin_Application() throws Throwable {
		dropdowns2(p.getbook().getYear(), "2021");

	}

	@When("^User Need To Enter A CVV Number In Adactin Application$")
	public void user_Need_To_Enter_A_CVV_Number_In_Adactin_Application() throws Throwable {
     inputValue(p.getbook().getCvv(), "123");
	}

	@Then("^User Need To Click Book Now Button In Adactin Application$")
	public void user_Need_To_Click_Book_Now_Button_In_Adactin_Application() throws Throwable {
		clickOnElement(p.getbook().getBook());

	}

	
	@Then("^User Need to Click My Itinerary Button In Adactin Application$")
	public void user_Need_to_Click_My_Itinerary_Button_In_Adactin_Application() throws Throwable {
 //   clickOnElement(p.getbooking().getHotel());
	}
    
	@Then("^User Need to Click Logout Button In Adactin Application$")
	public void user_Need_to_Click_Logout_Button_In_Adactin_Application() throws Throwable {
    clickOnElement(p.getlogout().getLogout());
	}

}
