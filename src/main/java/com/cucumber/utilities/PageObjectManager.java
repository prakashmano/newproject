package com.cucumber.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.pom.DanceTopPage;
import com.cucumber.pom.HomePage;
import com.cucumber.pom.ProductPage;

public class PageObjectManager {
	public static WebDriver driver;

	private HomePage hp;
	private DanceTopPage dtp;
	private ProductPage pp;

	public HomePage getHp() {
		if (hp == null) {
			hp = new HomePage(driver);
		}
		return hp;
	}

	public DanceTopPage getDtp() {
		if (dtp == null) {
			dtp = new DanceTopPage(driver);
		}
		return dtp;
	}

	public ProductPage getPp() {
		if (pp == null) {
			pp = new ProductPage(driver);
		}
		return pp;
	}

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
}
