package com.baidu.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	@FindBy(xpath = "//a[text()='我的亚马逊']")
	private WebElement loginLink;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// 点击登录按钮
	public void loginLink() {
		loginLink.click();
	}

	//跳转到首页
	public void navigateTourl(String url) {
		driver.get(url);
	}

}
