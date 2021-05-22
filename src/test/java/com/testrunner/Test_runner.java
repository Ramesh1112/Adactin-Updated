package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.BaseClass;
import com.adactin_helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src//test//java//com//futurefile", glue = "com.stepdefination", monochrome = true, dryRun = false,strict = false,
tags = "@smoke,@sanity,~@regression",
plugin = {
		"html:Report/Cucumber_Report",
		"pretty",
		"json:report/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Extent_Report/Ex_report.html"
		
		
		
}
)
@RunWith(Cucumber.class)
public class Test_runner {
	public static WebDriver driver;

	@BeforeClass
	public static void Setup() throws Throwable {
		String getbrowser = File_Reader_Manager.getinstances().getinstanceCR().getbrowser();
		driver = BaseClass.browserLaunch(getbrowser);
	}

	@AfterClass
	public static void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
