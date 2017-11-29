package com.baidu.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaiduTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\work\\workspace\\WebDriver3.0\\files\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\work\\workspace\\WebDriver\\files\\IEDriverServer.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\work\\workspace\\WebDriver\\files\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new InternetExplorerDriver();
		driver.navigate().to("http://www.baidu.com");
		WebElement element = driver.findElement(By.id("kw"));
		//  ‰»Î GitChat
		element.sendKeys("GitChat");
		
	}

}
