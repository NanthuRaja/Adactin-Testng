package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions ac;
	public static Robot ro;

	public static void getdriver(String name) {

		if (name.equalsIgnoreCase("chromedriver")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (name.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void enterText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void mouseOver(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element).click().perform();
	}

	public static void doubleClick(WebElement element) {
		ac.doubleClick(element).perform();
	}

	public static void rightClick(WebElement element) {
		ac.contextClick(element).perform();
	}

	public static void selectText(WebElement element, String s) {
		Select sel = new Select(element);
		sel.selectByVisibleText(s);
	}

	public static void selectValue(WebElement element, String s) {
		Select sel = new Select(element);
		sel.selectByValue(s);
	}

	public static void selectIndex(WebElement element, int a) {
		Select sel = new Select(element);
		sel.selectByIndex(a);
	}
}
