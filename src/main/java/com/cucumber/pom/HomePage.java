package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[@class=\"dh_li_aa\"])[1]")
	private WebElement women;
	@FindBy(xpath = "//a[@href=\"https://test.danceshopper.com/womens-dance-tops\"]")
	private WebElement dancetop;

	
	public WebElement getWomen() {
		return women;
	}

	public WebElement getDancetop() {
		return dancetop;
	}

	
	
	public HomePage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}
	

	

}
