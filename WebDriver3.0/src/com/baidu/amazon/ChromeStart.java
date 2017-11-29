package com.baidu.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeStart {

	public static WebDriver driver;

	// 启动谷歌浏览器
	public void startChrome() {
		System.setProperty("webdriver.chrome.driver", "files\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	// 将浏览器窗口最大化
	public void maxWindow() {
		driver.manage().window().maximize();
	}

	// 导航到亚马逊网站
	public void getUrl() {
		driver.navigate().to("https://www.amazon.cn/");
	}

	// 跳转到登录界面
	public void goTo() {
		WebElement eleto = driver.findElement(By.xpath("//a[text()='我的亚马逊']"));
		eleto.click();
	}

	// 登录亚马逊网站
	public void login() {
		WebElement eleName = driver.findElement(By.xpath("//input[@id='ap_email']"));
		eleName.sendKeys("18211149006");// 输入自己的用户名
		WebElement elePassword = driver.findElement(By.xpath("//input[@id='ap_password']"));
		elePassword.sendKeys("123456");// 输入自己的密码
		WebElement elelogin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		elelogin.click();
	}

	// 搜索鞋的品牌阿迪达斯，男士
	public void input() {
		WebElement eleInput = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		eleInput.sendKeys("阿迪达斯 男");
		WebElement eleSubmit = driver.findElement(By.xpath("//input[@class='nav-input']"));
		eleSubmit.click();
	}

	// 增加筛选条件为鞋靴
	public void choose() {
		WebElement eleSelect = driver.findElement(By.cssSelector("#searchDropdownBox"));
		Select select = new Select(eleSelect);
		select.selectByIndex(32);
	}

	// 选择喜欢的一双鞋，查看其详细信息
	public void look() {
		WebElement eleShooe = driver.findElement(By.xpath("//span[@class='a-color-secondary']"));
		eleShooe.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//select[@class='a-native-dropdown']"));
			}
		}).isDisplayed();
	}

	// 跳转到新的窗口
	public void gotoNewWindow() {
		String strOldHandle = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			if (winHandle.equals(strOldHandle)) {
				continue;
			}
			driver.switchTo().window(winHandle);
			break;
		}
	}

	// 进入详细详情界面选择尺寸
	public static void chooseSize() {

		WebElement eleSize = driver.findElement(By.xpath("//select[@class='a-native-dropdown']"));
		Select selectSize = new Select(eleSize);
		selectSize.selectByIndex(10);
	}

	// 加入购物车
	public void ShoopingCar() {
		WebElement shooping = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		shooping.click();
	}

	// 在做一次导航跳转
	public void gotoNextWindow() {
		String stroNextHandle = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			if (winHandle.equals(stroNextHandle)) {
				continue;
			}
			driver.switchTo().window(winHandle);
			break;
		}
	}

	// 进行结算
	public void settle() {
		WebElement eleSettle = driver.findElement(By.xpath("//a[@class='a-button-text a-text-center']"));
		eleSettle.click();
	}

}
