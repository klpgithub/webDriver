package com.baidu.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	private static WebDriver driver;

	public static void main(String[] args) {
		inialize();
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		SearchPage searchPage = new SearchPage(driver);
		homePage.navigateTourl("https://www.amazon.cn/");
		homePage.loginLink();
		loginPage.setPhone("18211149006");
		loginPage.setPassword("123456");
		loginPage.login();
		searchPage.setSearchParam("selenium");
		searchPage.search();
		// driver.close();
	}

	public static void inialize() {
		System.setProperty("webdriver.chrome.driver", "files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
