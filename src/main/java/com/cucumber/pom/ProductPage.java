package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public static WebDriver driver;
	@FindBy(xpath = "//li[@id=\"ddlSize\"]")
	private WebElement size;
	@FindBy(xpath = "(//li[@class=\"ddlListData\"])[1]")
	private WebElement xsmall;
	@FindBy(xpath = "(//a[@colorname=\"Burgundy\"])[2]")
	private WebElement color;
	@FindBy(xpath = "//botton[@id=\"btnBuyNow\"]")
	private WebElement addtobag;

	public WebElement getAddtobag() {
		return addtobag;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getXsmall() {
		return xsmall;
	}

	public WebElement getColor() {
		return color;
	}

	public ProductPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}
}
