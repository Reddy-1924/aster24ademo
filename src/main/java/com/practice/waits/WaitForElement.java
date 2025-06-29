package com.practice.waits;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.basePage.BasepageKeywords;

public class WaitForElement {
	
	public static WebDriverWait wait;
	
	static {
		wait=new WebDriverWait(BasepageKeywords.driver, Duration.ofSeconds(6000));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withMessage("element is not Present");
		
	}
	public  void elementToBePresent(WebElement element) {
		Pattern pattern = Pattern.compile("by\\.cssSelector:\\s*(.*?)'");
		Matcher matcher = pattern.matcher(element.toString());
		String locator="";
		if (matcher.find()) {
			locator=matcher.group(1);
			
		}
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(locator)));
	}
}
