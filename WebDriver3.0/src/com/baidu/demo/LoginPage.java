package com.baidu.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement loginPhone;

	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement loginPassword;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setPhone(String phone) {
		loginPhone.sendKeys(phone);
	}

	public void setPassword(String password) {
		loginPassword.sendKeys(password);
	}

	// µã»÷µÇÂ¼°´Å¥
	public void login() {
		loginButton.click();
	}

}
