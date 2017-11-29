package com.baidu.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaiduTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\work\\workspace\\WebDriver\\files\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\work\\workspace\\WebDriver\\files\\IEDriverServer.exe");
		System.setProperty("webdriver.edge.driver", "files\\MicrosoftWebDriver.exe");
		// WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.baidu.com/");
		// 定位到输入框
		WebElement element = driver.findElement(By.id("kw"));
		// 输入 GitChat
		element.sendKeys("GitChat");
	}

}
