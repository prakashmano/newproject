package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\extentreport\\report.html" ,
"pretty", "json:src\\test\\resource\\com\\json\\report.json"},
		features = "src\\test\\java\\com\\cucumber\\feature" , glue = {"com.cucumber.stepdefinition"} )
public class TestRunner {
	public static WebDriver driver;
	
@BeforeClass
public static void browserlaunch() {
	driver=baseclass.browserlaunch("chrome");

}
@AfterClass
public static void close() {

}
}
