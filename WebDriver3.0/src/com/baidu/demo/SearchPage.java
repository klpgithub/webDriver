package com.baidu.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	private WebDriver driver;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchInputElement;

	@FindBy(xpath = "//input[@class='nav-input']")
	private WebElement searchButton;

	public void setSearchParam(String search) {
		searchInputElement.sendKeys(search);
	}

	public void search() {
		searchButton.click();
	}

	public SearchPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
