package com.framework.basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.practise.exceptions.InvalidBrowserNameException;

public class BasepageKeywords {

	public static RemoteWebDriver driver;

	/**
	 * Launches the required browser
	 * 
	 * @param browserName
	 * @throws Exception
	 */
	public static void browserLaunch(String browserName) throws Exception {

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {

			driver = new SafariDriver();

		} else {

			throw new InvalidBrowserNameException(browserName);
		}
		System.out.println("Launched the browser successfully :" + browserName);
	}

	/**
	 * launching the URL
	 * 
	 * @param URL
	 */
	public static void launchURL(String URL) {
		driver.get(URL);
	}

	/**
	 * For maximizing the window
	 */
	public static void maximize() {
		driver.manage().window().maximize();
	}

	/**
	 * locating the element and performing the click action
	 * 
	 * @param locatorName
	 * @param value
	 */
	public static void clickonWebElements(String locatorName, String value) {
		if (locatorName.equalsIgnoreCase("id")) {
			driver.findElement(By.id(value)).click();

		} else if (locatorName.equalsIgnoreCase("name")) {

			driver.findElement(By.name(value)).click();

		} else if (locatorName.equalsIgnoreCase("className")) {

			driver.findElement(By.className(value)).click();

		} else if (locatorName.equalsIgnoreCase("linktext")) {

			driver.findElement(By.linkText(value)).click();

		} else if (locatorName.equalsIgnoreCase("partiallinktext")) {

			driver.findElement(By.partialLinkText(value)).click();

		} else if (locatorName.equalsIgnoreCase("tagName")) {

			driver.findElement(By.tagName(value)).click();

		} else if (locatorName.equalsIgnoreCase("xpath")) {

			driver.findElement(By.xpath(value)).click();

		} else if (locatorName.equalsIgnoreCase("cssselector")) {

			driver.findElement(By.cssSelector(value)).click();

		} else {
			System.err.println("No such locator found :" + locatorName);
		}
	}

	public static void enterTextvaluesintoElements(String locatorName, String value, String text) {
		if (locatorName.equalsIgnoreCase("id")) {
			driver.findElement(By.id(value)).sendKeys(text);

		} else if (locatorName.equalsIgnoreCase("name")) {

			driver.findElement(By.name(value)).sendKeys(text);

		} else if (locatorName.equalsIgnoreCase("className")) {

			driver.findElement(By.className(value)).sendKeys(text);

		} else if (locatorName.equalsIgnoreCase("linktext")) {

			driver.findElement(By.linkText(value)).sendKeys(text);

		} else if (locatorName.equalsIgnoreCase("partiallinktext")) {

			driver.findElement(By.partialLinkText(value)).sendKeys(text);

		} else if (locatorName.equalsIgnoreCase("tagName")) {

			driver.findElement(By.tagName(value)).sendKeys(text);

		} else if (locatorName.equalsIgnoreCase("xpath")) {

			driver.findElement(By.xpath(value)).sendKeys(text);

		} else if (locatorName.equalsIgnoreCase("cssselector")) {

			driver.findElement(By.cssSelector(value)).sendKeys(text);

		} else {
			System.err.println("No such locator found :" + locatorName);
		}

	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

}
