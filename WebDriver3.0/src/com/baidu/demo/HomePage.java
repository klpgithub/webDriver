package com.baidu.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	@FindBy(xpath = "//a[text()='�ҵ�����ѷ']")
	private WebElement loginLink;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// �����¼��ť
	public void loginLink() {
		loginLink.click();
	}

	//��ת����ҳ
	public void navigateTourl(String url) {
		driver.get(url);
	}

}
