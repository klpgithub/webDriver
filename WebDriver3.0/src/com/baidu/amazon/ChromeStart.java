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

	// �����ȸ������
	public void startChrome() {
		System.setProperty("webdriver.chrome.driver", "files\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	// ��������������
	public void maxWindow() {
		driver.manage().window().maximize();
	}

	// ����������ѷ��վ
	public void getUrl() {
		driver.navigate().to("https://www.amazon.cn/");
	}

	// ��ת����¼����
	public void goTo() {
		WebElement eleto = driver.findElement(By.xpath("//a[text()='�ҵ�����ѷ']"));
		eleto.click();
	}

	// ��¼����ѷ��վ
	public void login() {
		WebElement eleName = driver.findElement(By.xpath("//input[@id='ap_email']"));
		eleName.sendKeys("18211149006");// �����Լ����û���
		WebElement elePassword = driver.findElement(By.xpath("//input[@id='ap_password']"));
		elePassword.sendKeys("123456");// �����Լ�������
		WebElement elelogin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		elelogin.click();
	}

	// ����Ь��Ʒ�ư��ϴ�˹����ʿ
	public void input() {
		WebElement eleInput = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		eleInput.sendKeys("���ϴ�˹ ��");
		WebElement eleSubmit = driver.findElement(By.xpath("//input[@class='nav-input']"));
		eleSubmit.click();
	}

	// ����ɸѡ����ΪЬѥ
	public void choose() {
		WebElement eleSelect = driver.findElement(By.cssSelector("#searchDropdownBox"));
		Select select = new Select(eleSelect);
		select.selectByIndex(32);
	}

	// ѡ��ϲ����һ˫Ь���鿴����ϸ��Ϣ
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

	// ��ת���µĴ���
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

	// ������ϸ�������ѡ��ߴ�
	public static void chooseSize() {

		WebElement eleSize = driver.findElement(By.xpath("//select[@class='a-native-dropdown']"));
		Select selectSize = new Select(eleSize);
		selectSize.selectByIndex(10);
	}

	// ���빺�ﳵ
	public void ShoopingCar() {
		WebElement shooping = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		shooping.click();
	}

	// ����һ�ε�����ת
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

	// ���н���
	public void settle() {
		WebElement eleSettle = driver.findElement(By.xpath("//a[@class='a-button-text a-text-center']"));
		eleSettle.click();
	}

}
