package com.baidu.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeStart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.cn/");
		WebElement element = driver.findElement(By.xpath("//span[text()='您好. 登录']"));
		element.click();
		WebElement eleName = driver.findElement(By.xpath("//input[@name='email']"));
		eleName.sendKeys("18211149006");
		WebElement elePwd = driver.findElement(By.xpath("//input[@id='ap_password']"));
		elePwd.sendKeys("123456");
		WebElement eleSub = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		eleSub.click();
		WebElement eleInput = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		eleInput.sendKeys("小米6");
		WebElement eleSearch = driver.findElement(By.xpath("//input[@class=\"nav-input\"]"));
		eleSearch.click();
		WebElement eleSelect = driver.findElement(By.cssSelector("#searchDropdownBox"));
		Select select = new Select(eleSelect);
		select.selectByIndex(2);
		// 一个节点,第二次操作就报错??
		WebElement eleSearch2 = driver.findElement(By.xpath("//input[@class=\"nav-input\"]"));
		eleSearch2.click();
		WebElement eleFree = driver.findElement(By
				.xpath("//a[@class=\"a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal\"]"));
		eleFree.click();
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				return driver.findElement(By.xpath(""));
			}

		}).isDisplayed();
	}

}
