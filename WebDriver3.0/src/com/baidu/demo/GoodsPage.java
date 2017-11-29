package com.baidu.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodsPage {

	private WebDriver driver;

	@FindBy(xpath = "//img[@class='s-access-image cfMarker']")
	private WebElement oneElement;

	public GoodsPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private void printElement() {
		System.out.println(oneElement.getLocation());
	}
	
}
