package com.cucumber.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.baseclass;
import com.cucumber.testrunner.TestRunner;
import com.cucumber.utilities.PageObjectManager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver=TestRunner.driver;
	PageObjectManager pg= new PageObjectManager(driver);
	
	
	@Given("^User should be in the danceshopper page$")
    public void user_should_be_in_the_danceshopper_page() throws Throwable {
         baseclass.geturl("https://test.danceshopper.com/");
    }

    @When("^User mousehover women category and select dancetop category$")
    public void user_mousehover_women_category_and_select_dancetop_category() throws Throwable {
    	baseclass.mousehover(pg.getHp().getWomen());
    	baseclass.clickelement(pg.getHp().getDancetop());
    }

    @When("^User select the first product$")
    public void user_select_the_first_product() throws Throwable {
    	baseclass.clickelement(pg.getDtp().getTop());
    }

    @When("^User select the size$")
    public void user_select_the_size() throws Throwable {
    	baseclass.clickelement(pg.getPp().getSize());
    }

    @When("^User select the color$")
    public void user_select_the_color() throws Throwable {
    	baseclass.clickelement(pg.getPp().getXsmall());
    	baseclass.clickelement(pg.getPp().getColor());
    }

    @When("^User click on addtobag$")
    public void user_click_on_addtobag() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	baseclass.clickelement(pg.getPp().getAddtobag());
    }

    
}
