package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DanceTopPage {
	public static WebDriver driver;
	@FindBy(xpath = "(//p[@class=\"item-bottom\"])[1]")
	private WebElement top;

	public WebElement getTop() {
		return top;
	}

	public DanceTopPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
}
