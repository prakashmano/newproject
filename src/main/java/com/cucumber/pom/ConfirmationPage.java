package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	public static WebDriver driver;
	@FindBy(xpath = "//li[@id=\"ddlSize\"]")
	private WebElement checkbox;
	@FindBy(xpath = "//li[@id=\"ddlSize\"]")
	private WebElement confirm;

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public ConfirmationPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

}
